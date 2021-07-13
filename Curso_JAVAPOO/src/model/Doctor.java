package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{//atributos
/*
    static int nextValidId = 0;
    int id = 0;
    String name;
    String email;
    String address;
    String phone;
  
*/
    String speciality;
    public static int edad; //variable del tipo static

   ///////////////////////////////////////////////////////////
    //CONSTRUCTORES
    public Doctor() {//metodo constructor
    }

    public Doctor(String name, String speciality) {
        super(name);
        this.speciality = speciality;
    }

    public Doctor(String speciality, String name, String email) {
        super(name, email);
        this.speciality = speciality;
    }

    public Doctor(String speciality,String name, String email, String phone) {
        super(name, email, phone);
        this.speciality = speciality;
    }

    
    
    
    //definicion de metodos
   

    public static void showedad() {//metodo statico
        System.out.println(edad);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Doctor.edad = edad;
    }

   
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }
    
    @Override//polimorfismo del metodo toString
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital     :IMMS");
        System.out.println("Especialidad :Ginecologo");
        System.out.println("Cedula       :gvuhei0jbg");
    }


//definicion de la clase anidada   

    public static class AvailableAppointment {

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
@Override
        public String toString() {//polimorfismo del metodo toString
            return "Available Appointments \nDate: " +date+ "\nTime: " + time;
        }
    }

}
