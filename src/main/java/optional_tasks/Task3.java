package optional_tasks;

import org.testng.annotations.Test;
import line_factory.LineAction;
import line_factory.Util;

import java.io.File;

public class Task3 {
    @Test
    public void changeDirectionOfStrings() {
        File file = new File("src/main/java/optional_task/Task3.java");
        String lines = new Util().readFileLines(file, LineAction.REVERSE);
        new Util().writeLinesInFile(file, lines);
    }

}
