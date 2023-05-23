package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) { //сумма всех продаж (1 задание)
        int sale = 0; //продажи за месяц,начальное значение равно 0
        for (int s : sales) {
            sale += s;
        }
        return sale;
    }

    public float calcAverageSum(int[] sales) {  //средняя сумма продаж в месяц (2 задание)
        //float a = calcSum(sales);
        return (float) calcSum(sales) / (sales.length);
    }

    public int maxSales(int[] sales) { // № месяца, в кот. был пик продаж (3 задание)
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;  //не month, т.к. он последний цикл будет показывать на 1 больше
    }


    public int minSales(int[] sales) { //№ месяца, в который был минимум продаж (вопрос - почему тип данных массива long?)
        int minMonth = 0; // переменная для хранения номера ячейки в массиве месяца, в котором были минимальные продажи
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

    public int minCalcAverageSum(int[] sales) {     // задание 5
        float a = calcAverageSum(sales);
        int month = 0;
        for (float sale : sales) {
            if (sale < a) {
                month++;
            }
        }
        return month;
    }

    public int maxCalcAverageSum(int[] sales) {     // задание 6
        float a = calcAverageSum(sales);
        int month = 0;
        for (float sale : sales) {
            if (sale > a) {
                month++;
            }
        }
        return month;
    }

}


