package HomeWork7;

public class Book {
    String author;
    String title;

    public Book(String autor, String title) {
        this.author = autor;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printInfo(){
        System.out.println(title + " " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Lavcraft", "Zov Ktulhu");
        book1.setAuthor("Gorkii");
        book1.printInfo();
    }

}
