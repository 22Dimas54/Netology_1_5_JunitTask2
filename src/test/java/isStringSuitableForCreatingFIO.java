import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class isStringSuitableForCreatingFIO extends TypeSafeMatcher<String> {
    public void describeTo(Description description) {
        description.appendText("the number of words not matches");
    }

    @Factory
    public static Matcher<String> isStringSuitableForCreatingFIO() {
        return new isStringSuitableForCreatingFIO();
    }

    @Override
    protected boolean matchesSafely(String s) {
        return s.split(" ").length==3;
    }
}
