package singleton;

import java.io.Serializable;
import java.util.Objects;

/**
 * 靜態內部類
 * 在無任何鎖的情況下 保證執行緒安全
 * 並且沒有任何性能影響和空間的浪費
 */
public class Demo5 implements Serializable {
    private Demo5(){}

    private static class SingletonHolder{
        private static final Demo5  INSTANCE = new Demo5();
    }

    public static Demo5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
