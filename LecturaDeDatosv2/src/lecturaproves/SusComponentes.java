package lecturaproves;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class SusComponentes {

    public int LasPalabras(String path) throws FileNotFoundException, IOException {

        File file = null;
        FileReader fr = null;
        BufferedReader reader = null;
        int palabras = 0; //variable temporal

        try {
            file = new File(path);
            FileInputStream fileStream = new FileInputStream(file);
            InputStreamReader input = new InputStreamReader(fileStream);
            reader = new BufferedReader(input);

            //int palabras = 0;
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (!(linea.equals(""))) {
                    String[] laListaDePalabras = linea.split("\\s+"); //Podemos "separar" una String por espacios blancos en Java uando java.lang.String class este método acepta una expresion regular para separarla (la cadena) donde las palabras son separadas por espacio(" ")
                    palabras += laListaDePalabras.length;
                }

            }
        } catch (IOException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                reader.close();

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return palabras;
    }

    /**
     *
     * @param path
     * @return @throws FileNotFoundException
     * @throws IOException
     */
    public int LosParrafos(String path) throws FileNotFoundException, IOException {

        File file = null;
        FileReader fr = null;
        BufferedReader reader = null;
        int parrafos = 0; //variable temporal

        try {
            File archivo2 = new File(path);
            FileInputStream stream = new FileInputStream(archivo2);
            InputStreamReader input = new InputStreamReader(stream);
            reader = new BufferedReader(input);

            String line;

            while ((line = reader.readLine()) != null) {
                if (line.equals("")) {
                    parrafos++;
                }

            }
        } catch (IOException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                reader.close();

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return parrafos;
    }

    public int[] LasConsonantesLasVocalesTexto(String path) throws FileNotFoundException, IOException {

        File archivo3 = new File(path);
        FileInputStream fileStream = new FileInputStream(archivo3);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        int consonantes = 0;
        int vocales = 0;
        String linea;
        int[] lasconsonanteslasvocalestexto = null; //variable temporal 

        try {
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

            lasconsonanteslasvocalestexto = new int[2];
            lasconsonanteslasvocalestexto[0] = vocales;
            lasconsonanteslasvocalestexto[1] = consonantes;
        } catch (IOException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                reader.close();

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lasconsonanteslasvocalestexto;
    }

    public int[] LasConsonantesLasVocalesParrafo(String path) throws FileNotFoundException, IOException {

        File file = null;
        FileReader fr = null;
        BufferedReader reader = null;
        int[] vcxParrafo = null; //variable temporal

        try {
            File archivo4 = new File(path);
            FileInputStream fileStream = new FileInputStream(archivo4);
            InputStreamReader input = new InputStreamReader(fileStream);
            reader = new BufferedReader(input);

            int consonantes = 0;
            int vocales = 0;
            String linea;
            int parrafo = 0;
            
            while ((linea = reader.readLine()) != null) {
                linea = linea.toLowerCase();
                if (linea.equals("")) {
                    parrafo++;
                }
                for (int l = 0; l < linea.length(); ++l) {
                    char ch = linea.charAt(l);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vocales++;
                    } else if ((ch >= 'a' && ch <= 'z')) {
                        consonantes++;
                        
                    }
                }

            }
            vcxParrafo = new int[3];
            for (int i = 0; i<= parrafo ; i++){
                    vcxParrafo [0] = i;
                    vcxParrafo [1] = vocales;
                    vcxParrafo [2] = consonantes;
            }

        } catch (IOException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                reader.close();

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return vcxParrafo;
    }

}
