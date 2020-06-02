package se.lexicon.MartinKlasson;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class App {
    public static void main( String[] args ) {

        //Ex 1.
        LocalDate today = LocalDate.now();
        System.out.println("Current day: " + today);
        System.out.println("");

        //Ex 2.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee d MMMM");
        String todayFormat = today.format(formatter);
        System.out.println("Today is: " + todayFormat);
        System.out.println("");

        //Ex 3.
        LocalDate lastMonday = today.minusWeeks(1);
        for(int i=0; i<7; i++){
            System.out.println("ISO week: " + lastMonday.plusDays(i));
        }

        //Ex 4.
        LocalDate parseDate = LocalDate.parse("2020-06-01");
        System.out.println("");
        System.out.println("Parsed date: " + parseDate);
        System.out.println("");

        //Ex 5.
        LocalDate wictoryDay = LocalDate.of(1945, 5 ,8);
        DayOfWeek wictoryWeekDay = wictoryDay.getDayOfWeek();
        System.out.println("Wictory week day: " + wictoryWeekDay);
        System.out.println("");

        //Ex 6.
        LocalDate futureDate = today.plusYears(10).minusMonths(10);
        System.out.println(futureDate.getMonth());
        System.out.println("");

        //Ex 7.
        LocalDate myBirthdate = LocalDate.of(1965,1,4);
        Period timeBetweenWictories = Period.between(wictoryDay, myBirthdate);
        int years = timeBetweenWictories.getYears();
        int months = timeBetweenWictories.getMonths();
        int days = timeBetweenWictories.getDays();
        System.out.println("Elapsed time from Wictory Day until Wictory Birth is "
                            + years + " years " + months + " months and " + days + " days."  );
        System.out.println("");

        //Ex 8.
        Period period = Period.of(4, 7, 29);
        LocalDate periodFromToday = today.plus(period);
        System.out.println("Date from today until period ends: " + periodFromToday);
        System.out.println("");

        //Ex 9 & 10:
        LocalTime currentTime = LocalTime.now();
        System.out.println("Nanoseconds of current time is: " + currentTime.getNano());
        System.out.println("");

        //Ex 11.
        LocalTime parseTime = LocalTime.parse("14:14");
        System.out.println("Parsed time: " + parseTime);
        System.out.println("");

        //Ex 12.
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm:ss");
        String nowTime = currentTime.format(formatter2);
        System.out.println("Time is: " + nowTime);
        System.out.println("");

        //Ex 13.
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        String d = date.format(DateTimeFormatter.ofPattern("yyyy MM dd"));
        String t = time.format(DateTimeFormatter.ofPattern("hh:mm"));
        System.out.println("date: " + d + ", " + "time: " + t);
        System.out.println("");

        //Ex 14.
        LocalDateTime dateAndTime = LocalDateTime.now();
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("eeee d MMMM hh mm");
        String newFormat = dateAndTime.format(formatter3);
        System.out.println("Today is: " + newFormat);
        System.out.println("");



//        LocalTime current = LocalTime.now();
//        LocalDate myBirthday = LocalDate.of(1965,1,4);
//        LocalDate brothersBirthday = LocalDate.of(1962, 5, 6);
//        LocalDate momsBirthday = LocalDate.of(1939, 8, 22);
//        LocalDate fathersBirthday = LocalDate.of(1933, 3,31);
//        LocalDate grandmaBirthday = LocalDate.of(1920, 12, 25);
//        LocalDate grandfaBirthday = LocalDate.of(1916, 11, 17);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee d MMMM YYYY");
//        String birthD = myBirthday.format(formatter);
//        String broD = brothersBirthday.format(formatter);
//        String momD = momsBirthday.format(formatter);
//        String faD = fathersBirthday.format(formatter);
//        String grMD = grandmaBirthday.format(formatter);
//        String grFa = grandfaBirthday.format(formatter);
//        System.out.println(birthD);
//        System.out.println(broD);
//        System.out.println(momD);
//        System.out.println(faD);
//        System.out.println(grMD);
//        System.out.println(grFa);
    }
}
