package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo4Test {

    @Test
    void getInstance() {
        Demo4 demo1 = Demo4.getInstance();
        Demo4 demo2 = Demo4.getInstance();
        assertTrue(demo1==demo2);
    }
}