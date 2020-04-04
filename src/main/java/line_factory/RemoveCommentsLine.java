package line_factory;

public class RemoveCommentsLine extends Line {
    @Override
    public String transform(String line) {
        return line.replaceAll("//.*$", "")
                .replaceAll("/\\\\*.*/\\\\*", "");
    }
}
