package Polymorphism;

public class Developer extends PolyEmployee {
    private double salary;
    private double overtime;

    public Developer(int id, String name, String email, double contact, String role, double salary, double overtime) {
        super(id, name, email, contact, "developer");
        this.salary = salary;
        this.overtime = overtime;
    }
    //polymorphism method

    @Override
    public double employeeSalary() {
        return salary+overtime ;//method to calculate the employee salary
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
