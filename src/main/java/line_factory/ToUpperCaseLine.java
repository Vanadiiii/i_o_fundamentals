package line_factory;

import org.jetbrains.annotations.NotNull;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUpperCaseLine extends Line {
    @Override
    public String transform(@NotNull String line) {
        String newLine = line;
        for (int i = 0; i < line.length(); i++) {
            if (line.substring(i, i + 1).matches("[a-zA-Z]")
                    && line.substring(i).matches("(^[a-zA-Z]{3,}).*$")) {
                String specialWord = line.substring(i)
                        .replaceFirst("(^[a-zA-Z]{3,}).*$", "$1");
                newLine = newLine.substring(0, i)
                        + newLine.substring(i)
                        .replaceFirst(specialWord, specialWord.toUpperCase());
            }
        }
        return newLine;
    }

    @Test
    public void testToUpperCaseMethod() {
        String line = "  Hello  my Uni c World   ";
        System.out.println(transform(line));
        Assert.assertEquals(line.length(), transform(line).length());
        Assert.assertEquals(line.toUpperCase(), transform(line).toUpperCase());
    }
}
