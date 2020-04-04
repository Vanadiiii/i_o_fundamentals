package optional_tasks;

import org.testng.annotations.Test;
import line_factory.LineAction;
import line_factory.Util;

import java.io.File;

public class Task9 {
    @Test
    public void removeComments() {
        File file = new File("src/main/java/optional_task/Task9.java"); //comment1
        String lines/*comment2*/ = new Util().readFileLines(file, LineAction.REMOVE_COMMENTS);
        new Util().writeLinesInFile(file, lines);
    }
}
