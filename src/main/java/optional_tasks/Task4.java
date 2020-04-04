package optional_tasks;

import org.testng.annotations.Test;
import line_factory.LineAction;
import line_factory.Util;

import java.io.File;

public class Task4 {
    @Test
    public void someWordsToUpperCase() {
        File file = new File("src/main/java/optional_task/Task4.java");
        String lines = new Util().readFileLines(file, LineAction.TO_UPPER_CASE);
        new Util().writeLinesInFile(file, lines);
    }
}
