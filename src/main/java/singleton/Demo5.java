package singleton;

import java.util.Objects;

/**
 * 懶漢式
 * 非執行緒安全
 * 雙重檢查鎖
 * 再多執行緒中 可能會有NullPointException
 * 需加上volatile修飾
 * 較推薦使用
 * 因較不會佔用內存 並且完美解決執行緒問題
 */
public class Demo4 {
    private Demo4(){}
    //只是聲明變數 並未賦予值
    private static volatile Demo4 instance;

    public static synchronized Demo4 getInstance(){
        if (Objects.isNull(instance)) {
            synchronized (Demo4.class){
                //二次判斷
                if(Objects.isNull(instance)){
                    instance = new Demo4();
                }
            }

            return instance;
        }
        return instance;
    }
}
