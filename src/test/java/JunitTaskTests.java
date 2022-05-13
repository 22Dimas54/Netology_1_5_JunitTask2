import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class JunitTaskTests {
    JunitTask sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new JunitTask();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test compiled");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests finished");
    }

    @Test
    public void testStringInArray() {
        //arrange
        String s = "3 Billion Devices Run Java";
        //act
        String[] list = sut.stringInArray(s);
        //assert
        assertThat(list, arrayContaining("3", "Billion", "Devices", "Run", "Java"));
    }

    @Test
    public void testMaxElementOfArray() {
        //arrange
        List<Integer> list = Arrays.asList(2, 777, 555, 79, 36);
        int expected = 800;

        //act
        int result = sut.maxElementOfArray(list);
        //assert
        assertThat((double) expected, closeTo((double) result, 100));
    }

    @Test
    void testGetValueOfHashMap() {
        //arrange
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bob");
        map.put(2, "Anna");
        map.put(3, "Ron");
        map.put(4, "Tom");
        map.put(5, "Din");
        String expected = "Ron";
        //act
        String result = sut.getValueOfHashMap(3, map);
        //assert
        assertEquals(expected, result);
        assertThat(map, hasValue(expected));
    }

    @Test
    void testCreateStringFullName() {
        //arrange
        String lastName = "Иванов";
        String firstName = "Иван";
        String patronymic = "Иванович";
        //act
        String result = sut.createStringFullName(lastName, firstName, patronymic);
        //assert
        assertThat(result, isStringSuitableForCreatingFIO.isStringSuitableForCreatingFIO());
    }

    @Test
    void testCreatePerson() {
        //arrange
        String lastName = "Иванов";
        String firstName = "Иван";
        int age = 21;
        //act
        Person result = sut.createPerson(lastName, firstName, age);
        //assert
        assertThat(result, IsThePersonAnAdult.IsThePersonAnAdult());
    }
}
