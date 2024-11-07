package org.example.heartrate.windowOperation;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;

import java.awt.*;
import java.awt.event.InputEvent;

import static org.example.heartrate.windowOperation.Operation.clickOnWindow;


public class main {
    public static void main(String[] args) {
        String targetTitle = "CardioChip PC Starter Software Trial Version";
        clickOnWindow();
    }
}
