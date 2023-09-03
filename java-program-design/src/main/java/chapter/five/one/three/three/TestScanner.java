package chapter.five.one.three.three;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
    final String keyword = "";

    public void search(File file) throws FileNotFoundException {

        var in = new Scanner(new FileInputStream(file));
        var lineNumber = 0;

        while (in.hasNextLine()) {
            lineNumber++;
            var line = in.nextLine();
            if (line.contains(keyword)) {
                System.out.printf("%s:%d:%s%n", file.getPath(), lineNumber, line);
            }

        }
        in.close();
    }
}
