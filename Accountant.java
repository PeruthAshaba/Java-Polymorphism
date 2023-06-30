package Polymorphism;
public class Accountant extends PolyEmployee{
    private double salary;
    private double overtime;

    public Accountant(int id, String name, String email, double contact, String role, double salary, double overtime) {
        super(id, name, email, contact, "Accountant");
        this.salary = salary;
        this.overtime = overtime;
    }
    //polymorphism method


    @Override
    public double employeeSalary() {
        return salary+overtime;//calculating the salary
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
