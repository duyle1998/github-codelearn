package Huongdt.Bai50;

public class Bai50 {
    public static void main(String[] args){
        Customer c = new Customer(1000,"Tuan",20);
        Invoice i = new Invoice(1000,c,100000);
        System.out.println("CustomerID: "+ i.getCustomerId());
        System.out.println("CustomerName: "+ i.getCustomerName());
        System.out.println("Invoice after discount: "+i.getAmountAfterDiscount());
    }
}
class Customer{
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
class Invoice{
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public int getCustomerId(){
        return customer.getId();
    }

    public double getAmountAfterDiscount(){
        return  amount- amount * customer.getDiscount()/100;
    }
}
