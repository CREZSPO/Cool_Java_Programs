package criptografia;
import java.io.*;
import java.util.Scanner;
public class Criptografia{
	
	public static void main(String[] args) throws IOException {
            Scanner entrada=new Scanner(System.in);
            System.out.println("Coloca el texto");
            String l=entrada.nextLine();
            System.out.println("Coloca el numero e letras a mover");
            int z= entrada.nextInt();
            Encriptacion n = new Encriptacion();
            System.out.println(n.move_n_01(l, z));
            System.out.println(n.HASH(l));
            System.out.println(n.move_n_07(l,z));

        }

}