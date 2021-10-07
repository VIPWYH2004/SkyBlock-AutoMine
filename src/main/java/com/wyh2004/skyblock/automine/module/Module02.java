package com.wyh2004.skyblock.automine.module;

import com.wyh2004.skyblock.automine.util.HypixelBiss;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Module02 {
    private static Robot robot;

    static {
        try {
            robot = new Robot();
            robot.setAutoWaitForIdle(true);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void main() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_W);
        robot.mousePress(KeyEvent.BUTTON1_MASK);
        HypixelBiss.antiAFK(false);
    }

}
