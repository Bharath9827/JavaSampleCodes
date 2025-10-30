package MostCommon;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//program to read text file and find of lines having word 'is'
public class FilesExample {

    public static void main(String[] args) {
        String filePath = "src/resources/inputText.txt";
        int lineCount=0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().indexOf("is") > 0) {
                    lineCount++;
                }
            }

        } catch (Exception e) {
            System.err.println("Error: File not found at path: " + filePath);
        }
        System.out.println("Number of lines with word is: "+lineCount);
        List<List<Integer>> result = new ArrayList<>();
    }
}
