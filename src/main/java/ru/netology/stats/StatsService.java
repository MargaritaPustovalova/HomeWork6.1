package ru.netology.stats;

public class StatsService {

     public int minStales(long[] sales) {
    int minMonth = 0;
    int month = 0; // переменная для индекса рассматриваемого месяца в массиве
    for (long sale : sales) {
        // sales[minMonth] - продажи в месяце minMonth
        // sale - продажи в рассматриваемом месяце
        if (sale <= sales[minMonth]) {
            minMonth = month;
        }
        month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
    }
    return minMonth + 1;
}

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            // аналог sum = sum + sale;
            sum += sale;
        }
        return sum;
    }

    public int averageSum(long[] sales) {
        long sum = 0;
        //long avg = sum / 12;
        for (long sale : sales) {
            sum += sale;
        }
        return (int) sum / 12;
        //System.out.println("Среднее арифметическое " + result / nums.length);
    }

    public long bigSales(long[] sales) {
        long bigsale = sales [0];
        //int month = 0;
        for (long sale : sales) {
            if (bigsale > 15) {
                bigsale += sale;
            }
        }
        return bigsale;

        }

    public long smallSales(long[] sales) {
        //long sum = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        //long avg = sum / 12;
        for (long sale : sales) {

            if (sale < 15) {
                sale = month;
            }
            sale += month; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return month;
    }

//    public long findMax(long[] purchases) {
//        long currentMax = purchases[0];
//        for (long purchase : purchases) {
//            if (currentMax < purchase) {
//                currentMax = purchase;
//            }
//        }
//        return currentMax;
//    }
}

