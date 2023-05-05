/**
*Programa que Calcula el Factorial y Fibonacci de un numero
*Tarea 3 
*@author Crespo Bravo Gerardo & Luis Pulido Alvarez
*@version 1 
*/


public class Calculadora{
	//Calcula el factorial de n
	public int factorial (int n){
	//Donde guardaremos el resultado.
	int resultado = 1;
 
	do{

		resultado*=n;
		n--;

	} while (n>1);
	return resultado;
}


	public int fibo(int n){

    if (n==0)
        return 0;    
    if (n <= 1) 
       return n; 
    return fibo(n-1) + fibo(n-2); 
    } 
        

public static void main(String[] args) {
Calculadora c = new Calculadora();
// Valor para pruebas.
int n = 3;
// Llamada a factorial.
int fact = c.factorial(n);
System.out.println("El factorial de " + n + " es: " + fact);
// Llamada a Fibonacci: 0,1,1,2,3,5,8,...
int fibocc = c.fibo(n);
System.out.println("El Fibonacci del numero " + n + " es: " + fibocc);
// El programa empieza a contar desde el 0 es decir 
// para 0=0 para 1=1 para 2=1 para 3=2 para 4=3 y así sucesivamente
// por lo tanto esta bien, solo que empieza a contar a partir del 0  
// ya que la serie es 0+1+1+2+3+5+8+13+...
	}

}
