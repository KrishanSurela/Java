package OOPS_PracticeQ;

public class Q3 {
    public static void main(String[] args) {
        Book b = new Book(150);
        System.out.println(b.count);//1
        Book b1 = new Book(250);
        System.out.println(b.count);//2

    }
}
class Book{
    int price;
    static int count;

    public Book(int price){
        this.price=price;
        count++;
    }
}
