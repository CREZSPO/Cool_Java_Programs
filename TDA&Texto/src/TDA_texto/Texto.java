/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA_texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Crespo Bravo Gerardo
 */
public class Texto {

    /**
     *
     * @param path
     * @return @throws FileNotFoundException
     * @throws IOException
     */
    public int numLineas(String path) throws FileNotFoundException, IOException {

        BufferedReader br = null;
        int parrafos = 0;

        try {
            File archivo = new File(path);
            FileInputStream stream = new FileInputStream(archivo);
            InputStreamReader input = new InputStreamReader(stream);
            br = new BufferedReader(input);

            String line;

            while ((line = br.readLine()) != null) {
                parrafos++;
            }
        } catch (IOException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return parrafos;
    }

    public String linea(String path) throws FileNotFoundException, IOException {

        File archivo = new File(path);
        FileReader fr = new FileReader(archivo);
        FileInputStream stream = new FileInputStream(archivo);
        InputStreamReader input = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(input);

        Lista <String> list = new Lista<>();
        Texto text = new Texto();
        String result = null;
        
        try {
            String line;
            for (int i = 0; i<text.numLineas(path);i++){
                while((line = br.readLine()) != null ){
                    line = br.readLine();
                    result = list.addLast(line);
                }
            }
        } catch (IOException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

}
