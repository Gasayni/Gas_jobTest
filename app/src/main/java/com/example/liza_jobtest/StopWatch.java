package com.example.liza_jobtest;

// Класс Секундомер
// Вызывается метод start - когда нужно запустить секундомер
// и метод stop - когда нужно остановить секундомер

// Метод stop останавливает секундомер и возвращает количество милисекунд в формате long

import java.util.Date;

public class StopWatch {
    private static Date time_start, time_end;
    private static long result;

    public static void start() {
        time_start = new Date();
    }

    public static long stop() {
        time_end = new Date();
        result = time_end.getTime() - time_start.getTime();

        return result;
    }
}