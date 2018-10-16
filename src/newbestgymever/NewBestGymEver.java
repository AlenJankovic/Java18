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
import java.util.List;
import java.util.Scanner;

public class NewBestGymEver {

    public static void main(String[] args) throws IOException {

        String firstLine;
        String secondLine;
        Path inFilePath;

        
        ArrayList<GymKund> personList = new ArrayList<>();

        String[] personDataPartsFirstLine = new String[1];
        String[] personDataSecondLine = new String[2];
        inFilePath = Paths.get("src\\newbestgymever\\customers.txt");

        try (Scanner fileScanner = new Scanner(inFilePath)) {

            while (fileScanner.hasNext()) {
                firstLine = fileScanner.nextLine();

                personDataPartsFirstLine = firstLine.trim().split(",");

                if (fileScanner.hasNext()) {
                    secondLine = fileScanner.nextLine();

                    personDataSecondLine = secondLine.split("-");
                }

                // System.out.println(personDataSecondLine[2]);
                GymKund kund = new GymKund(personDataPartsFirstLine[1], personDataPartsFirstLine[0], personDataSecondLine[0], personDataSecondLine[1],
                        personDataSecondLine[2]);

               personList.add(kund);

            }
            
        }
//
//                for (String i : personDataPartsFirstLine) {
//                    System.out.println(i);
//
//                }
//                for (String j : personDataSecondLine) {
//                    System.out.println(j);
//                }
    }

}


