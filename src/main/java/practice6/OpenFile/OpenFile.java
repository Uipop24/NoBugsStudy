package practice6.OpenFile;

import java.io.FileReader;
import java.io.IOException;

public class OpenFile {
    public static void main(String[] args){
        try (FileReader fileReader = new FileReader("data.txt")){
        }catch (IOException e){
            System.out.println("Файл не найден");
        }
    }
}
