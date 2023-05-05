/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template archivo, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaproves;

import java.io.*;

/**
 *
 * @author Crespo Bravo Gerardo
 */
public class Parrafos {

    /**
     *
     * @return @throws FileNotFoundException
     * @throws IOException
     */
    public int LosParrafos() throws FileNotFoundException, IOException {

        File archivo2 = new File("C:\\Users\\SPARTAN PC\\Downloads\\The_Merchant_of_Venice.txt");
        FileInputStream stream = new FileInputStream(archivo2);
        InputStreamReader input = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(input);

        int parrafos = 0;
        String line;

        while ((line = reader.readLine()) != null) {
            if (line.equals("")) {
                parrafos++;
            }

        }
        return parrafos;
    }

}
