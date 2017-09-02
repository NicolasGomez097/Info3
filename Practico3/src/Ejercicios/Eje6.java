package Ejercicios;

import java.util.Scanner;

public class Eje6 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para contar la cantidad de unos en la representacion binaria");
        Scanner f = new Scanner(System.in);
        int num = f.nextInt();
        System.out.println("El numero " + num + " tiene "+ nUnos(num)+" en su representacion.");
    }
    
    public static int nUnos(int num){
        if(num/2 == 0){
            return num%2;
        }
        return num%2+nUnos(num/2);
    }
}
