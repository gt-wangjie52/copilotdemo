package com.example.copilotdemo;

import com.example.copilotdemo.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author firefly by 2024/1/28
 */
public class PasswordUtilTest {

    public static void main(String[] args) {
        // 读取 DateUtil.java 中的 isPassword 方法,生成一些测试数据
        List<String> list = new ArrayList<>();
        list.add("12345678");
        list.add("12345678Aa!");
        list.add("12345678A");
        list.add("12345678~");
        list.add("12345678!");
        list.add("12345678@");
        list.add("12345678#");
        list.add("12345678$");
        list.add("12345678%");
        list.add("12345678^");
        list.add("1234567");
        // 循环调用 isPassword 方法,输出结果
        for (String str : list) {
            System.out.println(str + " : " + DateUtil.isPassword(str));
        }
    }
}
