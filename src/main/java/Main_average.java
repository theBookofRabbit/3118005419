import CosineSimilarityalgorithm.CosineSimilarityalgorithm;
import CosineSimilarityalgorithm.FileUtils;
import MySimHash.MySimHash;

import java.io.*;

public class Main_average {
    //通过文件读取内容到字符串里，超过2GB的文件将不能读取
    public static String content1 = null;
    public static String content2 = null;

    public static void main(String[] args) throws FileNotFoundException {
        if(args == null || args.length < 3){
            System.out.println("您没有输入三个参数，分别是原文文件路径、抄袭文件路径、答案文件路径");
            return;
        }
        System.out.println("原文文件："+args[0]+"\n\n抄袭版论文文件："+args[1]+"\n\n答案文件："+args[2]+"\n");
        if(args[0] == null){
            System.out.println("您没有输入原文文件路径");
            return;
        }
        if(args[1] == null){
            System.out.println("您没有输入抄袭版论文的文件路径");
            return;
        }
        if(args[2] == null){
            System.out.println("您没有输入答案文件路径");
            return;
        }

        try {
            content1 = FileUtils.readFile(args[0]);
            content2 = FileUtils.readFile(args[1]);
        } catch (IOException e) {
            System.out.println("读写前两份文件出错，请检查文件路径。注意要有后缀，一般是.txt");
            return;
        }
        double result;
        File file01 = new File(args[0]);
        if(file01.length() < 500){//小于500字使用余弦算法
            System.out.println("使用的是余弦相似度算法");
            result = Double.parseDouble(CosineSimilarityalgorithm.main(args));
        }
        else{//大于500字用simhash算法
            System.out.println("使用的是simhash算法");
            result =  Double.parseDouble(MySimHash.main(args));
        }
        //将double只保留小数点后两位（整数部分不变）
        result = ((double)((int)(result * 100)))/100;

        try{
            //这里就不用写到FileUtils去了。
            File file = new File(args[2]);
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            ps.append("相似度："+result);//文本追加写入，如果不存在文件会创建，
        }
        catch (FileNotFoundException e){
            System.out.println("没有在您的电脑上找到该文件路径，无法读写,注意要有后缀，一般是.txt");
            return;
        }
        System.out.println("===================================");
        System.out.println("相似度："+result);
        System.out.println("===================================");
    }
}
