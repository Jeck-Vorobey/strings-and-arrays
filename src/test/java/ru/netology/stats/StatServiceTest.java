package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void shouldFindNegative() {  //тест задания № 1 на правильность подсчета
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.calcSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void correctScore() { //тест задания № 2 на правильность подсчета
        StatsService middle = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expectedSum = 15;
        float actualSum = middle.calcAverageSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindPeak() {// тест задания № 3 на возврат номера последнего пикового месяца
        StatsService peak = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = peak.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMin() {// тест задания № 4 на возврат номера последнего месяца с минимальными продажами
        StatsService minNumber = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = minNumber.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


}
