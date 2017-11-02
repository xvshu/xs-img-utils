package imgtest;

import com.xs.img.utils.FileRecursionPrint;
import com.xs.img.utils.ImageUtils;

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

        int size = files.size();
        int count = files.size();
        for(String oneF : files){
            ImageUtils.pressTime(oneF,"微软雅黑", Font.BOLD,Color.white,30,30,0.83F,true);
            size-=1;
            System.out.println(size+"/"+count);
        }
    }
}
