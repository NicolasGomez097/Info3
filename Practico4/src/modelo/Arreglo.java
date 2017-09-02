package modelo;

public class Arreglo<T> {
    
    private T a[] = null;
    private int tam;
    
    public Arreglo(){}
    
    public Arreglo(int tam){
        a = (T[])new Object[tam];
        this.tam= tam;
    }
    
    public void agregar(int pos,T v) throws Exception{
        if(pos <tam && pos >= 0){
            a[pos] = v;    
            return;
        }
        throw new Exception("No existe esa posicion.");
    }
    
    public T obtener(int pos) throws Exception{
        if(pos <tam && pos >= 0){
            return a[pos];
        }
        throw new Exception("No existe esa posicion.");
    }
    
    public void mover(int pos1, int pos2) throws Exception{
        if(pos1 <tam && pos1 >= 0 && pos2 <tam && pos2 >= 0){
            T temp = a[pos1];
            a[pos1] = a[pos2];
            a[pos2] = temp;
            return;
        }
        throw new Exception("No existe una o mas posiciones.");
    }
    
    public int getTam(){
        return tam;
    }
    
    public boolean mayor(int pos1, int pos2){
        if(a[pos1] instanceof Integer){
            if((Integer)a[pos1]>= (Integer)a[pos2])
                return true;
            return false;
        }
        if(a[pos1] instanceof Double){
            if((Double)a[pos1]>= (Double)a[pos2])
                return true;
            return false;
        }
        String b = (String) a[pos1];
        String c = (String) a[pos2];
        if(b.compareTo(c) >= 0)
            return true;
        return false;                
    }
    
    public void mostrarLista(){
        for(int i=0;i<tam;i++){
            System.out.println(a[i]);
        }
    }
    
    public void setArreglo(T b[]){
        this.a = b;
        tam = b.length;
    }
}
