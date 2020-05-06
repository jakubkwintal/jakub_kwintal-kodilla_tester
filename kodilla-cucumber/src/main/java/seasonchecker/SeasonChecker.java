package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {

    public String checkIfSummer(MonthDay date) {
        if (date.isAfter(MonthDay.of(6, 20)) && date.isBefore(MonthDay.of(9, 24))) {
        //* CIEKAWOSTKA: isBefore(MonthDay.of()) i isAfter((MonthDay.of()) można razem używać tylko w ramach jednego roku, tzn. nie można napisać że coś jest po 23 września a przed 21 czerwca;
            return "Yes! Summer!";
        }
        return "Nope";
    }
}
