package Genetica;

import java.util.Arrays;

/**
 *
 * @author Crespo Bravo Gerardo
 */
public class TranscripcionRNA {

    String acido_n = "";
    String acido_m = "";
    final int renglon = 2;
    int columna = 50;
    String[][] Base;

    public String[][] ADN() {

        Base = new String[renglon][columna];

        for (int i = 0; i < renglon; i++) {
            for (int j = 0; j < columna; j++) {

                //Vamos a llenar el primer renglon
                double x = Math.random();

                if (x <= 0.25) {
                    acido_n = "T"; //Contraparte A
                }
                if (x <= 0.50 && x > 0.25) {
                    acido_n = "C"; //Contraparte G
                }
                if (x <= 0.75 && x > 0.50) {
                    acido_n = "G"; //Contraparte C
                }
                if (x <= 1 && x > 0.75) {
                    acido_n = "A"; //Contraparte T
                }

                //Vamos a asignar contrapartes en el segundo renglon
                if (i <= 0) {
                    Base[i][j] = acido_n;
                } //Hasta aquí se llena el primer renglon 
                else {
                    if (Base[0][j].equals("T")) { //A partir de aquí comparamos los indices del anterior renglon
                        acido_m = "A";
                    }

                    if (Base[0][j].equals("C")) {
                        acido_m = "G";
                    }

                    if (Base[0][j].equals("G")) {
                        acido_m = "C";
                    }

                    if (Base[0][j].equals("A")) {
                        acido_m = "T";
                    }
                    Base[i][j] = acido_m;
                }

                System.out.print(Base[i][j] + "  ");
            }
            System.out.println("");
        }

        return Base;
    }

    public String[] ARNm() {

        String[] Arn = new String[columna];
        double y = Math.random();
        String acido_o = "";

        if (y <= 0.50) { //Lee el renglon 1 del arreglo o la cadena de ADN  1
            for (int i = 0; i < renglon; i++) {
                for (int j = 0; j < columna; j++) {
                    if (Base[0][j].equals("T")) {
                        acido_o = "U";
                    }
                    if (Base[0][j].equals("G")) {
                        acido_o = "G";
                    }
                    if (Base[0][j].equals("C")) {
                        acido_o = "C";
                    }
                    if (Base[0][j].equals("A")) {
                        acido_o = "A";
                    }

                    Arn[j] = acido_o;
                }
                System.out.println("");
            }
            for (int j = 0; j < columna; j++) {
                System.out.print(Arn[j] + "  ");
            }
        } else { //Lee el renglon 2 del arreglo o la cadena de ADN  2       
            for (int i = 0; i < renglon; i++) {
                for (int j = 0; j < columna; j++) {
                    if (Base[1][j].equals("T")) {
                        acido_o = "U";
                    }
                    if (Base[1][j].equals("G")) {
                        acido_o = "G";
                    }
                    if (Base[1][j].equals("C")) {
                        acido_o = "C";
                    }
                    if (Base[1][j].equals("A")) {
                        acido_o = "A";
                    }

                    Arn[j] = acido_o;
                }
                System.out.println("");
            }
            for (int j = 0; j < columna; j++) {
                System.out.print(Arn[j] + "  ");
            }
        }

        return Arn;
    }

}
