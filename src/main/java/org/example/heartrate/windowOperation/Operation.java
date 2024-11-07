package org.example.heartrate.windowOperation;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Operation {
    public static void clickButton(String windowName, int x, int y) {
        User32 user32 = User32.INSTANCE;
        User32.WNDENUMPROC callback = (hWnd, arg) -> {
            char[] buffer = new char[512];
            user32.GetWindowText(hWnd, buffer, 512);
            String title = Native.toString(buffer);
            if (windowName.equals(title)) {
                // 获取窗口矩形信息
                WinDef.RECT rect = new WinDef.RECT();
                user32.GetWindowRect(hWnd, rect);
                int centerX = rect.left + x;
                int centerY = rect.bottom - y;
                try {
                    Robot robot = new Robot();
                    // 移动鼠标到窗口中并点击
                    robot.mouseMove(centerX, centerY);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
            return true;
        };
        user32.EnumWindows(callback, null);
    }
}
