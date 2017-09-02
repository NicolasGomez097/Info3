package Eje4;

import static Eje1.Main.system;
import java.util.Scanner;
import modelo.Pila;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner f;
        Boolean run = true;
        String funcion;
        Pila pila = new Pila();
        
        while(run){
            system("clear");
            System.out.println("Comprobacion de ecuaciones(Cantidad correcta de (,[ y { )");
            System.out.print("Ingrese una ecuacion o fin para terminar: ");
            f = new Scanner(System.in);
            funcion = f.nextLine();
            if(funcion.equals("fin")){
                run = false;
                continue;
            }
            for(int i = 0;i<funcion.length();i++){
                char aux = funcion.charAt(i);
                if(aux == '(' || aux == '[' || aux == '{'){
                    pila.apilar(aux);
                }
                if(pila.esVacia()){
                    
                }else if(aux == ')'){
                    if((char)pila.desapilar() != '('){
                        break;
                    }
                }else if(aux == ']'){
                    if((char)pila.desapilar() != '['){
                        break;
                    }
                }else if(aux == '}'){
                    if((char)pila.desapilar() != '{'){
                        break;
                    }
                }
            }
            system("clear");
            if(pila.esVacia()){
                System.out.println("La ecuacion esta bien balanceada.");
            }else{
                System.out.println("La ecuacion no esta bien escrita.");
                while(!pila.esVacia()){
                    pila.desapilar();
                }
            }            
            system("pause");
        }
    }
}
