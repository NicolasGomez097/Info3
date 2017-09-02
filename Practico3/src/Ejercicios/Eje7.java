public class Eje7 {
    
    public static void main(String[] args) {
        mostrarSeparado(258);
    }
    
    public static void mostrarSeparado(int x){        
        if(x < 10){
            System.out.print(x + " ");
            return;          
        }
        mostrarSeparado(x/10);
        System.out.print(x%10 + " ");            
    }
}
