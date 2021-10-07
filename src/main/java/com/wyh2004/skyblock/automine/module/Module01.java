/*
Code By WYH2004
 */
package com.wyh2004.skyblock.automine.module;

import com.wyh2004.skyblock.automine.util.Clipboard;
import com.wyh2004.skyblock.automine.util.HypixelBiss;
import com.wyh2004.skyblock.automine.util.Mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Module01 extends JFrame{

    private static Robot robot;

    static {
        try {
            robot = new Robot();
            robot.setAutoWaitForIdle(true);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

//    private static int x = 0;
//    private static int y = 0;
//
//    private final JPanel contentPanel = new JPanel();
//    JLabel value_x = null;
//    JLabel value_y = null;


    public static void main() throws InterruptedException {

        Mouse.lookup(Mouse.getX(),Mouse.getY());
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_W);
        robot.mousePress(KeyEvent.BUTTON1_MASK);
        HypixelBiss.antiAFK(true);
    }

}
