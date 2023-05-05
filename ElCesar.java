/**
* Programa para cifrar de acuerdo al cifrado Cesar
* @author Crespo Bravo Gerardo 
* Proyecto 1
* @version 4
*/



import java.util.Scanner; //Se importa el Scanner ya que va a ser de vital importancia.

public class ElCesar{ //Se crea la clase  

	public static String encripta(String mensaje, int revuelve){ //Metodo para encriptar que recibe un String y un int, al string lo dezplazará el entero que se digite.
		if(revuelve>26){
			revuelve = revuelve%26;
		}
		else if(revuelve<0){
			revuelve = (revuelve%26)+26;
		}
/*Hasta aquí lo que llevamos del programa, la variable entero "revuelve" va a estar restringida solo para 26, el número 26 tienen como finalidad
	representar la longitud del abecedario, notese que se usa el abecedario estadounidense. Si el revuelve es mayor a 26 se usa un modulo para 
	regesarlo dentro del rango, así mismo si es menor a 26 se usa el modulo y se suma 26 nuevamente con el proposito de regresar al entero 
	revuelve dentro del rango que es 26.
*/

		String textoEncriptado = ""; //Declaracion del textoEncriptado, aquí el usuario escribe el texto obviamente al ser un valor que digitamos se deja como ""
		int length = mensaje.length();	//aquí el usuario toma la longitud del mensaje 
		for(int i = 0; i<mensaje.length(); i++){ // un for contara desde el cero, tendrá la longitud del mensaje y incrementara de uno en uno. 
			char ce = mensaje.charAt(i);			//En este loop (for) se tomara el caracter con el i-esimo indice, !solamente letras¡
			if(Character.isLetter(ce)){  
			/* Se abre un if con la condición: Si el caracter es la letra ce entonces; Devuelve el carácter situado en la posición 'index' pasada por parámetro. 
			La primera posición es la 0, esta parte es para verificar que sea una letra. Necesitamos verificar que la letra o el caracter esta en mayusculas o 
			minusculas y es por ello que necesitamos el valor entero de cada valor. Recordemos que cada valor entero del caracter representa un valor de la tabla
			ASCII
			
			Es importante notar que aquí se uso el método Character.isLetter(); este método determina si el caracter específico es en cuestion 
			una letra 
			*/
				if(Character.isLowerCase(ce)){ //Si el caracter de la cadena en minusculas es el caracter en cuestion se realizan las siguientes operaciones:
					char c = (char)(ce+revuelve); /* Se inicializa un char c que es el char multiplicado por el índice mas el int revuelve, esto quiere decir que añadimos 
					el dezplazamiento al valor del entero */
					if (c>'z'){
						textoEncriptado += (char)(ce - (26 - revuelve));
					/*Esta parte es importante ya que lo que nos dice es que si c esta fuera de rango por ejemplo si cae fuera del 97-122 que son los valores 
					decimales de las letras del abecedario en minusculas entonces ira al principio y así sucesivamente hasta encontrar su valor correspondiente 
					dentro del rango. Si son mayusculas van desde el 65 al 90 */	
					}
					else{
						textoEncriptado += c; //Si el caracter esta en el rango entonces solo se suma 
					}
				}
				else if (Character.isUpperCase(ce)){ //Si el caracter de la cadena en mayusculas es el caracter en cuestion se realizan las siguientes operaciones:
					char c = (char)(ce + revuelve); 	//Esta parte es igual pero para mayusulas 
					if (c>'Z'){							// Solo basta con poner Z mayuscula 
						textoEncriptado += (char)(ce - (26 - revuelve));
					}
					else{
						textoEncriptado += c;
					}

				}
					
			}
			else{
				textoEncriptado += ce;
			}
		}
		return textoEncriptado; //Nos devuelve el texto encriptado 
	}

