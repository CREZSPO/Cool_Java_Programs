package criptografia;
import java.io.*;

class Encriptacion  {
    
    public void  Encriptacion(String u)throws IOException{
    }	
    public String move_n_01(String cadena, int x){
        StringBuilder s = new StringBuilder();
        cadena=cadena.toLowerCase();
        x=x%26;
        for (int i=0; i<cadena.length();i++){
            if (cadena.charAt(i)>='a'||cadena.charAt(i)<='z'){
                if (cadena.charAt(i)=='\n'){
                    s.append((char)('\n')); 
                }
                if ((cadena.charAt(i)+x)>'z'){
                    s.append((char)(cadena.charAt(i)+x-26));
                }else{s.append((char)(cadena.charAt(i)+x));}         
            }
            
        }return s.toString();
    }
    public String HASH(String cadena){
        cadena =cadena.toLowerCase();
        StringBuilder d= new StringBuilder();
        for (int i=0; i<cadena.length(); i++){
          d.append((int )( cadena.codePointAt(i)-96));
        }      
    return d.toString();
    }
    
    public String move_n_07(String cadena,int y ){
        
        cadena = cadena.toLowerCase();                
        StringBuilder texto = new StringBuilder();
        
        for (int i=0; i<cadena.length(); i++){
            int x= (int)(Math.random()*2+1);
            if (x==1){//convierte el texto a numeros 
                if (cadena.charAt(i)=='\n'){
                    texto.append((char)('\n'));
                }
                if (cadena.charAt(i)>='a'||cadena.charAt(i)<='z'){
                    if ((cadena.charAt(i)+y)>'z'){
                        texto.append((int)((char)(cadena.charAt(i)+y-26))).codePointAt(i);
                    }else{texto.append((int)(cadena.charAt(i)+y));}
                
                }
            }else{//cambia el orden de las letras
                if (cadena.charAt(i)>='a'||cadena.charAt(i)<='z'){
                    if (cadena.charAt(i)=='\n'){
                        texto.append((char)('\n'));
                    }
                    if ((cadena.charAt(i)+y)>'z'){
                        texto.append((char)(cadena.charAt(i)+y-26));
                    }else{texto.append((char)(cadena.charAt(i)+y));}
                }
            }
            
        }
    return texto.toString();        
       
    }
}