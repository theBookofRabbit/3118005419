package CosineSimilarityalgorithm;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileUtilsTest {

    @Test
    public void readToBuffer() {
        //这个类在FileUtils会被readfile调用，所以不用测试（已经在readFile方法里被调用了）
    }

    @Test
    public void readFile() throws IOException {
        System.out.println(FileUtils.readFile("D:\\迅雷下载\\test\\orig.txt"));
    }
}