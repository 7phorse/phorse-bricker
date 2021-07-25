package com.phorse.bricker.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO
 *
 * @author luoxusheng 2021/5/14 11:42
 * @version v1.0.0
 */
public class TestService {

    public static void main(String[] args) {
        String str = "err(20004)";
        String pattern = "err[(](\\d{5})[)]";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());

    }

}
