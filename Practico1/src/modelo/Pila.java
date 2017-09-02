package modelo;

public class Pila {
    
    private Object []datos;
    private int tope;
    private int capacidad;
    
    public Pila(){
        datos = new Object[10];
        tope = -1;
        capacidad = 10;
    }
    
    public void apilar(Object obj){
        if(++tope >= capacidad){
            duplicarPila();
        }
        datos[tope] = obj;
    }
    
    public Object desapilar(){
        if(tope < 0){
            return null;
        }
        return datos[tope--];
    }
    
    private void duplicarPila(){
        Object []aux = new Object[capacidad*2];
        for(int i = 0;i<datos.length;i++){
            aux[i] = datos[i];
        }
        datos = aux;
        capacidad*=2;        
    }
    
    public Boolean esVacia(){
        if(tope < 0){
            return true;
        }
        return false;
    }
}
