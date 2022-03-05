package Book;

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Hieu", "truongminhhieu152@gmail.com");
        authors[1] = new Author("Truong", "truongminhhieu52@yahoo.com");

        Book book = new Book("Learn Object Oriented Programing in Java", authors, 1000);
        book.display();
    }
}
