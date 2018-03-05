package com.kovalev;

import java.util.HashMap;
import java.util.Map;

public enum Month {
    JANUARY(1, 31), FEBRUARY(2, 28), MARCH(3, 31), APRIL(4, 30), MAY(5, 31), JUNE(6, 30), JULY(7, 31), AUGUST(8, 31),
    SEPTEMBER(9, 30), OCTOBER(10, 31), NOVEMBER(11, 30), DECEMBER(12, 31);

    private int monthNum;
    private int daysInMonth;
    private static Map<Integer, Month> monthNumMap = new HashMap<Integer, Month>();
    private static Map<Integer, Integer> daysInMonthMap = new HashMap<Integer, Integer>();

    private Month(final int num, final int days) {
        monthNum = num;
        daysInMonth = days;
    }

    static {
        for (Month monthEnum : Month.values()) {
            monthNumMap.put(monthEnum.monthNum, monthEnum);
        }
    }

    static {
        for (Month monthEnum : Month.values()) {
            daysInMonthMap.put(monthEnum.monthNum, monthEnum.daysInMonth);
        }
    }

    public static int getDaysInMonth(int num) {
        return daysInMonthMap.get(num);
    }

    public static Month getMonthNameByNum(int num) {
        return monthNumMap.get(num);
    }
}
