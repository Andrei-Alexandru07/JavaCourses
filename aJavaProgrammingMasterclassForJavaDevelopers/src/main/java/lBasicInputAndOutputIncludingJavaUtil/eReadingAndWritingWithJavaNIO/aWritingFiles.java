package lBasicInputAndOutputIncludingJavaUtil.eReadingAndWritingWithJavaNIO;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class aWritingFiles {

    public static void main(String[] args) {
        //Writing files with java.nio
        try {
            Path dataPath = FileSystems.getDefault().getPath("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/eReadingAndWritingWithJavaNIO/data.txt");
            Files.write(dataPath, "\nLine 4".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            List<String> lines = Files.readAllLines(dataPath);

            for(String line : lines) {
                System.out.println(line);
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
