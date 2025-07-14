import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class RightToFile {
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
    public static void rightToFile(String fileName, String text) {
        try {
            FileWriter myWriter = new FileWriter(fileName, true);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    
}
