package org.example.heartrate.Enum;

import lombok.Getter;

@Getter
public enum CoordinateEnum {
    RECORD_BUTTON(895, 20),
    SAVE_BUTTON(350 ,20);

    final int x;
    final int y;
    CoordinateEnum(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
