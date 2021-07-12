
package curso_javapoo;

import static UI.UIMenu.showMenu;

public class Curso_JAVAPOO {

   
    public static void main(String[] args) {
       Doctor myDoctor= new Doctor();//creacion de un objeto de la clase Doctor
       myDoctor.name="Agatha Harkness";//asignacion del nombre 
       myDoctor.showname();//llamdo del metodo 
       myDoctor.showID();
     
       Doctor.edad=8;//variable del tipo static
       Doctor.showedad();//metodo static
      
       Doctor myDoctorJoss= new Doctor();//creacion de un objeto de la clase Doctor
       myDoctorJoss.showID();
       
      // showMenu();//metodo importado de la clase UI
      Doctor myDoctora = new Doctor("Joshua Benitez","Urologo");//objeto de usando parametros por defecto del constructor
      Patient patient =new Patient("Agnes","agnes@hotmail.com");
    patient.setWeight(95);
  System.out.println (patient.getWeight());
      
    }
    
}
