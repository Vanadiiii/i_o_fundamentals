package optional_tasks;

import org.testng.annotations.Test;
import line_factory.LineAction;
import line_factory.Util;

import java.io.*;

public class Task2 {
    @Test
    private void replacePrivateToPublic() {
        File file = new File("src/main/java/optional_task/Task2.java");
        String lines = new Util().readFileLines(file, LineAction.DO_PUBLIC);
        new Util().writeLinesInFile(file, lines);
    }
}
