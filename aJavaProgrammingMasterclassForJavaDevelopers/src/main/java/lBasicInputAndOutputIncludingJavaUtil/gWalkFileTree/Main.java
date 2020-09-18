package lBasicInputAndOutputIncludingJavaUtil.gWalkFileTree;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        System.out.println("---Walking tree fir Dir2---");
        Path dir2Path = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
