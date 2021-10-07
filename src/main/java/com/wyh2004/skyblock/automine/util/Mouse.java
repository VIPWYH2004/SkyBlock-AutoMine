package com.wyh2004.skyblock.automine.util;

import java.awt.*;

public class Mouse {
    private static Robot robot;

    static {
        try {
            robot = new Robot();
            robot.setAutoWaitForIdle(true);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    private static int x = 0;
    private static int y = 0;

    public static int getX(){
        Point point = MouseInfo.getPointerInfo().getLocation();
        x = point.x;
        return x;
    }

    public static int getY(){
        Point point = MouseInfo.getPointerInfo().getLocation();
        y = point.y;
        return y;
    }

    public static void lookup(int xx,int yy){
        System.out.println("lookup!!!");

        for (int i = 0; i < 10; i++) {
            robot.mouseMove(xx + 0,yy - 100);
            robot.delay(100);
        }
    }

}
