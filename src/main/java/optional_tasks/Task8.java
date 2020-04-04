package optional_tasks;

import org.testng.annotations.Test;
import line_factory.LineAction;
import line_factory.Util;

import java.io.File;

public class Task8 {
    @Test
    public void removeExtraSpaces() {
        File file = new File("src/main/java/optional_task/Task8.java");
        String lines = new Util().readFileLines(file, LineAction.REMOVE_EXTRA_SPACES);
        new Util().writeLinesInFile(file, lines);
    }
}
