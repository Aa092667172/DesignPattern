package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo2Test {

    @Test
    void getInstance() {
        Demo2 demo1 = Demo2.getInstance();
        Demo2 demo2 = Demo2.getInstance();
        assertTrue(demo1==demo2);
    }
}