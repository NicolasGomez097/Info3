
package Ejercicios;

import java.util.Scanner;

public class Eje2 {
    
    public static void main(String[] args) {
        Scanner f;
        System.out.print("Ingrese la base: ");
        f = new Scanner(System.in);
        int a = f.nextInt();
        System.out.print("Ingrese el exponente: ");
        f = new Scanner(System.in);
        int b = f.nextInt();
        System.out.println(" "+ a + "^" + b +" = "+ power(a, b));
    }
    
    public static double power(int a, int b){
        if(b == 1)
            return a;        
        return a*power(a, b-1);
    }
    
}
