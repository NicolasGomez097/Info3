package Eje;

import java.util.Scanner;
import metodos.Insercion;
import metodos.QuickSort;
import metodos.Shell;
import modelo.Arreglo;

public class Eje1 {
    
    
    public static void main(String[] args) throws Exception{
        
        Scanner f;
        int op,tam,modo,metodo;
        
        System.out.println("Ordenar arreglos");
        System.out.println("1) Enteros        3) Strings");
        System.out.println("2) Double         4) Salir");
        
        f = new Scanner(System.in);
        op = f.nextInt();
        if(op== 4)
            return;
        
        System.out.print("Cantidad de elementos del arreglo: ");
        f = new Scanner(System.in);
        tam = f.nextInt();
        
        System.out.println("Como cargar el arreglo?");
        System.out.println("1) Aleatorio    2) Manual");
        f = new Scanner(System.in);
        modo = f.nextInt();
        
        System.out.println("Como ordenar el arreglo?");
        System.out.println("1) Insercion    2) Shell");
        System.out.println("3) Quick Sort");
        f = new Scanner(System.in);
        metodo= f.nextInt();
        Arreglo a;
        
        switch(op){
            case 1:
                a = new Arreglo<Integer>(tam);
                if(modo == 1)
                    cargarAleatorio(a, 0);
                System.out.println("\nLista original");
                a.mostrarLista();
                ordenar(a, metodo);
                System.out.println("\nLista ordenada");
                a.mostrarLista();
                break;
            case 2:
                a = new Arreglo<Double>(tam);
                if(modo == 1)
                    cargarAleatorio(a, 1);
                System.out.println("\nLista original");
                a.mostrarLista();
                ordenar(a, metodo);
                System.out.println("\nLista ordenada");
                a.mostrarLista();
                break;
            case 3:
                a = new Arreglo<String>(tam);
                if(modo == 1)
                    cargarAleatorio(a, 2);
                System.out.println("\nLista original");
                a.mostrarLista();
                ordenar(a, metodo);
                System.out.println("\nLista ordenada");
                a.mostrarLista();
                break;
        }
    }
    
    public static void cargarAleatorio(Arreglo a, int op)throws Exception{
        int i;
        if(op == 0)
            for(i = 0;i<a.getTam();i++)
                a.agregar(i, (int)(Math.random()*1000));
        if(op == 1){
            for(i = 0;i<a.getTam();i++)
                a.agregar(i, (double)(Math.random()*1000));
        }
        if(op == 2){            
            int ciclos = (int)(Math.random()*10);            
            for(int j = 0;j<a.getTam();j++){
                String aux = "";
                for(i = 0;i<ciclos;i++)
                    aux+= (char)(65+Math.random()*(90-65));                
                a.agregar(j, aux);
            }
        }
    }
    
    public static void ordenar(Arreglo a, int metodo)throws Exception{
        switch(metodo){
            case 0:
                Insercion.ordenar(a);
                break;
            case 1:
                Shell.ordenar(a);
                break;
            case 2:
                QuickSort.ordenar(a, 0, a.getTam()-1);
                break;
        }
    }
}
