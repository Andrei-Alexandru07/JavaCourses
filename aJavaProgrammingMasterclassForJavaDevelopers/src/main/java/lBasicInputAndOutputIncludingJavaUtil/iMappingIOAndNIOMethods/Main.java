package lBasicInputAndOutputIncludingJavaUtil.iMappingIOAndNIOMethods;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        File file = new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples" + File.separator + "file.txt");
        Path convertedPath = file.toPath();
        System.out.println("convertedPath = " + convertedPath);

        File parent = new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples");
        File resolvedFile = new File(parent, "dir" + File.separator + "file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem", "Examples" + File.separator + "dir" + File.separator + "file.txt");
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem/Examples");
        Path childRelativePath = Paths.get("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem/Examples/dir/file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory.getAbsolutePath());

        System.out.println("---print Dir2 contents using list()---");
        File dir2File = new File(workingDirectory, "aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/fFileSystem/FileTree/Dir2");
        String[] dir2Contents = dir2File.list();
        for(int i = 0; i < Objects.requireNonNull(dir2Contents).length; i++) {
            System.out.println("i = " + i + " " + dir2Contents[i]);
        }

        System.out.println("---print Dir2 contents using listFiles()---");
        File[] dir2Files = dir2File.listFiles();
        for(int i = 0; i < Objects.requireNonNull(dir2Files).length; i++) {
            System.out.println("i = " + i + " " + dir2Files[i].getName());
        }
    }
}
