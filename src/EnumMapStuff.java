import java.util.EnumMap;

public class EnumMapStuff {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        EnumMap<Day, String> schedule = new EnumMap<>(Day.class);
        schedule.put(Day.MONDAY, "Attend a meeting with Trevor");
        schedule.put(Day.TUESDAY, "Learn about collections");
        System.out.println(schedule);
        schedule.remove(Day.MONDAY);
        System.out.println(schedule);
    }
}
