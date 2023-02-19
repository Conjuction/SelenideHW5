package simple;

import org.junit.jupiter.api.Tag;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class NegativeTests {
    @Test
    void test1(){
        assertTrue(false);
    }
    @Test
    void test2(){
        assertTrue(false);
    }
}
