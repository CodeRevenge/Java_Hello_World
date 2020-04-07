package com.codekiller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        String greeting = "!Hello World, now I'm a Java Dev!";
        int greetingLength = greeting.length();
        System.out.println(greeting + " " + greetingLength);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Get birthday
        Calendar birthdayCalendar = Calendar.getInstance();
        birthdayCalendar.set(1997, 7, 28);

        System.out.println("Mi birthday is: " + sdf.format(birthdayCalendar.getTime()));

        // Current time
        Date now = new Date();
        System.out.println("The current time is: " + sdf.format(now));

        // Get current age

        long diffInMillis = Math.abs(now.getTime() - birthdayCalendar.getTimeInMillis());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(diffInMillis);
        System.out.println(String.format("My age is %d years, %d months and %d days",
                calendar.get(Calendar.YEAR) - 1970,
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH) - 1));

        Calendar nowCalendar = Calendar.getInstance();
        nowCalendar.setTime(now);
        int bDay = birthdayCalendar.get(Calendar.DAY_OF_MONTH);
        int bMonth = birthdayCalendar.get(Calendar.MONTH);
        int cDay = nowCalendar.get(Calendar.DAY_OF_MONTH);
        int cMonth = nowCalendar.get(Calendar.MONTH);
        int nBdYear = nowCalendar.get(Calendar.YEAR);

        if (cMonth >= bMonth) {
            if (cDay > bDay) {
                nBdYear += 1;
            }
        }
        Calendar nextBirthDay = Calendar.getInstance();
        nextBirthDay.set(nBdYear, bMonth, bDay);

        long toNextBd = Math.abs(nowCalendar.getTimeInMillis() - nextBirthDay.getTimeInMillis());
        Calendar nextBd = Calendar.getInstance();
        nextBd.set(0, nextBirthDay.get(Calendar.MONTH) - nowCalendar.get(Calendar.MONTH),
                nextBirthDay.get(Calendar.DAY_OF_MONTH) - nowCalendar.get(Calendar.DAY_OF_MONTH));

        System.out.println(String.format("There are still %d months and %d days until my birthday",
                nextBd.get(Calendar.MONTH),
                nextBd.get(Calendar.DAY_OF_MONTH) - 1));


        float height = 1.82f;
        System.out.println("Mi height is: " + height);

        double piValue = Math.PI;
        System.out.println("The value of PI is: " + piValue);

        long distanceToSun = 471628376481726846L;
        System.out.println("The distance to the Sun is: " + distanceToSun);

        boolean isDay = false;
        System.out.println("It is day:" + isDay);

        char myInitial = 'C';
        System.out.println("The fist letter of my name is: " + myInitial);
    }
}
