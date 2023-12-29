package test;

import static filemanagment.FileManagment.*;

public class TestFileManagment {
    public static void main(String[] args) {
        var archiveName = "test.txt";
        //createArchive(archiveName);
        
//        addInfoArchive(archiveName,"Hello from Java");
//        addInfoArchive(archiveName, "Goodbye");

        readArchive(archiveName);
    }
}
