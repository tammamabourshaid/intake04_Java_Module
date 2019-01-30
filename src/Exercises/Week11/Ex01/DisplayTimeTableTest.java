package Exercises.Week11.Ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class DisplayTimeTableTest {


    @Test
    void displayTimeAndDate() {
//        He wakes up and stops his alarm. What time is it displayed in
//        the format Hours:Minutes? What day of the week is this?
        LocalDate dayOfStart = LocalDate.of(2003, 03, 13);
        LocalTime timeOfStart = LocalTime.parse("10:00");
        LocalDateTime setTimes = LocalDateTime.of(dayOfStart, timeOfStart);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formatted = setTimes.format(formatter);

        System.out.println("Display The Format: " + formatted);
        DayOfWeek dayOfWeek = dayOfStart.getDayOfWeek();

        System.out.println("Day of the Week: " + dayOfWeek);

        LocalTime expectedTime = LocalTime.parse("10:00");
        DayOfWeek expectedDate = DayOfWeek.THURSDAY;

        Assertions.assertEquals(expectedTime, timeOfStart);
        Assertions.assertEquals(expectedDate, dayOfWeek);

//        It takes him 37 minutes and 21 seconds to get ready to be picked up by the limousine.
//        What time is it displayed in the format Hours:Minutes:Seconds?
        LocalTime addMinutesandSeconds = timeOfStart.plusMinutes(37).plusSeconds(21);
        DateTimeFormatter formatterWithSeconds = DateTimeFormatter.ofPattern("HH:mm:ss");
        String format = addMinutesandSeconds.format(formatterWithSeconds);
        System.out.println("\nDisplayed in the format: " + format);

        LocalTime expectedtime = LocalTime.parse("10:37:21");

        Assertions.assertEquals(expectedtime, addMinutesandSeconds);

//        The limousine arrives at the airport one and a half hours later because of
//        traffic jam. At what time do they arrive at the airport?
        LocalTime addOneandHalfour = addMinutesandSeconds.plusHours(1).plusMinutes(30);
        LocalDateTime dateTime = LocalDateTime.of(dayOfStart, addOneandHalfour);
        System.out.println("\nTime do they arrive at the airport: " + dateTime);


        LocalTime expectedTimeAdded = LocalTime.parse("12:07:21");
        Assertions.assertEquals(expectedTimeAdded, addOneandHalfour);

//        Mugatu checks the departure time of his flight and it says 11:04 am.
//        Is this time before the current one? Did he miss his flight?
        LocalTime airportTime = LocalTime.parse("11:04:00");
        boolean missTheFlight = addOneandHalfour.isAfter(airportTime);
        System.out.println("\nDid he miss the Flight: " + missTheFlight);
        Assertions.assertTrue(missTheFlight);

//        He asks at the info desk when the next flight is.
//        The next flight will be at 18:45. How many hours and minutes
//        does he have to wait?
        LocalTime arrival = LocalTime.parse("12:07:21");
        LocalTime nextFlight = LocalTime.parse("18:45:00");
        Duration durationArrivalAndNextFlight = Duration.between(arrival, nextFlight);
        System.out.println("\nHow many hours and minutes does he have to wait: " + durationArrivalAndNextFlight);
        Duration durationTime = Duration.parse("PT6H37M39S");
        Assertions.assertEquals(durationTime, durationArrivalAndNextFlight);

//        He finally gets in the plane and departs at 18:45 from London.
//        It takes him 11 hours and 50 minutes to land in
//        Tokyo. What time is it in London? What date and time is it in Tokyo?

        LocalDateTime timeInLondon = LocalDateTime.of(2003, 03, 13, 18, 45);
        LocalDateTime arrivalToTokyo = timeInLondon.plusHours(11).plusMinutes(50);
        System.out.println("\nTime in London: " + arrivalToTokyo);


        ZoneId zoneLondon = ZoneId.of("Europe/London");
        ZonedDateTime arrivalLondonTime = arrivalToTokyo.atZone(zoneLondon);
        System.out.println("\nArrival in London time: " + arrivalLondonTime);


        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime arrivalTokyoTime = arrivalLondonTime.withZoneSameInstant(zoneTokyo);
        System.out.println("\nArrival in Tokyo time: " + arrivalTokyoTime);

//     After two hours he manages to arrive to his hotel in Tokyo and sleeps for 9 hours straight until
//     he wakes up abruptly. At what time is his manager hitting him in the
//     head with the pillows to wake him up?
//
        LocalDateTime timeInTokyo = arrivalTokyoTime.toLocalDateTime();
        LocalDateTime arrivingToHotel = timeInTokyo.plusHours(11);
        System.out.println("\nWhat time is his manager wake him up: " + arrivingToHotel);

//        They tell him that the advertisement shooting starts in 47 minutes. When is that exactly?

        LocalDateTime advertiseStart = arrivingToHotel.plusMinutes(47);
        System.out.println("\nadvertisement shooting starts: " + advertiseStart);

//        They throw him with his clothes and make up set into the limousine and rush towards the studio arriving just
//        in time. However, Mugatu received a private phone call from his assistant Katinka that lasted 546 seconds.
//                How much time in minutes and seconds did Mugatu have to get prepared in the limousine?

        LocalDateTime plusSeconds = advertiseStart.minusSeconds(546);
        Duration betweenAdvAndPlus = Duration.between(advertiseStart, plusSeconds);
        System.out.println("\nTime Mugatu have to get prepared in the limousine: " + betweenAdvAndPlus);

//        After 7 hours the shooting is over. Lunch time is round 13:00 and dinner time is around 20:00. Should
//        Mugatu have lunch or dinner?

        LocalDateTime afterShootingOver = plusSeconds.plusHours(7);
        System.out.println("\nThe shooting is over at: " + afterShootingOver);

        LocalDateTime lunch = LocalDateTime.of(2003, 03, 15, 13, 00, 00);
        LocalDateTime dinner = LocalDateTime.of(2003, 03, 15, 20, 00, 00);

//        System.out.println("\nPrint Lunch Format: " + lunch);


//        Duration durationBetweenShootAndLunch = Duration.between(afterShootingOver, lunch);
//        System.out.println("\nduration between Shoot and Lunch: " +durationBetweenShootAndLunch);

        long numberMinutesTillLunch = afterShootingOver.until(lunch, ChronoUnit.HOURS);
        long numberMinutesTillDinner = afterShootingOver.until(dinner, ChronoUnit.HOURS);

        System.out.println("\nnumber minutes till Lunch: " + numberMinutesTillLunch);
        System.out.println("\nnumber minutes till Dinner: " + numberMinutesTillDinner);


        if (numberMinutesTillLunch < numberMinutesTillDinner) {
            System.out.println("\nHave a lunch");
        } else
            System.out.println("\nHave a dinner");


//        After three days and 12 hours, Mugatu finally takes his flight back to London. After the 11 hours and 50
//        minutes of flight back, he lands in London. What time is it in Tokyo? What date is it in London?

        LocalDateTime backToLondon = afterShootingOver.plusDays(3).plusHours(23).plusMinutes(50);
        System.out.println("\nTime Back in London: " + backToLondon);


        ZonedDateTime londonZone = backToLondon.atZone(zoneLondon);
        ZonedDateTime tokyoZone = londonZone.withZoneSameInstant(zoneTokyo);

        System.out.println("\nTime Back in Tokyo: " + tokyoZone);

//        At the airport he gets surrounded by 173 fans and it takes him 12 seconds to give each one of them an
//        autograph. How many hours and minutes did he spend dispatching his fans?

        LocalTime time = LocalTime.ofSecondOfDay((173 * 12));

        System.out.println("\nFans dispatching time: " + time);
        System.out.println("Hours: " + time.getHour());
        System.out.println("Minutes: " + time.getMinute());
        System.out.println("Seconds: " + time.getSecond());

//        Mugatu arrives at his hotel one hour later and decides to go to the sauna. This one is only open from 9:00 to
//        14:00 and from 16:00 to 20:00. Can he at least manage to stay in the sauna for half an hour?

        LocalDateTime timereachToHotel = backToLondon.plusHours(1);
        System.out.println("\nTime reach to the Hotel: " + timereachToHotel);

        LocalDateTime startSaunaMorning = LocalDateTime.of(2003, 03, 19, 9, 00, 00);
        LocalDateTime endSaunaMorning = LocalDateTime.of(2003, 03, 19, 14, 00, 00);
//        LocalDateTime startSaunaevening = LocalDateTime.of(2003, 03, 19, 16, 00, 00);
//        LocalDateTime endSaunaevening = LocalDateTime.of(2003, 03, 19, 20, 00, 00);

        long fromReachHoteltillSaunaMorning = startSaunaMorning.until(timereachToHotel, ChronoUnit.HOURS);
        System.out.println("\nFrom reach Hotel till SaunaMorning: " + fromReachHoteltillSaunaMorning);

        long morningSauna = startSaunaMorning.until(endSaunaMorning, ChronoUnit.HOURS);
//        long eveningSauna = startSaunaevening.until(endSaunaevening, ChronoUnit.HOURS);

        System.out.println("\nDuration Sauna at Morning : " + morningSauna);
//        System.out.println("\nDuration Sauna at Evening : " + eveningSauna);

        boolean canHeStay30MinutesInSauna = timereachToHotel.minusMinutes(30).isBefore(endSaunaMorning);
        System.out.println(canHeStay30MinutesInSauna);

        if (fromReachHoteltillSaunaMorning < morningSauna) {
            System.out.println("\nMugatu can have Sauna");
        } else System.out.println("\nHave Sauna in Evening Time");

//  The special one-hour massage offered by the hotel is on Thursdays and Sundays,
//  and if it is a leap year, also on Saturdays. Can Mugatu be lucky enough to get one of those?

        DayOfWeek dayOfWeeksinceReachHotel = timereachToHotel.getDayOfWeek();

        LocalDate dayOfReachTheHotel = timereachToHotel.toLocalDate();
        System.out.println("\nDay and Date Of Week since reach Hotel: " + dayOfWeeksinceReachHotel + " " + dayOfReachTheHotel);

        boolean isItLeapYear = dayOfReachTheHotel.isLeapYear();
        System.out.println("\nis it a leap year: " + isItLeapYear);

        boolean canHaveSauna = couldMugatuHaveSauna(dayOfReachTheHotel);

        if (canHaveSauna == true) {
            System.out.println("\nMugatu Can have a Massage");
        } else System.out.println("\nMugatu Can not have a Massage");

//        One week later, the advertisement is broadcasted at 18:30 in Tokyo’s time.
//        When does Mugatu have to turn on the TV in London to be able to see it?

        LocalDateTime dateafterOneWeek = timereachToHotel.plusWeeks(1);
        System.out.println("\nThe Date after one Week: " + dateafterOneWeek);
        LocalDateTime advertiseBroadcastInLondon = LocalDateTime.parse("2003-03-26T11:02:54");


        ZoneId Tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime broadcastInLondon = advertiseBroadcastInLondon.atZone(ZoneId.of("Europe/London"));
        ZonedDateTime broadcastInTokyo = broadcastInLondon.withZoneSameInstant(Tokyo);

        System.out.println("\nturn on the TV in London to see advertisement: " + broadcastInTokyo);

//        The advertisement lasts 29 seconds. Fifteen seconds afterwards his manager calls
//        him on the phone to congratulate him for his popularity increase.
//        At what time exactly does this happen? What day of the week is this?

        LocalDateTime timeAfterSeenAdvertiseAndCall = advertiseBroadcastInLondon.plusSeconds(29).plusSeconds(15);
        DayOfWeek dayOfWeekManagerCall = DayOfWeek.from(timeAfterSeenAdvertiseAndCall);
        System.out.println("\nWhen is it happened: " + timeAfterSeenAdvertiseAndCall);
        System.out.println("\nWhat the day does it happened: " + dayOfWeekManagerCall);

//        How many days have passed by since he woke up at the beginning of the timetable?
        LocalDate dateAtFinish = dateafterOneWeek.toLocalDate();
        Period periodBetweenBeginAndEnd = Period.between(dayOfStart, dateAtFinish);
        System.out.println("\nThe Period time between: " + periodBetweenBeginAndEnd);

//    Mugatu gets paid for the timetable rights 1.39 Euro per minute of his privacy
//   since the beginning of the timetable until the end, except for the time
//  of the private call that Mugatu had with Katinka. How much is he paid for this reportage?
        int howManyDays = periodBetweenBeginAndEnd.getDays();
        double totalPaid = (howManyDays * 24 * 60 * 1.39);
        System.out.println("\nHe will get : " + totalPaid);


    }

    private boolean couldMugatuHaveSauna(LocalDate dayOfReachTheHotel) {
        return dayOfReachTheHotel.equals(DayOfWeek.THURSDAY) ||
                dayOfReachTheHotel.equals(DayOfWeek.SUNDAY) ||
                dayOfReachTheHotel.isLeapYear() && dayOfReachTheHotel.equals(DayOfWeek.SATURDAY);


    }
}

