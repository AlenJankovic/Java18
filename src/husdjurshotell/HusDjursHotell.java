

package husdjurshotell;

import javax.swing.JOptionPane;

public class HusDjursHotell {

    public static void main(String[] args) {

        Djur sixten = new Hund("Sixten", 5, "hundfoder");
        Djur dogge = new Hund("Dogge", 10, "hundfoder");

        Djur venus = new Katt("Venus", 5, "kattfoder");
        Djur ove = new Katt("Ove", 3, "kattfoder");

        Djur hypno = new Orm("Hypno", 1, "ormpellets", 20);

        while (true) {
            String djur = JOptionPane.showInputDialog("Vilket djur ska matas?");

            if (djur == null) {
                System.exit(0);
            } //else if (isEmpty(djur)) {
              //  JOptionPane.showMessageDialog(null, "Skriv namnet på djuret du vill mata");
           // }

            switch (djur) {

                case "Sixten":
                    JOptionPane.showMessageDialog(null, sixten.getNamn() + " " + "äter " + sixten.portion() + " gram" + " " + sixten.typAvMat());
                    break;
                case "Dogge":
                    JOptionPane.showMessageDialog(null, dogge.getNamn() + " " + "äter " + dogge.portion() + " gram" + " " + dogge.typAvMat());
                    break;
                case "Venus":
                    JOptionPane.showMessageDialog(null, venus.getNamn() + " " + "äter " + venus.portion() + " gram" + " " + venus.typAvMat());
                    break;
                case "Ove":
                    JOptionPane.showMessageDialog(null, ove.getNamn() + " " + "äter " + ove.portion() + " gram" + " " + ove.typAvMat());
                    break;
                case "Hypno":
                    JOptionPane.showMessageDialog(null, hypno.getNamn() + " " + "äter " + hypno.portion() + " gram" + " " + hypno.typAvMat());
                    break;
            }

        }
    }

    //private static boolean isEmpty(String djur) {
       // if(djur.length() <= 1)
         //   return true;
       // return false;
    }

