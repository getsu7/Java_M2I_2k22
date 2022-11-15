import java.util.Calendar;

public class Exercice5 {
    private final int year;
    private final int month;
    private final int date;
    private final int day;
    private final int hour;
    private final int minute;
    private final int second;

    public static void main(String[] args) {
        Exercice5 calendar = new Exercice5();
        System.out.println(calendar);
    }
    public Exercice5(){
        Calendar calendar = Calendar.getInstance();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.date = calendar.get(Calendar.DAY_OF_MONTH);
        this.day = calendar.get(Calendar.DAY_OF_WEEK);
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }
    public String getMonth() {
        return switch (month) {
            case Calendar.FEBRUARY -> "Février";
            case Calendar.MARCH -> "Mars";
            case Calendar.APRIL -> "Avril";
            case Calendar.MAY -> "Mai";
            case Calendar.JUNE -> "Juin";
            case Calendar.JULY -> "Juillet";
            case Calendar.AUGUST -> "Aout";
            case Calendar.SEPTEMBER -> "Septembre";
            case Calendar.OCTOBER -> "Octobre";
            case Calendar.NOVEMBER -> "Novembre";
            case Calendar.DECEMBER -> "Décembre";
            default-> "Janvier";
        };
    }
    public String getDay() {
        return switch (day) {
            case Calendar.TUESDAY -> "Mardi";
            case Calendar.WEDNESDAY -> "Mercredi";
            case Calendar.THURSDAY -> "Jeudi";
            case Calendar.FRIDAY -> "Vendredi";
            case Calendar.SATURDAY -> "Samedi";
            case Calendar.SUNDAY -> "Dimanche";
            default -> "Lundi";
        };
    }
    public int getYear() {
        return year;
    }
    public int getDate() {
        return date;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    @Override
    public String toString(){
        return "Bonjour ! il est "
                + getHour() + " heures "
                + getMinute() + " minutes "
                + getSecond() + " secondes." +
                " Nous sommes le " + getDay()
                + " " + getDate()
                + " " + getMonth()
                + " " + getYear();
    }
}
