
package model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String phone;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    
    
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
       
         if (phone.length() > 8) {
            System.out.println("Asignar un valor valido de 8 digitos");
        } else if (phone.length() == 8) {
            this.phone = phone;
        }
    }

    @Override
    public String toString() {
        return "User: " + name + ", Email: "+email+
               ". Phone: "+phone; //esto regresa el valor del objeto 
    }
    
    public abstract void showDataUser();
}
