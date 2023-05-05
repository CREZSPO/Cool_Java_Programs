/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaproves;

import java.io.IOException;
import java.util.Arrays;


/**
 *
 * @author Crespo Bravo Gerardo
 */


public class ElTexto {
    
    public static void main(String[] args) throws IOException {  
    
    SusComponentes elTexto = new SusComponentes();
    System.out.println("El número de parrafos es " + elTexto.LosParrafos("C:\\Users\\SPARTAN PC\\Downloads\\The_Merchant_of_Venice.txt")); //Observese que sale 5 porque en el texto que se nos dio siempre está todo junto (el texto), pero, si ponemos espacios aparecerán, se recomienda poner los espacios para que se vea que el método si funciona :D
    System.out.println("El número de palabras es " + elTexto.LasPalabras("C:\\Users\\SPARTAN PC\\Downloads\\The_Merchant_of_Venice.txt"));
    System.out.println("El número de vocales y consonantes respectivamente del texto es " + Arrays.toString(elTexto.LasConsonantesLasVocalesTexto("C:\\Users\\SPARTAN PC\\Downloads\\The_Merchant_of_Venice.txt")));
    System.out.println("El número de parrafos, vocales y consonantes respectivamente de los parrafos es " + Arrays.toString(elTexto.LasConsonantesLasVocalesParrafo("C:\\Users\\SPARTAN PC\\Downloads\\The_Merchant_of_Venice.txt")));
    }
    
}