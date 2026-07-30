package HomeWork9;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        library.year = 1990;
        library.author = "Ping";
        library.category = "90";
        // че, не компилируется?
        //library.bookTitle = "Comedy";
    }
}
