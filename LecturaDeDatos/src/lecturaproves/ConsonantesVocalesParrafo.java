/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaproves;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cresp
 */
public class ConsonantesVocalesParrafo {

    public int[][] LasConsonantesLasVocalesParrafo() throws FileNotFoundException, IOException {

        File archivo4 = new File("C:\\Users\\SPARTAN PC\\Downloads\\The_Merchant_of_Venice.txt");
        FileInputStream fileStream = new FileInputStream(archivo4);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        int consonantes = 0;
        int vocales = 0;
        String linea;
        int parrafo = 0;

        while ((linea = reader.readLine()) != null) {
            linea = linea.toLowerCase();
            if (linea.equals("")) {
                parrafo++;
            }
            
            for (int k = 0; k < linea.length(); ++k) {
                    char ch = linea.charAt(k);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vocales++;
                    } else if ((ch >= 'a' && ch <= 'z')) {
                        consonantes++;
                    }
            }
        }

        int[][] vcxParrafo = new int[2][parrafo];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < parrafo; j++) {
                if (i <= 0) {
                    vcxParrafo[i][j] = vocales++ ;
                } else {
                    vcxParrafo[i][j] = consonantes++;
                }
            }
        }
        return vcxParrafo;
    }

}
