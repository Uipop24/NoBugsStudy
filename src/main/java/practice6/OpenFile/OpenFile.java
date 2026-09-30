package practice6.OpenFile;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OpenFile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }
}
