package line_factory;

public class RemoveExtraSpacesLine extends Line {
    @Override
    public String transform(String line) {
        return line.replaceAll("\\s+", " ");
    }
}
