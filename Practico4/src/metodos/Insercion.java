package metodos;

import modelo.Arreglo;

public class Insercion {
    
    public static void ordenar(Arreglo a) throws Exception{
        for(int i = 1;i<a.getTam();i++){
            int j = i;            
            while(j > 0 && a.mayor(j-1, j)){
                a.mover(j-1, j);
                j--;
            }
        }
    }
}
