/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA_texto;

/**
 *
 * @author Crespo Bravo Gerardo
 * @param <T>
 */
public class Nodo <T> {
    
    private Nodo<T> siguiente;
    private T elemento;

    public void setElemento(T elemento) {
        this.elemento = elemento; 
    }
    
    public T getElemento() {
        return elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
      
}
