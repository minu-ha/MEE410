package ex.g.io.ex02;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileCompareUtil {

    public List<String> compareFile(String fstFileName, String scdFileName) throws Exception {

        BufferedReader fstBr = new BufferedReader(new FileReader(fstFileName));
        BufferedReader scdBr = new BufferedReader(new FileReader(scdFileName));

        String fstLine = fstBr.readLine();
        String scdLine = scdBr.readLine();

        int lineNum = 0;

        ArrayList<String> stringArrayList = new ArrayList<>();

        while (fstLine != null) {

            lineNum++;
            if (!fstLine.equals(scdLine)) {
                stringArrayList.add(" LINE " + lineNum + " : " + scdLine);
            }

            fstLine = fstBr.readLine();
            scdLine = scdBr.readLine();
        }

        return stringArrayList;
    }

    public static void main(String[] args) throws Exception{
        FileCompareUtil util = new FileCompareUtil();
        System.out.println(util.compareFile("/Users/mee410/Desktop/fstFile1.txt","/Users/mee410/Desktop/scdFile1.txt"));
        System.out.println("successful");
    }
}
