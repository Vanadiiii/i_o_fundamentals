package line_factory;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortLine extends Line {
    @Override
    public String transform(String line) {
        return Arrays.stream(line.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
