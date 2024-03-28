import java.io.File;
 
public class FileSearch {
    public static void main(String[] args) {
        // Check if command line arguments are provided correctly
        if (args.length != 2) {
            System.out.println("Usage: java FileSearch <directory> <file_extension>");
            return;
        }
        // Extract search directory and file extension from command line arguments
        String directoryPath = args[0];
        String fileExtension = args[1];
        // Create a File object representing the search directory
        File directory = new File(directoryPath);
        // Check if the directory exists
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path: " + directoryPath);
            return;
        }
        // Get list of files in the directory
        File[] files = directory.listFiles();
        // Search for files with the specified extension
        System.out.println("Files with extension ." + fileExtension + " in directory " + directoryPath + ":");
        for (File file : files) {
            if (file.isFile() && file.getName().toLowerCase().endsWith("." + fileExtension.toLowerCase())) {
                System.out.println(file.getName());
            }
        }
    }
}