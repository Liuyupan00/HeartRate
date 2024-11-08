package org.example.heartrate.tools;

import java.util.List;

public class main {
    public static void main(String[] args) {
        List<int[]> heartRateData;
        List<String[]> rawData = DataReader.readData("E:\\Desktop\\dataLog-2024-10-21-14-32-5.txt");
        heartRateData = DataProcessor.processData(rawData);
        for (int[] heartRateDatum : heartRateData) {
            System.out.println(heartRateDatum[0] + " " + heartRateDatum[1]);
        }
    }
}