	public static String decripta(String mensaje, int revuelve){ //Lo mismo que el método encripta salvo por algunas cuestiones mencionadas a continuación: 
		if(revuelve>26){
			revuelve = revuelve%26;
		}
		else if(revuelve<0){
			revuelve = (revuelve%26)+26;
		}

		String textoEncriptado = "";
		int length = mensaje.length();
		for(int i = 0; i<mensaje.length(); i++){
			char ce = mensaje.charAt(i);
			if(Character.isLetter(ce)){  
				if(Character.isLowerCase(ce)){
					char c = (char)(ce-revuelve); 						// Se resta el entero revuelve 
					if (c<'a'){											//	Se cambia a menor que "a" 
						textoEncriptado += (char)(ce + (26 - revuelve));  // ahora se suma el char ce 
					}
					else{
						textoEncriptado += c;
					}
				}
				else if (Character.isUpperCase(ce)){
					char c = (char)(ce - revuelve); 		//Se resta el revuelve 
					if (c<'A'){									//c menor a "A" mayuscula 
						textoEncriptado += (char)(ce + (26 - revuelve));
					}
					else{
						textoEncriptado += c;
					}

				}
					
			}
			else{
				textoEncriptado += ce;
			}
		}
		return textoEncriptado; //No me moleste en cambiar el nombre de la variable textoEncriptado ya que no era tan necesario
	}

	
	public static void main (String []pps){ //Se crea el método main

		Scanner sc = new Scanner(System.in); //Ahora es donde se ocuparán todos los Scanners por ende se crean 
		Scanner dc = new Scanner(System.in);
		Scanner ne = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		String quiero; //Se crean las variables que vamos a usar, 4 Strings quiero, desicion, texto y answer y un int que es la clave  
		String desicion;
		String texto;
		int clave;		//La clave int es importante ya que es el valor que se recorre o dezplaza dependiendo si vamos a cifrar o decifrar 
		String answer;

		System.out.println("Bienvenido al Cifrado Cesar \n ¿Quieres cifrar o decifrar? Digita (Si / No)"); //Bienvenida al programa 
		quiero = sc.nextLine(); //Se pide al usuario que digite Si o No 
			
		if (quiero.equals("Si")) { //Si digita Si entonces se ejecuta lo siguiente 
			
			do{ //Usamos un do-while ya que en el proyecto nos pide que repitamos el proceso hasta que el usuario ya no quiera  
			
			System.out.println("¿Quieres cifrar o decifrar?"); //Se preguntara si se desea cifrar o decifrar mientras la decision anterior haya sido "Si"
			desicion = ne.nextLine();
			
			if (desicion.equals("cifrar")) { //Si se desea cifrar se ejecutara el método encripta  
				
					System.out.println("Introduca el texto que desesea cifrar");	
					texto = sc.nextLine();
					System.out.println("Introduca la clave del cifrado (el numero)");
					clave = dc.nextInt();
					System.out.println("El texto cifrado es:");
					String codigo = encripta(texto , clave); // Es aquí donde se usa el metodo encripta con lo que se recibio: el texto y la clave que es el int revuelve en el método encripta 
					System.out.println(codigo); // Se devuelve el texto encriptado
			    
			}

			if (desicion.equals("decifrar")) { //Si se desea decifrar entonces se ejecutara el método decripta
				
					System.out.println("Introduca el texto que desesea decifrar");	
					texto = sc.nextLine();
					System.out.println("Introduca la clave del decifrado (el numero)");
					clave = dc.nextInt();
					System.out.println("El texto decifrado es:");
					String codigo = decripta(texto , clave); //Se usa el método deccripta 
					System.out.println(codigo); // Se devuelve el texto decriptado

			}

			System.out.println("¿Quieres hacer todo de nuevo? (Si/No)"); //Ahora se pregunta si se repite todo el proceso es donde entrará el while 
			answer = on.nextLine();

			}	
			while (answer.equals("Si")); //Todo lo anterior despues del do, se ejecutara mientras la "answer" sea igual a Si (Se ciclara mientras la respuesta sea si)
		}
			
			else{
				System.exit(0); //Si digita No entonces se ejecuta la salida del programa por medio de la insrucción System.exit(0);
			}

	} //Fin del main 
} //Fin de la clase 


//Se trato de documentar y comentar todo lo mas explicitamente posible como nos dijo Ulises, si los comentarios estorban porfavor quitenlos sin compromiso :) 
