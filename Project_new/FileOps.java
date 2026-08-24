import java.io.File;
import java.io.Writer;
import java.io.FileWriter;
public class FileOps {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\tejas\\Project\\Project_new\\test1.txt");
            if(file.createNewFile()){
                Writer writer = new FileWriter(file, true);
                writer.write("This is a test file");
                writer.close();
                System.out.println("File created: " + file.getName());

            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
