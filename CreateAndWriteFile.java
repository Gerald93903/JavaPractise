package day3;
import java.io.PrintWriter ;
public class CreateAndWriteFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\27737\\Desktop\\ReadWrite\\FileName.txt";
        try {
            PrintWriter write = new PrintWriter(fileName);
            write.println("java is cool");
            write.println("*********");
            System.out.print("Text created");
            write.close();
        }
        catch (Exception ex) {
            System.out.println("Text not created");

        }
    }
}
