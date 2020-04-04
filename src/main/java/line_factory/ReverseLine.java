package line_factory;

import org.jetbrains.annotations.NotNull;

public class ReverseLine extends Line{

    @Override
    public String transform(@NotNull String line) {
        return new Util().reverseLine(line);
    }
}
