package modelo;


public class Lista<T> {
    private Nodo<T> inicio;
    private Integer tam = 0;
    
    public Boolean insertar(T dato,int pos){
        
        Nodo<T> posicion = inicio; 
        if(pos > tam){
            return false;
        }
        if(pos == 0){
            Nodo<T> aux = new Nodo<T>(dato, inicio);
            inicio = aux;
            tam++;
            return true;
        }    
                   
        for(int i=0;i<pos-1;i++){
            posicion = posicion.getNext();                
        }
        Nodo<T> aux = new Nodo<T>(dato,posicion.getNext());
        posicion.setNext(aux);
        tam++;
        return true;                    
    }
    
    public Boolean insertarPrimero(T dato){
        return insertar(dato, 0);
    }
    
    
    public Boolean insertarUltimo(T dato){
        return insertar(dato, tam-1);
    }
    
    public void mostrarLista(){
        if(esVacia()){
            System.out.println("La lista esta vacia.");
            return;
        }
        System.out.println("\tToda la lista");
        Nodo<T> aux  = inicio;
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getNext();
        }
    }
    
    public Boolean esVacia(){
        if( tam == 0){
            return true;
        }
        return false;
    }
    
    public int getTamano(){
        return tam;
    }
    
    public T getDato(int pos){
        if(pos >= tam){
            return null;
        }
        Nodo<T> aux = inicio;
        for(int i = 0;i<pos;i++){
            aux = aux.getNext();
        }
        return aux.getDato();
    }
    
    public Boolean borrar(int pos){
        if(pos >=tam){
            return false;
        }
        if(pos == 0){
            inicio = inicio.getNext();
            tam--;
            return true;
        }
        Nodo<T> aux = inicio;
        for(int i = 0;i<pos-1;i++){
            aux = aux.getNext();
        }
        aux.setNext(aux.getNext().getNext()); 
        tam--;
        return true;        
    }
}
