
package UI;

import java.util.Scanner;


public class UIMenu {//metodos static para mostrar el menu 
  public static final String months[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"
          + "Septiembre","Octubre","Noviembre","Diciembre"};  
    
    
    
    
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");
//todo dentro de un do while
        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");
//objeto para leer el dato de entrada
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
//switch case para el menu
            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;//pausa
                case 2:
                    response = 0;
                    //metodo anidado 
                    showPatientMenu();

                    break;//pausa
                case 0:
                    System.out.println("Thank you for you visit");
                    break;//pausa
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);//validacion en while
    }

    static void showPatientMenu(){//definicion del metoodo anidado
        int response = 0;
        do {//menu en un do
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
//switch case
            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for(int i=0; i<3; i++)
                    {
                     System.out.println(i+1+"."+months[i]);   
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
}
}
