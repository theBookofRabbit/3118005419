package CosineSimilarityalgorithm;

import jdk.nashorn.internal.parser.Token;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TokenizerTest {

    @Test
    public void segment() {
        Tokenizer tokenizer = new Tokenizer();
        System.out.println(tokenizer.segment("这是一个分词工具类"));
    }
}