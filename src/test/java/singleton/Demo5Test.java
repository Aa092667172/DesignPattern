package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo5Test {

    @Test
    void getInstance() {
        Demo5 demo1 = Demo5.getInstance();
        Demo5 demo2 = Demo5.getInstance();
        assertTrue(demo1==demo2);
    }
}