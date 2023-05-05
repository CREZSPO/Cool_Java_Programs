/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA_texto;

import java.io.IOException;
import java.util.Scanner;
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
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Lista <String> list = new Lista <> ();
        Texto text = new Texto();

        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner ans = new Scanner(System.in);
        String answer;
        
        System.out.println("Ingresa la ruta de tu archivo, no se te olvide el .txt");
        String path = sc.nextLine();
        
        File archivo = new File(path);
        FileInputStream stream = new FileInputStream(archivo);
        InputStreamReader input = new InputStreamReader(stream);
        BufferedReader br  = new BufferedReader(input);
        
        
        String t = text.linea(path);
        for(int i=0; i<text.numLineas(path) ; i++){
        t = br.readLine();
        list.addIn(i, t);
        }
        System.out.println("Este es tu texto/lista:");
        System.out.println(list);
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Ver a que elemento le corresponde una posicion");
        System.out.println("2. Tomar un elemento de la lista");
        System.out.println("3. Ver el tamaño de la lista o mas bien el número de lineas");
        System.out.println("4. Agregar al principio un elemento");
        System.out.println("5. Agregar al final un elemento");
        System.out.println("6. Agregar en la posición i un elemento");
        System.out.println("7. Remover el primer elemento");
        System.out.println("8. Remover el último elemento");
        System.out.println("9. Remover el i-esimo elemento");
        System.out.println("10. Modificar/remplazar el i-esimo elemento");
        System.out.println("11. Ver si la lista esta vacia");
        System.out.println("12. Ver el indice de un elemento");
        System.out.println("13. Simplemente ver la lista");
        
        do{
        System.out.println("¿Cúal proceso deseas");
        int cambio = sc.nextInt();    
        switch (cambio){
            case 1:
                System.out.println("Dame el número de la posición");
                int io = sc.nextInt();
                System.out.println(list.peck(io));
                System.out.println("¿Quieres hacer otro proceso? si/no");
  
                break;
            case 2:
                System.out.println("¿En que posicion esta el que quieres tomar");
                int ia = sc.nextInt();
                System.out.println("tomaste: " + list.toma(ia));
                System.out.println(list);
                System.out.println("¿Quieres hacer otro proceso? si/no");
  
                break;
            case 3:
                System.out.println("El tamaño de la lista es de " + list.size() + " elementos");
                System.out.println("¿Quieres hacer otro proceso? si/no");
  
                break;
            case 4:
                System.out.println("Digita la cadena a agregar");
                String addMe = sd.nextLine();
                list.addFirst(addMe);
                System.out.println("Ahora la lista es: " + list);
                System.out.println("¿Quieres hacer otro proceso? si/no");
  
                break;
            case 5:
                System.out.println("Digita la cadena a agregar");
                String addMe2 = sd.nextLine();
                list.addLast(addMe2);
                System.out.println("Ahora la lista es: " + list);
                System.out.println("¿Quieres hacer otro proceso? si/no");
  
                break;
            case 6:
                System.out.println("Digita la cadena a agregar");
                String addMe3 = sd.nextLine();
                System.out.println("Digita la posicion en la que se va a agregar");
                int in = sd.nextInt();
                list.addIn(in, addMe3);
                System.out.println(list);
                System.out.println("¿Quieres hacer otro proceso? si/no");
  
                break;
            case 7:
                System.out.println("Se ha removido: " + list.removeFirst());
                System.out.println(list);
                System.out.println("¿Quieres hacer otro proceso? si/no");
  
                break;
            case 8:
                System.out.println("Se ha removido: " + list.removeLast());
                System.out.println(list);
                System.out.println("¿Quieres hacer otro proceso? si/no");
  
                break;
            case 9:
                System.out.println("¿En que posicion esta el elemento ha eliminar?");
                int inThis = sd.nextInt();
                System.out.println("Se ha eliminado: " + list.remove(inThis));
                System.out.println(list);
                System.out.println("¿Quieres hacer otro proceso? si/no");
  
                break;
            case 10:
                System.out.println("Ingresa el elemento por el cual quieres modificar");
                String modifiedMe = sd.nextLine();
                System.out.println("Ingresa la posicion en la que se insertara el nuevo elemento modoficado");
                int In = sd.nextInt();
                list.modify(modifiedMe, In);
                System.out.println(list);
                System.out.println("¿Quieres hacer otro proceso? si/no");
   
                break;
            case 11:
                System.out.println("Esto esta por demas");
                System.out.println(list.isEmpty());
                System.out.println("¿Quieres hacer otro proceso? si/no");
   
                break;
            case 12:
                System.out.println("Ingresa tal cual esta el elemento/la cedena");
                String element = sd.nextLine();
                System.out.println("El elemento esta en la posición " + list.indexOf(element));
                System.out.println("¿Quieres hacer otro proceso? si/no");
   
                break;
            case 13:
                System.out.println(list);
                System.out.println("¿Quieres hacer otro proceso? si/no");
   
                break;
                
        }
        answer = ans.nextLine();
        } while (answer.equals("si"));
        
        }
    
    
}
