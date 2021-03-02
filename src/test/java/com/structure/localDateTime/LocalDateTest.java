package com.structure.localDateTime;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Slf4j
public class LocalDateTest {

    @Test
    public void test6(){
        LocalDate localDate = LocalDate.now();
        boolean present = Optional.ofNullable(localDate).isPresent();
        log.info("传入对象是否有值：{}",present);
        LocalDate localDate1 = Optional.ofNullable(localDate).orElse(LocalDate.now());
        log.info("localDate1 的值：{}",localDate1);
        Optional.ofNullable(localDate).ifPresent(localDate2 -> localDate2.withYear(2022));
        log.info("如果该值存在，则指定年份为：{}",localDate);
    }

    @Test
    public void test5(){
        LocalDateTime dateTime1 = LocalDateTime.now();
        log.info("LocalDateTime时间：{}",dateTime1);
        LocalDate localDate = dateTime1.toLocalDate();
        log.info("LocalDateTime转localDate：{}",localDate);
        LocalTime localTime = dateTime1.toLocalTime();
        log.info("LocalDateTime转LocalTime: {}",localTime);
        String format = dateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("格式化LocalDate: {}", format);
        long l = dateTime1.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        log.info("获取毫秒时间：{}",l);
    }

    @Test
    public void test4(){
        LocalTime now = LocalTime.now();
        log.info("当前时间：{}",now);
        LocalTime localTime = now.withHour(3);
        log.info("将当前时间设置时：{}",localTime);
        LocalTime localTime1 = now.withMinute(50);
        log.info("将当前时间设置分：{}",localTime1);
        LocalTime localTime2 = now.withSecond(24);
        log.info("将当前时间设置为秒：{}",localTime2);
    }

    @Test
    public void test3(){
        LocalDate now = LocalDate.now();
        log.info("当前时间是{}",now);
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        log.info("获取星期几{}",dayOfWeek.getValue());
        int dayOfMonth = now.getDayOfMonth();
        log.info("当前时间是这个月的第几天{}",dayOfMonth);
        int dayOfYear = now.getDayOfYear();
        log.info("当前时间是这个年的第几天{}",dayOfYear);
    }

    @Test
    public void test2(){
        LocalDate now = LocalDate.now();
        Month month = now.getMonth();
        int value = month.getValue();
        log.info("当前月份是{}月",value);

        int monthValue = now.getMonthValue();
        log.info("当前月份是{}月",monthValue);
    }

    @Test
    public void test1(){
        LocalDate now = LocalDate.now();
        log.info("获取当前时间{}",now);
        now = now.minusYears(1);
        log.info("获取上一年的时间{}",now);
        now = now.minusMonths(1);
        log.info("获取上个月的时间{}",now);
        now = now.plusWeeks(1);
        log.info("加一个星期后的时间{}",now);
        now = now.plusMonths(2);
        log.info("加两个月后的时间{}",now);
    }

}
