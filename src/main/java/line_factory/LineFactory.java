package line_factory;

import org.testng.Assert;

public class LineFactory {
    public Line getAction(LineAction action) {
        Line line = null;
        switch (action) {
            case READ:
                line = new ReadLine();
                break;
            case SORT:
                line = new SortLine();
                break;
            case DO_PUBLIC:
                line = new DoPublicLine();
                break;
            case REVERSE:
                line = new ReverseLine();
                break;
            case TO_UPPER_CASE:
                line = new ToUpperCaseLine();
                break;
            case REMOVE_COMMENTS:
                line = new RemoveCommentsLine();
                break;
            case REMOVE_EXTRA_SPACES:
                line = new RemoveExtraSpacesLine();
                break;
            default:
                Assert.fail("Please, add new actions for line");
        }
        return line;
    }
}
