package Huongdt.Bai47;

public class Bai47 {
    public static void main(String[] args){
        Author author[] = new Author[3];
        author[0] = new Author("Viet","VietCV@codelearn.io");
        author[1] = new Author("Tuan","TuanLQ@codelearn.io");
        author[2] = new Author("Kien","KienNT@codelearn.io");

        Book book = new Book("C++ for beginners",author,21000);
        System.out.println(book.getAuthorName());
    }

}
class Book{
    private String name;
    private Author author[];
    private double price;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName(){
       String authorName = "";
       for(int i = 0; i < author.length - 1 ;i++){
           authorName += author[i].getName() + ", ";
       }
       authorName += author[author.length - 1].getName();
       return authorName;
    }
}
class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
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
}

