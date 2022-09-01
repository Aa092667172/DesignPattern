package singleton;

import java.util.Objects;

/**
 * 懶漢式
 * 非執行緒安全
 * 加入synchronized
 */
public class Demo3 {
    private Demo3(){}
    private static Demo3 instance;

    public static synchronized Demo3 getInstance(){
        if (Objects.isNull(instance)) {
            instance = new Demo3();
            return instance;
        }
        return instance;
    }
}
