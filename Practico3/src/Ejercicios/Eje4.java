package Ejercicios;

import java.util.Scanner;

public class Eje4 {
    
    public static void main(String[] args) throws Exception{
        System.out.println("Ingrese 2 numeros para realizar la division.");
        Scanner f = new Scanner(System.in);
        int a = f.nextInt();
        f = new Scanner(System.in);
        int b = f.nextInt();
        int cos = cociente(a, b);
        System.out.println("Cociente de "+a +"/"+b+" = "+cos+ " y resto: " + resto(a, b, cos));
    }
    
    public static int cociente(int a, int b) throws Exception{       
        if(b == 0)
            throw new Exception("No se puede dividir por 0");
        if(a < 0 && b > 0)
            return -cociente(0-a, b);
        if(a > 0 && b < 0)
            return -cociente(a, 0-b);
        if(vA(a) < vA(b))
            return 0;
        if(a < 0 && b < 0)
            return cociente(0-a, 0-b);
        return 1 + cociente(a-b,b);
    }
    
    public static int resto(int a, int b, int cos) throws Exception{    
        return a-b*cos;
    }
    
    public static int vA(int x){
        if(x < 0)
            x = 0-x;
        return x;
    }
}
