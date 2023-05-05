/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaproves;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Crespo Bravo Gerardo
 */


public class ElTexto {
    
    public static void main(String[] args) throws IOException {
    
    File archivo1 = new File("C:\\Users\\SPARTAN PC\\Downloads\\The_Merchant_of_Venice.txt");
    FileInputStream fileStream = new FileInputStream(archivo1); 
    InputStreamReader input = new InputStreamReader(fileStream); 
    BufferedReader reader = new BufferedReader(input);
    
    Parrafos NumParrafos = new Parrafos();
    System.out.println("El número de parrafos es " + NumParrafos.LosParrafos()); //Observese que sale 5 porque en el texto que se nos dio siempre está todo junto (el texto), pero, si ponemos espacios aparecerán, se recomienda poner los espacios para que se vea que el método si funciona :D
    Palabras NoPalabras = new Palabras();
    System.out.println("El número de palabras es " + NoPalabras.LasPalabras());
    ConsonantesVocalesTexto consvoc = new ConsonantesVocalesTexto();
    System.out.println("El número de vocales y consonantes respectivamente del texto es " + Arrays.toString(consvoc.LasConsonantesLasVocalesTexto()));
    ConsonantesVocalesParrafo arrconsvoc = new ConsonantesVocalesParrafo();
    System.out.println("El número de vocales y consonantes respectivamente de los parrafos es " + Arrays.deepToString(arrconsvoc.LasConsonantesLasVocalesParrafo()));
    }
    
}