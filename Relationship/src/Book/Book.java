package Book;

public class Book {
    private String name;
    private Author[] author;
    private double price;

    /**
     * constructor.
     * @param name nob
     * @param author aob
     * @param price pob
     */
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

    public String getAuthorNames() {
        String res = "";
        for (int i = 0; i < author.length - 1; i ++) {
            res += author[i].getName() + ", ";
        }
        return res += author[author.length - 1].getName();
    }

    public void display() {
        System.out.println(getAuthorNames());
    }
}
