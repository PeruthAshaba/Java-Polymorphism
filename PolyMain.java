package Polymorphism;

public class PolyMain {
    public static void main(String[] args){
        Developer developer = new Developer(1, "Ashaba Peruth", "peruth@gmail.com", 999999,"developer", 3200000,200000);
        Developer developer1 = new Developer(2,"Adee Joyce", "joy@gmail.com",7654333, "developer",350000,20000);
        System.out.println("Developer");
        System.out.println("DeveloperName: " + developer.getName());
        System.out.println("DeveloperSalary: " + developer.getSalary() + " and DeveloperOvertime: " + developer.getOvertime());
        System.out.println("DeveloperTotalSalary: " + developer.employeeSalary());
        System.out.println();
        System.out.println("DeveloperName: " + developer1.getName());
        System.out.println("DeveloperSalary: " + developer1.getSalary() + " and DeveloperOvertime: " + developer1.getOvertime());
        System.out.println("DeveloperTotalSalary: " + developer1.employeeSalary());
        System.out.println();

        Accountant accountant = new Accountant(1,"Muhamye Brinton","brinton@gmail.com",908722,"Accountant",300000,30000);
        System.out.println("Accountant");
        System.out.println("AccountantName: " + accountant.getName());
        System.out.println("AccountantSalary: " + accountant.getSalary() + " and AccountantOvertime: " + accountant.getOvertime());
        System.out.println("AccountantTotalSalary: " + accountant.employeeSalary());
    }
}
