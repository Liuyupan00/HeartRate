package org.example.heartrate.tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public static List<String[]> readData(String filePath) {
        List<String[]> dataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine())!= null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String[] values = parts[1].trim().split("\\s+");
                    dataList.add(values);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }
}