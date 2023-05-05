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
public class ConsonantesVocalesTexto {

    public int[] LasConsonantesLasVocalesTexto() throws FileNotFoundException, IOException {

        File archivo3 = new File("C:\\Users\\SPARTAN PC\\Downloads\\The_Merchant_of_Venice.txt");
        FileInputStream fileStream = new FileInputStream(archivo3);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        int consonantes = 0;
        int vocales = 0;
        String linea;
        
        while ((linea = reader.readLine()) != null) {
            linea = linea.toLowerCase();
            for (int i = 0; i < linea.length(); ++i) {
                char ch = linea.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++vocales;
                } else if ((ch >= 'a' && ch <= 'z')) {
                    ++consonantes;
                }
            }

        }

        int[] lasconsonanteslasvocalestexto;
        lasconsonanteslasvocalestexto = new int[2];
        lasconsonanteslasvocalestexto[0] = vocales;
        lasconsonanteslasvocalestexto[1] = consonantes;

        return lasconsonanteslasvocalestexto;
    }

}
