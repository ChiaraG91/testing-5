import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    @Test
    void dateOperation() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataTest = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        OffsetDateTime Year = data.plusYears(1);
        String year = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        assertEquals( "1 mar 2024, 13:00:00", "1 mar 2024, 13:00:00");
        OffsetDateTime Month = data.minusMonths(1);
        String month = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        assertEquals("1 feb 2023, 13:00:00","1 feb 2023, 13:00:00");
        OffsetDateTime Week = data.plusDays(7);
        String days = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        assertEquals("8 mar 2023, 13:00:00","8 mar 2023, 13:00:00");

    }
}