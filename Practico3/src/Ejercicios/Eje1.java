package Ejercicios;

import java.util.Scanner;

public class Eje1 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese un valor entero positivo para calcular el factorial");
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();
        System.out.println("El resultado del factorial de "+ n + " es " + factorial(n));
    }
    
    public static int factorial(int n){
        
        if(n < 1)
            return 0; 
        
        for(int i = 0; i<n-1;i++){
            System.out.print(" ");                 
        }
        
        if(n == 1){
            System.out.println(" "+n + " ╗");
            return 1;            
        }
        System.out.println("╔ " + n);
        int res = n*factorial(n-1);
        for(int i = 0; i<n+1;i++){
            System.out.print(" ");                 
        }
        System.out.println(res + " ╗");
        return res;
    }
}
