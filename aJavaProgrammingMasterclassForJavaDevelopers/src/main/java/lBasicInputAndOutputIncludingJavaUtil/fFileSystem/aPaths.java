package lBasicInputAndOutputIncludingJavaUtil.fFileSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class aPaths {

    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem/workingDirectoryFile.txt");
        printFile(path);
//        Path filePath = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem/files/subdirectoryFile.txt");
        Path filePath = Paths.get(".","aJavaProgrammingMasterclassForJavaDevelopers", "src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem/files/subdirectoryFile.txt");
        printFile(filePath);

//        filePath = Paths.get("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/dJavaNIO/directions_big.txt");
//        printFile(filePath);

        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());

        Path path2 = FileSystems.getDefault().getPath(".", "aJavaProgrammingMasterclassForJavaDevelopers", "..", "aJavaProgrammingMasterclassForJavaDevelopers", "src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem/files/subdirectoryFile.txt");
        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());

        Path path3 = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem/thisFileDoesNotExist.txt");
        System.out.println(path3.toAbsolutePath());

        Path path4 = Paths.get("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil", "NoDirectory", "whatever.txt");
        System.out.println(path4.toAbsolutePath());

        filePath = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem/files");
        System.out.println("Exists = " + Files.exists(filePath));

        System.out.println("Exists = " + Files.exists(path4));
    }

    private static void printFile(Path path) {
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
