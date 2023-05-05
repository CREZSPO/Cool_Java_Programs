package lecturaproves;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cresp
 */
public class Palabras {

    public int LasPalabras() throws FileNotFoundException, IOException {

        File file = new File("C:\\Users\\SPARTAN PC\\Downloads\\The_Merchant_of_Venice.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        int palabras = 0;
        String linea;
        while ((linea = reader.readLine()) != null) {
            if (!(linea.equals(""))) {
                String[] laListaDePalabras = linea.split("\\s+"); //Podemos "separar" una String por espacios blancos en Java uando java.lang.String class este método acepta una expresion regular para separarla (la cadena) donde las palabras son separadas por espacio(" ")
                palabras += laListaDePalabras.length;
            }
        }

        return palabras;
    }

}
