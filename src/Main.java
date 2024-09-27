import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(2007, 3, 29, 5, 0, 0);
        ZoneId us = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, us);

        ZoneId london = ZoneId.of("Europe/Paris");
        ZonedDateTime birthdayParis = birthdayZoned.withZoneSameInstant(london);
        System.out.println(birthdayZoned);
        System.out.println(birthdayParis);




    }
}
