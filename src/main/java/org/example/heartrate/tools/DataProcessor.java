package org.example.heartrate.tools;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    public static List<int[]> processData(List<String[]> rawData) {
        List<int[]> processedData = new ArrayList<>();
        for (String[] row : rawData) {
            int[] rowData = new int[row.length];
            for (int i = 0; i < row.length; i++) {
                try {
                    rowData[i] = Integer.parseInt(row[i]);
                } catch (NumberFormatException e) {
                    // 处理解析错误，比如可以设置一个默认值
                    rowData[i] = 0;
                }
            }
            processedData.add(rowData);
        }
        return processedData;
    }
}