package singleton;

/**
 * 餓漢式
 * 將一直存於內存
 * 靜態區塊
 */
public class Demo2 {
    //1.私有建構子
    private Demo2(){}
    //2.在該類中創建對象
    private  static Demo2 instance;

    static {
        instance = new Demo2();
    }

    public  static Demo2 getInstance(){
        return instance;
    }
}
