package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo3Test {
    @Test
    void getInstance(){
        Demo3 demo1 = Demo3.getInstance();
        Demo3 demo2 = Demo3.getInstance();
        assertTrue(demo1==demo2);
    }
}