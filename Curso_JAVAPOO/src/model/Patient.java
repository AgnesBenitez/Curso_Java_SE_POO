package model;

public class Patient extends User{//atributos

   /* private int ID;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
 */  
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email) {//constructor
        super(name,email);
      
    }

    public void setWeight(double weight) {//metodo set
        this.weight = weight;
    }

    public String getWeight() {//metodo get
        return this.weight + " Kg.";

    }

    public String getHeight() {
        return this.height + "cm";
    }

    public void setHeight(double height) {
        this.height = height;
    }

     @Override//
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\n Weight: " +getWeight()+ "\n Height"+getHeight()+"\nBlood"+blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Duracion     :5 anos");
        System.out.println("Enfermedad   :Gripa");
        
    }
    
    
    }





/*81801676
gXf*m6a6*/
