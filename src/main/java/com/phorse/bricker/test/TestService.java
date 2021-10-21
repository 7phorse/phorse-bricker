package com.phorse.bricker.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * TODO
 *
 * @author luoxusheng 2021/5/14 11:42
 * @version v1.0.0
 */
public class TestService {

    public static void main(String[] args) {
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(20)).toDays());

    }

}
