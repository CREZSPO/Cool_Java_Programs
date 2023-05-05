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
public class Lista<T> {

    Nodo<T> primero;
    Nodo<T> ultimo;

    /**
     * Agarramos el elemento en la posicion n
     *
     * @param n
     * @return
     */
    public T peck(int n) {
        Nodo<T> aux = primero;
        for (int i = 1; i <= n; i++) {
            aux = aux.getSiguiente();
        }
        return aux.getElemento();
    }

    /**
     * Tomamos el elemento en la n posición sacandolo de la lista
     *
     * @param n
     * @return
     */
    public T toma(int n) {

        Nodo<T> aux = primero;

        if (size() == 0) {
            return null;
        } else {
            for (int i = 1; i < n; i++) {
                aux = aux.getSiguiente();
            }

            Nodo<T> aux2 = aux;
            aux = aux.getSiguiente();
            T ele = aux.getElemento();
            aux2.setSiguiente(aux.getSiguiente());

            return ele;
        }
    }

    /**
     * Obtenemos el tamaño de la lista, es decir el número de elementos
     *
     * @return
     */
    public int size() {

        Nodo<T> temp = primero;
        int cont = 0;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }

    /**
     * Agregamos al princípio un elemento
     *
     * @param elemento
     * @return
     */
    public T addFirst(T elemento) {

        Nodo<T> aux;

        if (isEmpty()) {
            aux = new Nodo<>();
            primero = aux;
            ultimo = aux;
            aux.setElemento(elemento);
        } else {
            aux = new Nodo<>();
            aux.setElemento(elemento);
            aux.setSiguiente(primero);
            primero = aux;
        }

        return primero.getElemento();
    }

    /**
     * Agregamos al final un elemento
     *
     * @param elemento
     * @return
     */
    public T addLast(T elemento) {

        Nodo<T> aux;

        if (isEmpty()) {
            return addFirst(elemento);
        } else {
            aux = new Nodo<>();
            aux.setElemento(elemento);
            aux.setSiguiente(null);
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }

        return ultimo.getElemento();
    }

    /**
     * Devuelve el nodo en la posición indicada
     *
     * @param posicion
     * @return
     */
    public Nodo<T> obtenerNodo(int posicion) {

        if (isEmpty() || (posicion < 0 || posicion >= size())) {
            return null;
        } else if (posicion == 0) {
            return primero;
        } else if (posicion == size() - 1) {
            return ultimo;
        } else {
            Nodo<T> buscar = primero;
            int counter = 0;

            while (counter < posicion) {
                counter++;
                buscar = buscar.getSiguiente();
            }
            return buscar;
        }
    }

    /**
     * Agregamos un elemento en la posición deseada, puede ser en cualquiera, no
     * solamente en el princípio o final si no en medio etc.
     *
     * @param posicion
     * @param elemento
     * @return
     */
    public T addIn(int posicion, T elemento) {

        if (posicion == 0) {
            return addFirst(elemento);
        } else if (posicion == size()) {
            return addLast(elemento);
        } else if ((posicion < 0 || posicion >= size())) {
            return null;
        } else {
            Nodo<T> anterior = obtenerNodo(posicion - 1);
            Nodo<T> actual = obtenerNodo(posicion);
            Nodo<T> aux = new Nodo<>();
            aux.setElemento(elemento);
            aux.setSiguiente(actual);
            anterior.setSiguiente(aux);
            return obtenerNodo(posicion).getElemento();
        }
    }

    /**
     * Elimina el primer elemento de la lista
     *
     * @return
     */
    public T removeFirst() {

        if (isEmpty()) {
            return null;
        } else {

            T elemento = primero.getElemento();
            Nodo<T> aux = primero.getSiguiente();
            primero = null;
            primero = aux;
            if (size() == 1) {
                ultimo = null;
            }
            return elemento;
        }
    }

    /**
     * Borra el ultimo elemento de la lista
     *
     * @return
     */
    public T removeLast() {

        if (isEmpty()) {
            return null;
        } else {
            T elemento = ultimo.getElemento();
            Nodo<T> aux = obtenerNodo(size() - 2);
            if (aux == null) {
                ultimo = null;
                if (size() == 2) {
                    ultimo = primero;
                } else {
                    primero = null;
                }
            } else {
                ultimo = null;
                ultimo = aux;
                ultimo.setSiguiente(null);
            }
            return elemento;
        }
    }

    /**
     * Elimina el nodo de la lista en donde se deseé
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size() - 1) {
            return removeLast();
        } else {
            Nodo<T> anterior = obtenerNodo(index - 1);
            Nodo<T> actual = obtenerNodo(index);
            T elemento = actual.getElemento();
            Nodo<T> siguiente = actual.getSiguiente();
            actual = null;
            anterior.setSiguiente(siguiente);
            return elemento;
        }
    }

    /**
     * Modifica el elemento de una posición
     *
     * @param elemento
     * @param index
     * @return
     */
    public T modify(T elemento, int index) {

        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else {
            Nodo<T> aux = obtenerNodo(index);
            aux.setElemento(elemento);
            return aux.getElemento();
        }
    }

    /**
     * Verificamos si la lista está vacia
     *
     * @return
     */
    public boolean isEmpty() {
        return primero == null;
    }

    /**
     * Tu ingresas un elemento y el método te dice si está en la lista o no
     *
     * @param elemento
     * @return
     */
    public int indexOf(T elemento) {

        if (isEmpty()) {
            return -1;
        } else {
            Nodo<T> aux = primero;
            int posicion = 0;
            while (aux != null) {
                if (elemento.equals(aux.getElemento())) {
                    return posicion;
                }
                posicion++;
                aux = aux.getSiguiente();
            }
            return -1;
        }

    }

    @Override
    public String toString() {

        String cadena = "";
        if (isEmpty()) {
            cadena = "La lista esta vacia";
        } else {
            Nodo<T> aux = primero;
            while (aux != null) {
                cadena += aux.getElemento().toString() + "※";
                aux = aux.getSiguiente();
            }
        }
        return cadena;
    }

}
