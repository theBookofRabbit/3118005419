package CosineSimilarityalgorithm;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CosineSimilarityalgorithmTest {

    @BeforeClass
    public static void before(){
        System.out.println("===========单元测试begin============");
    }

    /**
     * 试着输入错误的路径
     */
    @Test
    public void main() {
        //通过就不会在控制台出现任何信息
       CosineSimilarityalgorithm.main(new String[]{"cs", "sc", "bc"});
    }
    /**
     * 试着输入空白内容文件
     */
    @Test
    public void main02() {
        //通过就不会在控制台出现任何信息
       CosineSimilarityalgorithm.main(new String[]{"", "sc", "bc"});
    }



    @AfterClass
    public static void after(){
        System.out.println("============单元测试end=============");
    }

}