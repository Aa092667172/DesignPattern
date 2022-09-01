package singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObjectFileTest {
    @Test
    void isNotEquals() throws Exception {
        Demo5 demo5 = Demo5.getInstance();
        try(FileOutputStream fos = new FileOutputStream("/Users/linyukai/Desktop/text.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos)){
            os.writeObject(demo5);
        }
        try(FileInputStream fis = new FileInputStream("/Users/linyukai/Desktop/text.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            Demo5 demo = (Demo5) ois.readObject();
            assertFalse(demo == demo5);
        }

    }

    @BeforeEach
    void deleteFile() {
        System.out.println("執行刪除文件");
        new File("/Users/linyukai/Desktop/text.txt").delete();
    }
}
