package org.example.heartrate.windowOperation;

import org.example.heartrate.Enum.CoordinateEnum;
import org.example.heartrate.constant.Constant;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class main {
    public static void main(String[] args) {
        Operation.clickButton(Constant.SAVE_RECORDED_DATA_NAME, CoordinateEnum.SAVE_BUTTON.getX(), CoordinateEnum.SAVE_BUTTON.getY());
        Date date = new Date(1729492326);
        SimpleDateFormat format = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss");
        System.out.println(format.format(date));
    }

}
