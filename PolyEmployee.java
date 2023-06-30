package Polymorphism;

public class PolyEmployee {
    //private attributes of the D_Employee class
    protected int id;
    protected String name;
    protected String email;
    protected double contact;
    protected String role;

    public PolyEmployee(int id, String name, String email, double contact, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.role = role;
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

    public double getContact() {
        return contact;
    }

    public void setContact(double contact) {
        this.contact = contact;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public double employeeSalary(){
        return 0.0;
    }
}
