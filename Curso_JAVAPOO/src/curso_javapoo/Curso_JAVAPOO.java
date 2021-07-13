package curso_javapoo;

import model.Doctor;
import static UI.UIMenu.showMenu;

import java.util.Date;
import model.User;

public class Curso_JAVAPOO {

    public static void main(String[] args) {
        //PRUEBAS
        //creacion de un objeto de la clase Doctor
        // myDoctor.name = "Agatha Harkness";//asignacion del nombre 
        /* myDoctor.showname();//llamado del metodo 
        myDoctor.showID();
        String time;*/
        
        Doctor myDoctor = new Doctor("Dentista", "Joshua Benitez","agnes_benitez@hotmail.com","7443398817");//creacion de un objeto de la clase Doctor
        myDoctor.addAvailableAppointment(new Date(), "4pm");//creacion de los objetos de cada cita
        myDoctor.addAvailableAppointment(new Date(), "6pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");
        //System.out.println(myDoctor);
        myDoctor.showDataUser();
        //Abstraccion
        User user1= new User("Joshua","josh@hotmail.comx"){
            @Override
            public void showDataUser() {
               System.out.println("Es un Doctor"); 
               System.out.println("Hospital:IMSS");
               System.out.println("Cirujano"); 
            }
            
        };
                user1.showDataUser();
//System.out.println(myDoctor.getAvailableAppointments());

      /*  for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments())//for para imprimir la fecha y el tiempo de cada cita
        { 
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        //PRUEBAS
        //Doctor.edad=8;//variable del tipo static
        // Doctor.showedad();//metodo static
        //Doctor myDoctorJoss= new Doctor();//creacion de un objeto de la clase Doctor
        showMenu();//metodo importado de la clase UI
        */
        
        /*Doctor myDoctora = new Doctor("Joshua Benitez", "Urologo");//objeto de usando parametros por defecto del constructor
        Patient patient = new Patient("Agnes", "agnes@hotmail.com");
        patient.setWeight(95);
        System.out.println(patient.getWeight());
        patient.setPhone("23456879");

        patient.toString();
        System.out.println(patient);
*/
        showMenu();//metodo importado de la clase UI
    }

}
