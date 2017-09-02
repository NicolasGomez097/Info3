package modelo;


public class Cola {
    
    private Object []datos;
    private int salida;
    private int entrada;
    private int tamano;
    private int capacidad;
    
    public Cola(){
        datos = new Object[10];
        entrada = -1;
        salida = 0;
        tamano = 0;
        capacidad = 10;
    }
    
    public void encolar(Object obj){
        if(++tamano > capacidad){
            duplicarQueve();
        }
        entrada = incrementar(entrada);
        datos[entrada] = obj;
    }
    
    public Object desencolar(){
       
       if(tamano <= 0){
           return null;
       }
       Object aux = datos[salida];
       salida = incrementar(salida);
       tamano--;
       return aux;
    }
    
    public Boolean esVacia(){
        if(tamano == 0){
            return true;
        }
        return false;
    }
    
    public Object espiar(){
        if(tamano <= 0){
           return null;
       }
       Object aux = datos[salida];
       return aux;
    }
    
    private void duplicarQueve(){
       Object []aux = new Object[capacidad*2];
       int j = salida;
       for(int i = 0;i < datos.length;i++){
           aux[i] = datos[j];
           j = incrementar(j);
       }
       capacidad*=2;
       datos = aux;
       salida = 0;
       entrada = tamano-2;
    }    
    
    private int incrementar(int x){
        
        if(++x >= datos.length){
            x = 0;
        }
        return x;
    }
}
