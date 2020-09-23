import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class Main_averageTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("======================单元测试begin=====================");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("======================单元测试end=====================");
    }

    @Test
    public void mainTest01() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入文件参数为null+++++++++++++++++++");
        Main_average.main(null);
    }
    @Test
    public void mainTest02() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入不存在/错误的文件路径+++++++++++++++++++");
        Main_average.main(new String[]{"D:\\迅雷下载\\test\\不存在.txt","D:\\迅雷下载\\test\\不存在.txt","D:\\迅雷下载\\test\\不存在.txt"});
    }
    @Test
    public void mainTest03() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入小文件（小于500字的文件）+++++++++++++++++++");
        Main_average.main(new String[]{"D:\\3118005419\\src\\main\\resources\\小于500字原文文档.txt","D:\\3118005419\\src\\main\\resources\\小于500字抄袭文档（多了几个字）.txt","D:\\3118005419\\src\\main\\resources\\答案.txt"});
    }
    @Test
    public void mainTest04() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入大文件（大于500字的文件）+++++++++++++++++++");
        Main_average.main(new String[]{"D:\\3118005419\\src\\main\\resources\\大于500字原文文档.txt","D:\\3118005419\\src\\main\\resources\\大于500字抄袭文档（插入了文字）.txt","D:\\3118005419\\src\\main\\resources\\答案.txt"});
    }
    @Test
    public void mainTest05() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入老师给的测试原文文件和自己添加了部分文字的文件（大于500字的文件）+++++++++++++++++++");
        Main_average.main(new String[]{"D:\\3118005419\\src\\main\\resources\\orig.txt","D:\\3118005419\\src\\main\\resources\\orig_add.txt","D:\\3118005419\\src\\main\\resources\\答案.txt"});
    }
    @Test
    public void mainTest06() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入老师给的测试原文文件和自己删除了部分文字的文件（大于500字的文件）+++++++++++++++++++");
        Main_average.main(new String[]{"D:\\3118005419\\src\\main\\resources\\orig.txt","D:\\3118005419\\src\\main\\resources\\orig_add.txtD:\\3118005419\\src\\main\\resources\\orig_del.txt","D:\\3118005419\\src\\main\\resources\\答案.txt"});
    }
    @Test
    public void mainTest07() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入空白文件和空白对比文档++++++++++++++++");
        Main_average.main(new String[]{"D:\\3118005419\\src\\main\\resources\\orig.txt","D:\\3118005419\\src\\main\\resources\\orig_add.txtD:\\3118005419\\src\\main\\resources\\orig_del.txt","D:\\3118005419\\src\\main\\resources\\答案.txt"});
    }
    @Test
    public void mainTest08() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入两份完全相同的文件（大于500字）++++++++++++++++");
        Main_average.main(new String[]{"D:\\3118005419\\src\\main\\resources\\orig.txt","D:\\3118005419\\src\\main\\resources\\orig.txt","D:\\3118005419\\src\\main\\resources\\答案.txt"});
    }
    @Test
    public void mainTest09() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入老师给的测试原文件和修改了部分内容的文件（将部分文字替换）++++++++++++++++");
        Main_average.main(new String[]{"D:\\3118005419\\src\\main\\resources\\orig.txt","D:\\3118005419\\src\\main\\resources\\orig_change.txt","D:\\3118005419\\src\\main\\resources\\答案.txt"});
    }
    @Test
    public void mainTest10() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：少输入参数，只输入两个参数++++++++++++++++");
        Main_average.main(new String[]{"D:\\3118005419\\src\\main\\resources\\orig.txt","D:\\3118005419\\src\\main\\resources\\orig_change.txt"});
    }
    @Test
    public void mainTest11() throws FileNotFoundException {
        System.out.println("++++++++++++++++单元测试：输入不合法的参数，比如.text后缀++++++++++++++++");
        Main_average.main(new String[]{"D:\\3118005419\\src\\main\\resources\\orig.text","D:\\3118005419\\src\\main\\resources\\orig_change.text"});
    }


}