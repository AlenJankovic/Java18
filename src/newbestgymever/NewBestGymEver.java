/*
 * 
 * 
 * 
 */

package newbestgymever;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NewBestGymEver {

    public static void main(String[] args) throws IOException {

        String firstLine;
        String secondLine;
        Path inFilePath;
        Path outFilePath;
        
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);

       
        List<GymKund> personLista = new ArrayList<>();

        String[] personDataPartsFirstLine = new String[1];
        String[] personDataSecondLine = new String[2];
        inFilePath = Paths.get("src\\newbestgymever\\customers.txt");
        outFilePath = Paths.get("src\\newbestgymever\\medlemar.txt");
        
        try (Scanner fileScanner = new Scanner(inFilePath)) {

            while (fileScanner.hasNext()) {
                firstLine = fileScanner.nextLine();

                String line = firstLine.trim();

                personDataPartsFirstLine = firstLine.split(",");

                if (fileScanner.hasNext()) {
                    secondLine = fileScanner.nextLine();

                    personDataSecondLine = secondLine.trim().split("-");

                    GymKund kund = new GymKund(personDataPartsFirstLine[0], personDataPartsFirstLine[1], personDataSecondLine[0], personDataSecondLine[1],
                            personDataSecondLine[2]);

                    personLista.add(kund);
                }
            }

            for (int i = 0; i < personLista.size(); i++) {
                boolean stop = true;

                String input = JOptionPane.showInputDialog("Skriv namn");

                if (input == null) {
                    System.exit(0);
                }

                while (stop) {
                    for (GymKund s : personLista) {

                        String name1 = s.namn.trim();
                        String namn = personLista.get(i).getNamn(name1);
                        String personNummer = personLista.get(i).getPersonNummer(s.personNummer);

                        int år = Integer.parseInt(personLista.get(i).getÅr(s.år));
                        int månad = Integer.parseInt(personLista.get(i).getMånad(s.månad));
                        int dag = Integer.parseInt(personLista.get(i).getDag(s.dag));
                       
                        try {
                            LocalDateTime medlemFrån = LocalDateTime.of(år, månad, dag, 0, 0, 0);
                            LocalDateTime datum = LocalDateTime.of(year, month, day, 0, 0, 0);

                            long duration = (Duration.between(medlemFrån, datum).toDays());

                            if (input.equals(namn) || input.equals(personNummer)) {
                                
                                System.out.println(år + " " + månad + " " + dag);
                                System.out.println(year + " " + month + " " + day);
                                System.out.println(duration);
                               
                                if (duration < 365) {
                                    System.out.println(s.namn + " är medlem och är nuvarande kund");
                                    
                                    //PrintWriter w = new PrintWriter(
                                    //Files.newBufferedWriter(outFilePath));
                                    
                                    PrintWriter output = new PrintWriter(new FileOutputStream("src\\newbestgymever\\medlemar.txt", true)); 
                                    output.print(s.getNamn(s.namn)+" med personnummret: " +s.getPersonNummer(personNummer)+
                                                 " Har Varit och tränat: "+datum.format(DateTimeFormatter.ISO_DATE)+ "\n");
                                   output.close();
                                } else {
                                    System.out.println(s.namn + " är en före detta kund");
                                }
                                break;

                            }
                        } catch (Exception e) {
                            System.out.println("Fel datum format februari");
                        }

                    }
                    stop = false;
                }

            }
        }

    }

   
}
