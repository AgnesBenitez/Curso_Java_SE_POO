
package curso_javapoo;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {//atributos

    static int nextValidId = 0;
    int id=0;
    String name;
    String speciality;
    public static int edad; //variable del tipo static
    
    
    
    public Doctor() {//metodo constructor
         }

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }
    
    
    
    
  //definicion de metodos
    public void showname(){
          nextValidId++;
        System.out.println(name);
    }
    public static void showedad(){//metodo statico
        System.out.println(edad);
    }
    public static void showID()
    {
    System.out.println("ID Doctor : " +  nextValidId );    
    }
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
   ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    } 
    
    public static class AvailableAppointment{
    private int id_avalableAppoinment;
    private Date date;
    private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_avalableAppoinment() {
            return id_avalableAppoinment;
        }

        public void setId_avalableAppoinment(int id_avalableAppoinment) {
            this.id_avalableAppoinment = id_avalableAppoinment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    
    }
    
    
    
}
