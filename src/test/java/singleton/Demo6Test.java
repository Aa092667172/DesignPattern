package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo6Test {

    @Test
    void getInstance() {
        Demo6 demo1 = Demo6.INSTANCE;
        Demo6 demo2 = Demo6.INSTANCE;
        assertTrue(demo1 == demo2 );
    }
}