package simple;

import org.junit.jupiter.api.Tag;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")

public class PositiveTests {
    @Test
    void test1(){
        assertTrue(true);
    }
    @Test
    void test2(){
        assertTrue(true);
    }
    @Test
    void test3(){
        assertTrue(true);
    }
}
