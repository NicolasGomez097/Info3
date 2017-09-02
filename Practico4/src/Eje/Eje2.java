package Eje;

import java.io.File;
import java.util.Scanner;
import metodos.QuickSort;
import modelo.Arreglo;

public class Eje2 {
    public static void main(String[] args)throws Exception{
        Scanner f = new Scanner(new File("es.txt"));
        String aux  =f.useDelimiter("\\A").next();
        String []a = aux.split("\n");
        
        Arreglo b = new Arreglo();
        b.setArreglo(a);
        QuickSort.ordenar(b,0,b.getTam()-1);
        //b.mostrarLista();
    }
}
