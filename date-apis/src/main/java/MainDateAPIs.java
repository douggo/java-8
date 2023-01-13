import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class MainDateAPIs {

    public static void main(String[] args) {
        workingWithLocalDateApi();
        breakLine();
        workingWithPeriodApi();
        breakLine();
        workingWithFormatterApi();
        breakLine();
        workingWithLocalDateTimeApi();
        breakLine();
        workingWithYearMonthApi();
        breakLine();
        workingWithLocalTimeApi();
    }

    private static void breakLine() {
        System.out.println();
        System.out.println("----------------");
        System.out.println();
    }

    private static void workingWithLocalDateApi() {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate rioOlympic = LocalDate.of(2016, Month.JUNE, 5);
        System.out.println(rioOlympic);

        int years = today.getYear() - rioOlympic.getYear();
        System.out.println(years);
    }

    private static void workingWithPeriodApi() {
        LocalDate today = LocalDate.now();
        LocalDate rioOlympic = LocalDate.of(2016, Month.JUNE, 5);

        Period period = Period.between(rioOlympic, today);
        System.out.println(period);
        System.out.println(period.toTotalMonths() + " months total");
        System.out.println(period.getYears() + " years");
        System.out.println(period.getMonths() + " months");
        System.out.println(period.getDays() + " days");

        System.out.println();

        System.out.println(today.minusDays(1));
        System.out.println(today.minusMonths(2));
        System.out.println(today.minusYears(1));

        System.out.println();

        System.out.println(today.plusDays(1));
        System.out.println(today.plusMonths(2));
        System.out.println(today.plusYears(1));
    }

    private static void workingWithFormatterApi() {
        LocalDate today = LocalDate.now();
        LocalDate rioOlympic = LocalDate.of(2016, Month.JUNE, 5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(rioOlympic.format(formatter));
        System.out.println(today.format(formatter));
    }

    private static void workingWithLocalDateTimeApi() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(now.format(formatter));
    }

    private static void workingWithYearMonthApi() {
        YearMonth yearMonth = YearMonth.of(2020, Month.MARCH);
        System.out.println(yearMonth.format(DateTimeFormatter.ofPattern("MM/yyyy")));
    }

    private static void workingWithLocalTimeApi() {
        LocalTime hour = LocalTime.of(14,48);
        System.out.println(hour);
    }

}
