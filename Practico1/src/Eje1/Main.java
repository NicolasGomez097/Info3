package Eje1;

import modelo.Cola;
import java.util.Scanner;
import modelo.Cola;

public class Main {
    
    
    public static void main(String[] args) {
        
        Boolean run = true;
        Scanner f;
        Cola citas = new Cola();
        Cita cita;
        
        do{
            system("clear");
            System.out.println(
                      "\t Apuntador de citas"
                    + "\n 1) Ingresar una cita.         3) Eliminar la primera cita."
                    + "\n 2) Observar la primera cita.  4) Salir.");
            f = new Scanner(System.in);
            switch(f.nextInt()){
                
                case 1:
                    system("clear");
                    System.out.print("Ingrese el nombre: ");
                    f = new Scanner(System.in);
                    String nombre = f.next();
                    system("clear");
                    System.out.print("Ingrese un telefono o 0: ");
                    f = new Scanner(System.in);
                    Integer tel = f.nextInt();
                    system("clear");
                    System.out.print("Ingrese la hora de la cita: ");
                    f = new Scanner(System.in);
                    String hora = f.next();
                    system("clear");
                    System.out.print("Ingrese la fecha de la cita: ");
                    f = new Scanner(System.in);
                    String fecha = f.next();
                    cita = new Cita(nombre, tel, hora,fecha);
                    citas.encolar(cita);
                    break;
                    
                case 2:
                    system("clear");
                    cita = (Cita)citas.espiar();      
                    if(citas.esVacia()){
                        System.out.println("No hay citas.");
                        system("pause");
                        break;
                    }
                    System.out.println(
                              "\t Primera cita"
                            + "\n Nombre: " + cita.obtenerNombre()
                            + "\n Telefono: " + cita.obtenerTelefono()
                            + "\n Hora de la cita: " + cita.obtenerHoraDeCita()
                            + "\n Fecha de la cita: " + cita.obtenerFechaDeCita());
                    system("pause");
                    break;
                case 3:
                    system("clear");
                    if(citas.esVacia()){
                        System.out.println("No hay citas.");
                        system("pause");
                        break;
                    }
                    cita = (Cita)citas.desencolar();                    
                    System.out.println(
                              "\tCita eliminada"
                            + "\n Nombre: " + cita.obtenerNombre()
                            + "\n Telefono: " + cita.obtenerTelefono()
                            + "\n Hora de la cita: " + cita.obtenerHoraDeCita()
                            + "\n Fecha de la cita: " + cita.obtenerFechaDeCita());
                    system("pause");
                    break;
                default:
                    run = false;
            }
        }while(run);   
    }
    
    public static void system(String op){
        if(op.equals("clear")){
            System.out.println("\n\n\n\n\n\n\n\n");
        }
        if(op.equals("pause")){
            System.out.println("\nIngrese una caracter para continuar...");
            Scanner f;
            f = new Scanner(System.in);
            f.next();
        }
    }
}
