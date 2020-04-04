package line_factory;

public class DoPublicLine extends Line {
    @Override
    public String transform(String line) {
        return line.replaceAll("private", "public");
    }
}
