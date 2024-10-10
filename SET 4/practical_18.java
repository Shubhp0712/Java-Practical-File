import java.util.*;

public class practical_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        Manager manager = new Manager();
        
        System.out.println("Enter employee details:");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Age: ");
        employee.age = sc.nextInt();
        System.out.print("Phone: ");
        employee.phone = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Address: ");
        employee.address = sc.nextLine();
        System.out.print("Salary: ");
        employee.salary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Specialization: ");
        employee.specialization = sc.nextLine();

        System.out.println("\nEnter manager details:");
        System.out.print("Name: ");
        manager.name = sc.nextLine();
        System.out.print("Age: ");
        manager.age = sc.nextInt();
        System.out.print("Phone: ");
        manager.phone = sc.nextLong();
        sc.nextLine();
        System.out.print("Address: ");
        manager.address = sc.nextLine();
        System.out.print("Salary: ");
        manager.salary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Department: ");
        manager.department = sc.nextLine();
        System.out.println();

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getname());
        System.out.println("Age: " + employee.getage());
        System.out.println("Phone: " + employee.getphone());
        System.out.println("Address: " + employee.getaddress());
        employee.printSalary();
        System.out.println("Specialization: " + employee.getSpecialization());

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.getname());
        System.out.println("Age: " + manager.getage());
        System.out.println("Phone: " + manager.getphone());
        System.out.println("Address: " + manager.getaddress());
        manager.printSalary();
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("23DCS092_Shubh");
    }
    
}
class Member{
    String name;
    int age;
    long phone;
    String address;
    double salary;
    void printSalary() {
        System.out.println("Salary: " + salary);
    }
    String getname(){
        return name;
    }
    int getage(){
        return age;
    }
    long getphone(){
        return phone;
    }
    String getaddress(){
        return address;
    }
    double getsalary(){
        return salary;
    }
}
class Employee extends Member{
    String specialization;

    String getSpecialization(){
        return specialization;
    }
}
class Manager extends Member{
    String department;

    String getDepartment(){
        return department;
    }
}
