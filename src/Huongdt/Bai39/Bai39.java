package Huongdt.Bai39;

public class Bai39 {
    public static void main(String[] args){
        Person p1 = new Employee("Trung","HN",3300);
        Person p2 = new Customer("Linh","BN",10400);
        p1.display();
        p2.display();

    }
}
abstract class Person{
 private String name;
 private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract void display();
}
class Employee extends Person{
    private int salary;
    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void display(){
        System.out.println("Name: "+super.getName());
        System.out.println("Address: "+super.getAddress());
        System.out.println("Salary: "+salary);
    }
}
class Customer extends Person{
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }
    @Override
    public void display(){
        System.out.println("Name: "+super.getName());
        System.out.println("Address: "+super.getAddress());
        System.out.println("Balance: "+balance);
    }
}




