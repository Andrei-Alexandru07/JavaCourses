package lBasicInputAndOutputIncludingJavaUtil.fFileSystem;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class bFiles {

    public static void main(String[] args) {
        try {
            Path filePath = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples", "Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attributes.size());
            System.out.println("Last modified = " + attributes.lastModifiedTime());
            System.out.println("Created = " + attributes.creationTime());
            System.out.println("Is directory = " + attributes.isDirectory());
            System.out.println("Is regular file = " + attributes.isRegularFile());

            //Create a file
//            Path fileToCreate = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples", "file2.txt");
//            Files.createFile(fileToCreate);

            //Create a directory
//            Path dirToCreate = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

            //Create multiple directories
//            Path directoriesToCreate = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples", "Dir2/Dir3/Dir4/Dir5/Dir6");
//            Files.createDirectories(directoriesToCreate);

            //Delete a file
//            Path fileToDelete = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples", "Dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

            //Move a file(in this case, file1.txt from Examples directory will be renamed as file2.txt)
//            Path fileToMove = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples", "file1.txt");
//            Files.move(fileToMove, destination);

            //Copy a file
//            Path sourceFile = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem","Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem","Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
