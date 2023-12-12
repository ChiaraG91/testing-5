import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    public static void main(String[] args) {

        dateOperation();
    }

    public static void dateOperation(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);
        String firstDate = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("firstDate: " + firstDate);

        OffsetDateTime Year = data.plusYears(1);
        String nextYear = Year.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("nextYear: " + nextYear);

        OffsetDateTime Month = data.minusMonths(1);
        String lastMonth = Month.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("lastMonth: " + lastMonth);

        OffsetDateTime Week = data.plusDays(7);
        String nextWeek = Week.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("nextWeek: " + nextWeek);
    }
}

