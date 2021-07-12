
package curso_javapoo;

public class Patient {//atributos
    private    int ID;
    private    String name;
    private    String email;
    private    String address;
    private    String phoneNumber;
    private    String birthday;
    private    double weight;
    private    double height;
    private    String blood;

    public Patient(String name, String email ){//constructor
        this.name = name;
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length()>8)
        {
            System.out.println("Asignar un valor valido de 8 digitos");
        }
        else if(phoneNumber.length()==8)
        {
        this.phoneNumber = phoneNumber;
        }
    }

  
 
}

/*81801676
gXf*m6a6*/