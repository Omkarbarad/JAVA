import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Get the name of the file from the user
        System.out.print("Enter the name of the file (with extension): ");
        String fileName = scanner.nextLine();
        
        File file = new File(fileName);
        
        // Step 2: Create FileInputStream object and read the contents of the file
        try (FileInputStream fis = new FileInputStream(file)) {
            int content;
            System.out.println("Contents of the file:");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println(); // For a new line after file contents
        } catch (IOException e) {
            System.out.println("File does not exist. A new file will be created.");
        }

        // Step 3: Ask user if they want to add contents to the file
        System.out.print("Do you want to add contents to the file? (yes/no): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            // Step 4: Read contents from the user
            System.out.print("Enter the contents to add to the file: ");
            String dataToAdd = scanner.nextLine();

            // Step 5: Create object of FileOutputStream and write data into file
            try (FileOutputStream fos = new FileOutputStream(file, true)) { // 'true' for appending
                fos.write(dataToAdd.getBytes());
                fos.write(System.lineSeparator().getBytes()); // Add a new line
                System.out.println("Data added to the file successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
            }
        }

        scanner.close();
    }
}
