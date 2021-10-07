package com.wyh2004.skyblock.automine;

import com.wyh2004.skyblock.automine.module.Module01;
import com.wyh2004.skyblock.automine.module.Module02;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

/**
 * @author Wang Yuhao
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("正在注册功能，如果出现错误请更换Java版本");
        try {
            Robot robot = new Robot();
            robot.setAutoWaitForIdle(true);
            Point test = MouseInfo.getPointerInfo().getLocation();
            System.out.println("注册成功");
        } catch (Exception e){
            System.out.println("注册失败");
            e.printStackTrace();
        }

        String username = System.getProperty("user.name");

        System.out.println("Code By WYH2004");
        System.out.println("Auto Mine Version: " + "2.2");
        System.out.println("免责声明：使用本软件仅供学习参考，请在24小时内自行删除");
        System.out.println("          如果发生账号封禁等问题，责任由用户(" + username + ")自己负责");

        Scanner s = new Scanner(System.in);

        System.out.println("请输入模型编号:");
        int a = s.nextInt();
        System.out.println("你输入了 " + a);
        System.out.print("正在尝试加载 模式" + a + "   ");
        for (int d = 50; d > 0 ; d--){
            System.out.print(".");
            Thread.sleep(200);
        }
        System.out.println();

        System.out.println();
        System.out.println("=================== 我是华丽的分割线 ===================");
        System.out.println();

        Timer timer = new Timer();

        if (a == 1){
            Module01.main();
        }else if (a == 2){
            Module02.main();
        }else if (a == 3){

        }else {
            throw new RuntimeException("输入参数错误");
        }
    }
}
