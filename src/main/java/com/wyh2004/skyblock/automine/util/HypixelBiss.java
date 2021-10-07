package com.wyh2004.skyblock.automine.util;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class HypixelBiss {
    private static Random r = new Random(1);
    private static Robot robot;

    static {
        try {
            robot = new Robot();
            robot.setAutoWaitForIdle(true);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void antiAFK(boolean mouseControl) throws InterruptedException {

        while (true) {
            for (int d = 0; d <= 10; d++) {
                for (int i = 0; i <= 50; i++) {
                    int ran1 = r.nextInt(5);
                    if(ran1 == 0){
                        ran1 = 3;
                    }
                    ran1 = ran1*100;
                    System.out.println("随机延时: " + ran1 + "ms    自动重启: " + d + "/10    自动后退: " + i + "/50    ");
                    Thread.sleep(ran1);
                    robot.keyPress(KeyEvent.VK_A);
                    Thread.sleep(50);
                    robot.keyRelease(KeyEvent.VK_A);
                    Thread.sleep(ran1);
                    robot.keyPress(KeyEvent.VK_D);
                    Thread.sleep(50);
                    robot.keyRelease(KeyEvent.VK_D);
                    Thread.sleep(ran1);
                }
                System.out.println("ReStart Key_W");
                robot.keyRelease(KeyEvent.VK_D);
                robot.keyRelease(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_W);
                robot.keyPress(KeyEvent.VK_S);
                Thread.sleep(1000);
                robot.keyRelease(KeyEvent.VK_S);
                robot.keyPress(KeyEvent.VK_W);
            }
            robot.mouseRelease(KeyEvent.BUTTON1_MASK);
            System.out.println("Anti Lobby");
            sendcommand("/hub");
            Thread.sleep(5000);
            sendcommand("/is");
            Thread.sleep(13000);
            System.out.println("Off Fly");
            robot.keyPress(KeyEvent.VK_SHIFT);
            Thread.sleep(3000);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            if (mouseControl){
                Mouse.lookup(Mouse.getX(),Mouse.getY());
            }
            Thread.sleep(2000);
            System.out.println("Restart Mine");
            System.out.println("ReStart Key_W");
            robot.keyPress(KeyEvent.VK_W);
            robot.mousePress(KeyEvent.BUTTON1_MASK);
        }
    }

    public static void sendcommand(String cmd) throws InterruptedException {
        Clipboard.setSysClipboardText(cmd);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_T);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(500);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_T);
        System.out.println("Send: " + cmd);
    }
}
