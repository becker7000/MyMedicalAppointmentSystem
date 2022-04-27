package model;

public abstract class User {
    public static int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()!=10)
            System.out.println("El número telefónico debe ser de 10 dígitos.");
        else
            this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\n\tmodel.User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //Método abstracto
    //Estos metodos no llevan bloque de código, ya que se definen en
    //las clases hijas.
    public abstract void showDataUser();

}
