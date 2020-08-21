package cn.nci.test;

import cn.nci.util.CSVUtils;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackgeName: cn.nci.test
 * @ClassName: CsvTest
 * @Author: WangXiaolin
 * Date: 2020/8/20 20:47
 * project name: exportcsv
 * @Version:
 * @Description:
 */
public class CsvTest {
    /**
     * CSV导出
     *
     * @throws Exception
     */
    @Test
    public void exportCsv() {
        List<String> dataList=new ArrayList<String>();
        dataList.add("1,张三,男");
        dataList.add("2,李四,男");
        dataList.add("3,小红,女");
        boolean isSuccess= CSVUtils.exportCsv(new File("D:/ljq.csv"), dataList);
        System.out.println(isSuccess);
    }

    /**
     * CSV导出
     *
     * @throws Exception
     */
    @Test
    public void importCsv()  {
        List<String> dataList=CSVUtils.importCsv(new File("D:/ljq.csv"));
        if(dataList!=null && !dataList.isEmpty()){
            for(String data : dataList){
                System.out.println(data);
            }
        }
    }
}
