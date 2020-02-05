package day3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\27737\\Desktop\\ReadWrite\\FileName.txt";
        String line = null;
        try{
            FileReader fileReader = new FileReader (fileName) ;
            BufferedReader  bufferedReader = new BufferedReader(fileReader );
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException ex ){
            System.out.println("File not found '" +fileName + "'");
        }
        catch (IOException ex){
            System.out.println("Error reading file'" +fileName +"'");
        }

    }
}
