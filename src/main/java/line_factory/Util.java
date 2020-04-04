package line_factory;

import org.jetbrains.annotations.NotNull;

import java.io.*;

public class Util {
    public String readFileLines(File file, LineAction action) {
        StringBuilder lines = new StringBuilder();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                lines.append(new LineFactory().getAction(action).transform(line));
                lines.append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines.toString();
    }

    public void writeLinesInFile(File file, String lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String reverseLine(@NotNull String line) {
        int size = line.length();
        StringBuilder newLine = new StringBuilder();
        for (int i = size; i > 0; i--) {
            newLine.append(line, i - 1, i);
        }
        return newLine.toString();
    }
}
