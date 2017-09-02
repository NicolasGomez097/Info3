package metodos;

import modelo.Arreglo;

public class Shell {
    
    public static void ordenar(Arreglo a)throws Exception{
        int gap, i,j;
        for(gap = a.getTam()/2;gap > 0;gap /=2){
            for(i = gap;i<a.getTam();i++){
                j = i;
                while( j >= gap && a.mayor(j-gap, j)){
                    a.mover(j-gap, j);
                    j-=gap;
                }
            }
        }
    }
}
