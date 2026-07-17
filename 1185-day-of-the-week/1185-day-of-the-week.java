import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year,month,day);
        DayOfWeek dy = date.getDayOfWeek();
        String daysName = dy.toString();
        return daysName.substring(0, 1).toUpperCase() + daysName.substring(1).toLowerCase();

    }
}