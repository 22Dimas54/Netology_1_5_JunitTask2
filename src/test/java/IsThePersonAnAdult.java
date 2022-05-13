import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class IsThePersonAnAdult extends TypeSafeMatcher<Person> {
    @Override
    protected boolean matchesSafely(Person person) {
        return person.getAge()>19;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("the person is not an adult");
    }
    @Factory
    public static Matcher<Person> IsThePersonAnAdult() {
        return new IsThePersonAnAdult();
    }
}
