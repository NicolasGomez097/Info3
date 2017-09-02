package Ejercicios;

import java.util.Scanner;

public class Eje3 {
    
    public static void main(String[] args) {
        System.out.print("Ingrese 2 numeros para multiplicarlos\n Numero 1: ");
        Scanner f = new Scanner(System.in);
        int num1 = f.nextInt();
        System.out.print(" Numero 2:");
        f = new Scanner(System.in);
        int num2 = f.nextInt();        
        System.out.println( num1 + " * " + num2 + " = "+ producto(num1,num2));
    }
    
    public static double producto(int a, int b){       
        if(a == 0 || b == 0)
            return 0;
        if( a == 1)
            return b;
        if(a < 0  && b > 0){
            a = 0-a;
            b = 0-b;
        }
        if(a < 0 && b < 0){
            a = 0-a;
            b = 0-b;
        }
        return b + producto(a-1, b);
    }
}
