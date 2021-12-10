package Huongdt.Bai38;

public class Bai38 {
    public static void main(String[] args){
        Student s1 = new Student(6,"Kien","Ha Noi",6);
        Student s2 = new Student(10,"long","Ha Noi",6);
        System.out.println(s1.equal(s2));

    }
    }

class Student{
    private int id;
    private String name;
    private String address;
    private double gpa;

    public Student(int id,String name, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    // so sánh 2 đối tượng có giống nhau không thông qua id
    public boolean equal(Object obj){
        return this.id == ((Student) obj).id;
    }


}





