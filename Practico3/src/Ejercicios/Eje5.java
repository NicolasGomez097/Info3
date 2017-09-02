package Ejercicios;

public class Eje5 {
    
    public static void main(String[] args) {
        int a[] = new int[10];
        for(int i = 0;i<a.length;i++){
            a[i] = i+1;
        }
        mostrarAlReves(a, a.length);
    }
    
    public static void mostrarAlReves(int a[], int tam){
        if(tam == 1){
            System.out.println(a[tam-1]);
            return;
        }
        System.out.println(a[tam-1]);
        mostrarAlReves(a, tam-1);
    }
}
