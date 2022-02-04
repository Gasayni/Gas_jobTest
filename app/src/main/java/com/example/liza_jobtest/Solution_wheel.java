package com.example.liza_jobtest;

public class Solution_wheel {
    // Мы засекли время вращения колеса
    // мы знаем время 1 оборота = 1с
    // нам нужно Узнать какое число вышло после нажатия стоп
    private static int result = 0;
    private static int time_to_full = 1000;
    private static int count_segment = 7;

    public static int sulution(long msec) {
        // Колесо крутится по ч.с., начиная с 15
        // Если за 1с колесо делает полный оборот, значит каждое деление происходит
        // за 1/7сек. - 360/7 градусов

        double time_to_segment = time_to_full / count_segment;
        // Убираем полные обороты
        double turn = (msec % time_to_full);

        if (turn >= 0 && turn < time_to_segment) {
            result = 15;
        } else if (turn >= time_to_segment && turn < 2 * time_to_segment) {
            result = 10;
        } else if (turn >= 2 * time_to_segment && turn < 3 * time_to_segment) {
            result = 5;
        } else if (turn >= 3 * time_to_segment && turn < 4 * time_to_segment) {
            result = 35;
        } else if (turn >= 4 * time_to_segment && turn < 5 * time_to_segment) {
            result = 30;
        } else if (turn >= 5 * time_to_segment && turn < 6 * time_to_segment) {
            result = 25;
        } else if (turn >= 6 * time_to_segment && turn < 7 * time_to_segment) {
            result = 20;
        }
        return result;
    }
}
