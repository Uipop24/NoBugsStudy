package HomeWork7;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo(){
        System.out.println(title + " " + author);
    }

    public static void main(String[] args) {
        Book book = new Book("IT", "King");
        book.setAuthor("Stiven");
        book.printInfo();
    }
}
