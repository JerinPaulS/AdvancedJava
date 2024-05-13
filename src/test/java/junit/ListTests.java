package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ListTests {

    private List<String> strings;

    @BeforeClass
    public static void initialization() {
        System.out.println("Initialization code only run once.");
    }

    @Before
    public void setUp() {
        System.out.println("Inside setUp...");
        strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
    }

    @Test
    public void defaultListHasSixStrings() {
        assertThat(strings.size(), is(6));
    }

    @After
    public void cleanUp() {
        System.out.println("Cleaning up....");
    }

}
