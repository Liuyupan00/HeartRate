package org.example.heartrate;

import org.example.heartrate.Enum.CoordinateEnum;
import org.example.heartrate.constant.Constant;
import org.example.heartrate.windowOperation.Operation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HeartRateApplicationTests {

    @Test
    void save() {
        Operation.clickButton(Constant.SAVE_RECORDED_DATA_NAME, CoordinateEnum.SAVE_BUTTON.getX(), CoordinateEnum.SAVE_BUTTON.getY());

    }

    @Test
    void record(){
        Operation.clickButton(Constant.MAIN_WINDOW_NAME, CoordinateEnum.RECORD_BUTTON.getX(), CoordinateEnum.RECORD_BUTTON.getY());
    }
}
