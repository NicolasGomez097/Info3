package Eje3;

import static Eje1.Main.system;
import modelo.Pila;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Boolean run = true;
        Boolean error = false;
        Scanner f;
        String calculo;
        String calculoAux;
        Pila cuenta = new Pila();
        Double num;
        Double num1;
        Double num2; 
        
        while(run){
            system("clear");
            System.out.println("\tCalculadora de 4 funciones en notación polaca"
                    + "\n Ingrese una cuenta con +, -, * y / o ingrese fin para salir:");
            f = new Scanner(System.in);
            calculo = f.nextLine();
            if(calculo == null){
                continue;
            }
            if(calculo.equals("fin")){
                run = false;
            }else{
                calculoAux = "";
                for(int i = 0;i < calculo.length();i++){
                    switch (calculo.charAt(i)) {
                        
                        case '+':
                            if(calculoAux.equals("")){                            
                            }else if(!pasajeEntero(calculoAux, cuenta)){
                                System.out.println(" Cuenta no valida.");
                                system("pause");
                                i = calculo.length();
                                error = true;
                                break;
                            }
                            calculoAux = "";
                            num2 = (Double)cuenta.desapilar();
                            num1 = (Double)cuenta.desapilar();
                            if(num1 == null || num2 == null){
                                System.out.println(" Cuenta no valida.");
                                system("pause");
                                 i = calculo.length();
                                 calculoAux = "";
                            }
                            cuenta.apilar(num1+num2);
                            break;
                            
                        case '-':                            
                            if(calculoAux.equals("")){                            
                            }else if(!pasajeEntero(calculoAux, cuenta)){
                                System.out.println(" Cuenta no valida.");
                                system("pause");
                                i = calculo.length();
                                error = true;
                                break;
                            }
                            calculoAux = "";
                            num2 = (Double)cuenta.desapilar();
                            num1 = (Double)cuenta.desapilar();
                            if(num1 == null || num2 == null){
                                System.out.println(" Cuenta no valida.");
                                system("pause");
                                 i = calculo.length();
                            }
                            cuenta.apilar(num1-num2);
                            break;
                            
                        case '*':
                            if(calculoAux.equals("")){                            
                            }else if(!pasajeEntero(calculoAux, cuenta)){
                                System.out.println(" Cuenta no valida.");
                                system("pause");
                                i = calculo.length();
                                error = true;
                                break;
                            }
                            calculoAux = "";
                            num2 = (Double)cuenta.desapilar();
                            num1 = (Double)cuenta.desapilar();
                            if(num1 == null || num2 == null){
                                System.out.println(" Cuenta no valida.");
                                system("pause");
                                 i = calculo.length();
                            }
                            cuenta.apilar(num1*num2);
                            break;
                        case '/':
                            if(calculoAux.equals("")){                            
                            }else if(!pasajeEntero(calculoAux, cuenta)){
                                System.out.println(" Cuenta no valida.");
                                system("pause");
                                i = calculo.length();
                                error = true;
                                break;
                            }
                            calculoAux = "";
                            num2 = (Double)cuenta.desapilar();
                            num1 = (Double)cuenta.desapilar();
                            if(num1 == null || num2 == null || num2 == 0){
                                System.out.println(" Cuenta no valida.");
                                system("pause");
                                 i = calculo.length();
                            }
                            cuenta.apilar(num1/num2);
                            break;
                        case ' ':
                            if(calculoAux.equals("")){                            
                            }else if(!pasajeEntero(calculoAux, cuenta)){
                                System.out.println(" Cuenta no valida.");
                                system("pause");
                                i = calculo.length();
                                error = true;
                            }
                            calculoAux = "";
                            break;
                        default:
                            calculoAux += calculo.charAt(i);
                            break;
                    }
                }
                if(!error){
                    system("clear");
                    if(cuenta.esVacia()){
                        System.out.println(" Cuenta no valida.");
                        system("pause"); 
                    }else{
                        Double aux = (Double)cuenta.desapilar();
                        if(!cuenta.esVacia()){
                            System.out.println(" Cuenta no valida.");
                            system("pause");
                        }else{
                            System.out.println(calculo + " = " + aux);
                            system("pause");
                        }                        
                    }                    
                }else{             
                    System.out.println(" Cuenta no valida.");
                    system("pause");
                    error = false;
                }
                while(!cuenta.esVacia()){
                        cuenta.desapilar();
                }
                
            }
        }
        
    }
    
    public static Boolean pasajeEntero(String num,Pila cuenta){
        try {
            Double num1 = Double.parseDouble(num);
            if(num1 == null){
                return false;
            }else{
                cuenta.apilar(num1);
                num = "";
                return true;
            }
        } catch (Exception e) {  
            return false;
        }   
    } 
}
