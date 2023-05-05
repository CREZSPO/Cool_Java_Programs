/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TranscripcionGenetica;

import java.util.Arrays;

/**
 *
 * @author Crespo Bravo Gerardo
 */
public class ADN {

    final int renglon = 2;
    int columna = 120;
    String[][] adn = new String[renglon][columna];

    //Método Construtor
    public ADN(int longitud) {

        columna = longitud / 2;
        String acido_n = "";
        String acido_m = "";

        if (columna % 2 == 0) { //    Como queremos bases pares usamos el modulo para pedir que sea un número par de ellas EJEMPLO: TA AG GC TA etc. con su respectivo renglon de abajo 
            for (int i = 0; i < renglon; i++) {
                for (int j = 0; j < columna; j++) {

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
                        adn[i][j] = acido_n;
                    } //Hasta aquí se llena el primer renglon 
                    else {
                        if (adn[0][j].equals("T")) { //A partir de aquí comparamos los indices del anterior renglon
                            acido_m = "A";
                        }

                        if (adn[0][j].equals("C")) {
                            acido_m = "G";
                        }

                        if (adn[0][j].equals("G")) {
                            acido_m = "C";
                        }

                        if (adn[0][j].equals("A")) {
                            acido_m = "T";
                        }
                        adn[i][j] = acido_m;
                    }

                    System.out.print(adn[i][j] + "  ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("La longitud no es par");
        }
    }

    public String[][] transcripcion(String gen[][]) {

        String[][] transcripcion = new String[renglon][columna];
        double y = Math.random();
        String acido_o = "";

        if (y <= 0.50) { //Lee el renglon 1 del arreglo o la cadena de ADN  1

            for (int i = 0; i < renglon; i++) {
                for (int j = 0; j < columna; j++) {

                    if (adn[0][j].equals("T")) {
                        acido_o = "U";
                    }

                    if (adn[0][j].equals("C")) {
                        acido_o = "G";
                    }

                    if (adn[0][j].equals("G")) {
                        acido_o = "C";
                    }

                    if (adn[0][j].equals("A")) {
                        acido_o = "T";
                    }

                    transcripcion[0][j] = adn[0][j];
                    transcripcion[1][j] = acido_o;
                }
                //System.out.println("");
            }
            /*for (int i = 0; i < renglon; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.print(transcripcion[i][j] + "  "); Otra forma de imprimir
                }
            }*/

        } else { //Lee el renglon 2 del arreglo o la cadena de ADN  2

            for (int i = 0; i < renglon; i++) {
                for (int j = 0; j < columna; j++) {

                    if (adn[1][j].equals("T")) {
                        acido_o = "U";
                    }

                    if (adn[1][j].equals("C")) {
                        acido_o = "G";
                    }

                    if (adn[1][j].equals("G")) {
                        acido_o = "C";
                    }

                    if (adn[1][j].equals("A")) {
                        acido_o = "T";
                    }

                    transcripcion[0][j] = adn[0][j];
                    transcripcion[1][j] = acido_o;
                }
                //System.out.println("");
            }
            /*for (int i = 0; i < renglon; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.print(transcripcion[i][j] + "  ");  Otra posible forma de imprimir
                }
            }*/

        }

        //toString(transcripcion);
        return transcripcion;
    }

    @Override
    public String toString() {
        return Arrays.toString(adn);
    }

}
