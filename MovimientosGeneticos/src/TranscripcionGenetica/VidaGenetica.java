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
public class VidaGenetica {
    
    public static void main(String[] args) {
        ADN cadena = new ADN (24); //Como parametro ingresamos un entero par porque se pidieron pares de genes
        System.out.println(cadena);
        String [][] Arn_mensajero_cadena = new String [2][24]; //Obviamente el parametro renglon es igual asi mismo como el de columna 
        System.out.println(Arrays.deepToString(cadena.transcripcion(Arn_mensajero_cadena))); //Imprime la cadena que copia el ARN mensajero y la cadena ya con el cambio
    }
    
}
