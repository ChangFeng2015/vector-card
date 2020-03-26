package com.qiqilab.utils;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateUtil {

    public static Instant getNow() {
        return Instant.now();
    }

    public static LocalDate getYestoday() {
        LocalDate today = getToday();
        return today.minus(1, ChronoUnit.DAYS);
    }

    public static LocalDate getLastWeek() {
        LocalDate today = getToday();
        return today.minus(1, ChronoUnit.WEEKS);
    }

    public static LocalDate getToday() {
        return LocalDate.now(ZoneId.of("Asia/Shanghai"));
    }

    public static Float getMinutes(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start,end);
        return Float.valueOf(duration.toMinutes());
    }
}
