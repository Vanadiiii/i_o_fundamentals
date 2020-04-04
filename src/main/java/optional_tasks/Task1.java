package optional_tasks;


import org.testng.annotations.Test;
import line_factory.LineAction;
import line_factory.Util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

    @Test
    public void sortNumberInFile() {
        File file = new File("src/main/resources/task1.txt");
        writeRandomNumbersToFile(file, 10);
        String line = new Util().readFileLines(file, LineAction.SORT);
        new Util().writeLinesInFile(file, line);
    }

    private void writeRandomNumbersToFile(File file, int countOfNumbers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < countOfNumbers; i++) {
                String number = String.valueOf((int) (Math.random() * 10));
                writer.write(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
