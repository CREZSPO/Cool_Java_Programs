/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genetica;


/**
 *
 * @author Crespo Bravo Gerardo
 */
public class Cerebro {
    public static void main(String[] args) {
        TranscripcionRNA Ejecuta = new TranscripcionRNA();
        System.out.println("EL ADN es");
        System.out.println(Ejecuta.ADN());
        System.out.println("Y el ARN mensajero es");
        System.out.println(Ejecuta.ARNm());
    }
    
}
