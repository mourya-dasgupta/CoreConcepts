package filereadandwrite;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEg {
    public static void main(String[] args) {
        String filePath = "/Users/mourya_dg/WORKSPACES/JavaWS/CoreConcepts/testEg.txt";
        String textContent = """
                This is a file.
                This file is written by Mourya Dasgupta.
                """;
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File have been written");
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't locate file location.");
        } catch (IOException e){
            System.out.println("Couldn't write file.");
        }
    }
}
