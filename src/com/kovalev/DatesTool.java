package com.kovalev;

public class DatesTool {

    public static int dateToEpoch(int date) {
        int minDate = 1;
        int maxDate = 2018;
        int epoch = date / 100;

        if (date < minDate || date > maxDate) {
            System.out.println("Wrong date, please provide date in a range of " + minDate + "-" + maxDate);
            return 0;
        }

        if (date < 101) {
            epoch = 1;
        }
        else if (date % 100 > 0) {
            epoch++;
        }
        return epoch;
    }

    public static String getSeasonByMonthNumIf(int month) {
        String season = "";
        if (month < 1 || month > 12) {
            season = ("Unable to define the season. Month number should be in range 1-12");
        } else if (month > 2 && month < 6) {
            season = "Spring";
        } else if (month > 5 && month < 9) {
            season = "Summer";
        } else if (month > 8 && month < 12) {
            season = "Autumn";
        } else {
            season = "Winter";
        }
        return season;
    }

    public static String getSeasonByMonthNumSwitch(int month) {
        String season = "";

        switch (month) {
            case 12:
                return "Winter";

            case 1:
                return "Winter";

            case 2:
                return "Winter";

            case 3:
                return "Spring";

            case 4:
                return "Spring";

            case 5:
                return "Spring";

            case 6:
                return "Summer";

            case 7:
                return "Summer";

            case 8:
                return "Summer";

            case 9:
                return "Autumn";

            case 10:
                return "Autumn";

            case 11:
                return "Autumn";

            default: return "Unable to define the season. Month number should be in range 1-12";
        }
    }

    public static void printNumOfDaysInMonth(int year, int month) {
       int days = 0;
        String monthName;

       if (Month.getMonthNameByNum(month) == Month.FEBRUARY) {
           if (year % 4 == 0 && year % 100 != 0 || year%400==0) {
               days = 29;
           } else {
               days = 28;
           }
       } else {
           days = Month.getDaysInMonth(month);
       }
        monthName = Month.getMonthNameByNum(month)
                .toString()
                .toLowerCase();
        monthName = monthName.substring(0, 1)
                .toUpperCase() + monthName.substring(1);

        System.out.println(monthName + " " + year + " and " + days + " days");
    }
}