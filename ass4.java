import java.io.*;
import java.util.Scanner;

public class AdvancedFileHandling {

    static final String FILE_NAME = "data.txt";

    // Create file
    public static void createFile() {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    // Write to file (overwrite)
    public static void writeFile(String data) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(data);
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }

    // Append to file
    public static void appendFile(String data) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(data);
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Append error: " + e.getMessage());
        }
    }

    // Read file
    public static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- File Content ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }

    // Count lines and words
    public static void analyzeFile() {
        int lines = 0, words = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
            }

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);

        } catch (IOException e) {
            System.out.println("Analysis error: " + e.getMessage());
        }
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- FILE MENU ---");
            System.out.println("1. Create File");
            System.out.println("2. Write File");
            System.out.println("3. Append File");
            System.out.println("4. Read File");
            System.out.println("5. Analyze File");
            System.out.println("6. Exception Demo");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createFile();
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    writeFile(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter data to append: ");
                    appendFile(sc.nextLine());
                    break;

                case 4:
                    readFile();
                    break;

                case 5:
                    analyzeFile();
                    break;

                case 6:
                    try {
                        int x = 10 / 0;
                    } catch (ArithmeticException e) {
                        System.out.println("Arithmetic Exception: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
