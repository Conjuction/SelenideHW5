package simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")

public class SkipTests {
    @Test
    @Disabled
    void test1(){
        assertTrue(false);
    }
    @Test
    @Disabled
    void test2(){
        assertTrue(false);
    }
}
