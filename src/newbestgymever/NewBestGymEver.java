/*
 * 
 * 
 * 
 */

package newbestgymever;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);

        // System.out.println(year);
        // System.out.println(month);
        // System.out.println(day);
        List<GymKund> personLista = new ArrayList<>();

        String[] personDataPartsFirstLine = new String[1];
        String[] personDataSecondLine = new String[2];
        inFilePath = Paths.get("src\\newbestgymever\\customers.txt");

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

            for (int i = 1; i < personLista.size(); i++) {
                boolean stop = true;

                String input = JOptionPane.showInputDialog("Skriv namn");

                while (stop) {
                    for (GymKund s : personLista) {
                        String name1 = s.namn.trim();
                        String namn = personLista.get(i).getNamn(name1);
                        String personNummer = personLista.get(i).getNamn(s.personNummer);
                        
                        int år = Integer.parseInt(personLista.get(i).getÅr(s.år));
                        int månad = Integer.parseInt(personLista.get(i).getMånad(s.månad));
                        int dag = Integer.parseInt(personLista.get(i).getDag(s.dag));

                        if (input.equals(namn)||input.equals(personNummer)) {
                            System.out.println(s.namn + " Finns i listan och är ");
                            break;
                        }

                    }
                    stop = false;
                }

            }
        }

    }
}
