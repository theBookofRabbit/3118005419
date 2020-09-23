package CosineSimilarityalgorithm;

import java.io.*;

/**
 * 计算两个字符串的相识度
 */
public class CosineSimilarityalgorithm {

    //通过文件读取内容到字符串里，超过2GB的文件将不能读取
    public static String content1 = null;
    public static String content2 = null;


    public static String main(String[] args) {
//        System.out.println("原文文件："+args[0]+"\n\n抄袭版论文文件："+args[1]+"\n\n答案文件："+args[2]+"\n");
        if(args[0] == null){
            System.out.println("您没有输入原文文件路径");
        }
        if(args[1] == null){
            System.out.println("您没有输入抄袭版论文的文件路径");
        }
        if(args[2] == null){
            System.out.println("您没有输入答案文件路径");
        }

        try {
            content1 = FileUtils.readFile(args[0]);
            content2 = FileUtils.readFile(args[1]);
        } catch (IOException e) {
            System.out.println("读写前两份文件出错，请检查文件路径。");
            return null;
        }
        double  score=CosineSimilarity.getSimilarity(content1,content2);
        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#0.00");//截断保留小数点后两位和一位个位数
        String result = df.format(score);
//        System.out.println("=================================================");
//        System.out.println("\n\n相似度："+result);
//        System.out.println("=================================================");


        return result;
    }

}
