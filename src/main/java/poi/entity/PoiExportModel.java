package poi.entity;

import java.util.ArrayList;
import java.util.List;

public class PoiExportModel {
    // 显示的导出表的标题
    private String title;
    // 导出表的列名
    private String[] rowName;
    // 导出数据
    private List<Object[]> dataList;
}
