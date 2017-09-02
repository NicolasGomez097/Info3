package test;

import modelo.Lista;

public class Main {
    public static void main(String[] args) {
        Lista<Double> lista = new Lista<Double>();
        lista.mostrarLista();
        System.out.println(lista.insertar(4.0, 0) ? "Se incerto correctamente" : "No se pudo insertar.");
        System.out.println(lista.insertar(3.0, 0) ? "Se incerto correctamente" : "No se pudo insertar.");
        System.out.println(lista.insertar(2.0, 0) ? "Se incerto correctamente" : "No se pudo insertar.");
        System.out.println(lista.insertar(1.0, 0) ? "Se incerto correctamente" : "No se pudo insertar.");
        System.out.println(lista.getDato(3));
        lista.borrar(3);
        System.out.println(lista.getDato(3));
        
    }
}
