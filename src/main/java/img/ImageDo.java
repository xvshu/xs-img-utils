package img;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xvshu on 2017/11/2.
 */
public class ImageDo {
    public static void main(String[] args) {
        List<String> filesjpg = FileRecursionPrint.getAllFilePaths("C:\\xvshu\\M3","jpg");
        List<String> filespng = FileRecursionPrint.getAllFilePaths("C:\\xvshu\\M3","png");

        List<String> files = new ArrayList<String>();
        if(filesjpg!=null)
            files.addAll(filesjpg);
        if(filespng!=null)
            files.addAll(filespng);

        for(String oneF : files){
            System.out.println("找到文件："+oneF);
        }

        for(String oneF : files){
            System.out.println("开始转换文件："+oneF);
            ImageUtils.pressTime(oneF,"微软雅黑", Font.BOLD,Color.white,30,30,0.83F);
            System.out.println("转换文件完成："+oneF);
        }
    }
}
