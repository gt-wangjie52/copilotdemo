package com.example.copilotdemo.util;

import com.example.copilotdemo.model.School;

/**
 * 描述：
 *
 * @author firefly by 2024/1/28
 */
public class DateUtil {
    // 写一个验证密码的正则表达式，条件是密码必须包含至少一个小写字母、一个大写字母、一个数字和一个特殊字符，且至少8个字符长。
    public static boolean isPassword(String str){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[~!@#$%^&*()_+`\\-={}\\[\\]:\";'<>?,.\\/]).{8,}$";
        return str.matches(regex);
    }

}
