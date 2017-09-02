package metodos;

import modelo.Arreglo;

public class QuickSort {
    
    public static void ordenar(Arreglo a,int ini,int f)throws Exception{
        int pivote=ini;
        int menor=ini;
        int mayor=f;
        while(menor < mayor){
            while(a.mayor(mayor, pivote) && mayor > pivote){
                mayor--;
            }
            if(a.mayor(pivote, mayor)){
                a.mover(mayor, pivote);
                menor  = pivote;
                pivote = mayor;
            }
            while(a.mayor(pivote, menor) && menor < pivote){
                menor++;
            }
            if(a.mayor(menor, mayor)){
                a.mover(menor, pivote);
                mayor = pivote;
                pivote = menor;
            }
        }
        if(pivote > ini)
           ordenar(a, ini, pivote-1);
        if(pivote < f)
           ordenar(a, pivote+1, f); 
    }
}


