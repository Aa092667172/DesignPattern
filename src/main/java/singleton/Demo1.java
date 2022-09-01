package singleton;

/**
 * 餓漢式
 * 將一直存於內存
 * 靜態變數
 */
public class Demo1 {
    //1.私有建構子
    private Demo1(){}
    //2.在該類中創建對象
    private  static Demo1 instance = new Demo1();
    //3.提供一個公開的靜態方法訪問
    public  static Demo1 getInstance(){
        return instance;
    }

}
