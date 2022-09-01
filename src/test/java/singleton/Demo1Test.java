package singleton;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo1Test {
    @Test
    public void test(){
        Demo1 demo1 = Demo1.getInstance();
        Demo1 demo2 = Demo1.getInstance();
        assertTrue(demo1==demo2);
    }
}