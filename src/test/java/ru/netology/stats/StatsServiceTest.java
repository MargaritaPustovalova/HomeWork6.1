package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void minStales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minStales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void allSalesSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.allSalesSum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void bigSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.bigSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void smallSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.smallSales(sales);

        assertEquals(expected, actual);
    }
}
