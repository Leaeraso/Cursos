package filemanagment;

import java.io.*;

public class FileManagment {

    public static void createArchive(String archiveName) {
        File archive = new File(archiveName);
        try {
            PrintWriter out = new PrintWriter(archive);
            out.close();
            System.out.println("The archive has been created");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
    public static void writeArchive(String archiveName, String content) {
        File archive = new File(archiveName);
        try {
            PrintWriter out = new PrintWriter(archive);
            out.println(content);
            out.close();
            System.out.println("The archive has been wrote");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void addInfoArchive(String archiveName, String content) {
        File archive = new File(archiveName);
        try {
            PrintWriter out = new PrintWriter(new FileWriter(archive, true));
            out.println(content);
            out.close();
            System.out.println("The information has been added to the archive");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void readArchive(String archiveName){
        var archive = new File(archiveName);
        try {
            var input = new BufferedReader( new FileReader(archive));
            var reading = input.readLine();
            while(reading != null){
                System.out.println("reading = " + reading);
                reading = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
