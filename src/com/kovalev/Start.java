package com.kovalev;

import Task9.ListChar;
import Task9.ListCharExtended;

import java.util.List;

public class Start {

    static char[] alpha ={ 'a', 'b', 'c', 'd', 'e' };
    static char[] betta ={ 'e', 'b', 'c', 'd', 'a' };

    public static void main(String[] args) {

        ListCharExtended listChar1Extended = new ListCharExtended();
        System.out.println(listChar1Extended.add('A'));
        System.out.println(listChar1Extended.add('B'));
        System.out.println(listChar1Extended.add('C'));
        ListCharExtended listChar2Extended = new ListCharExtended();
        System.out.println(listChar2Extended.add('A'));
        System.out.println(listChar2Extended.add('B'));
        System.out.println(listChar2Extended.add('C'));

        ListChar listChar1 = new ListChar(10);
        ListChar listChar2 = new ListChar();
        listChar1.addAll(listChar2);
        listChar2.addAll(listChar1);
        System.out.println(listChar1Extended.equals(listChar2Extended));
        System.out.println(listChar1Extended.add('A'));
        System.out.println(listChar1Extended.add('Z'));

        //VehicleTools vehicleTools = new VehicleTools();
        //vehicleTools.go();

                /// HOMEWORK 1 ///
        
//Реализовать класс MyCalc для вещественных чисел (чисел с плавающей точкой) со следующим набором методов/функций:
//        System.out.println(Calculator.add(1,3));
//        System.out.println(Calculator.add(1.1,3.2));
//        System.out.println(Calculator.sub(4,3));
//        System.out.println(Calculator.sub(4.1,3));
//        System.out.println(Calculator.mul(1,3));
//        System.out.println(Calculator.mul(5.43,3.23));
//        System.out.println(Calculator.div(6,3));
//        System.out.println(Calculator.div(10.57,3));
//        System.out.println(Calculator.mod(6,3));
//        System.out.println(Calculator.mod(10.54,3));
//        System.out.println(Calculator.avg(6,3));
//        System.out.println(Calculator.avg(10.54,3));
//        System.out.println(Calculator.pow(6));
//        System.out.println(Calculator.pow(10.54));
//        System.out.println(Calculator.percent(100, 10));

                    /// HOMEWORK 2 ///
            
//        System.out.println(Calculator.castToLong(100.134));

        
                    /// HOMEWORK 3 ///
        
//Написать функцию определения столетия по номеру года.
//Диапазон возможных значений для года может лежать в пределах от 1 до 2018.
//        List<Integer> dates = new ArrayList<Integer>(Arrays.asList(1910, 1700, 1998, 2000, 2001, 200, 381, 45, 1000, 1001));
//        for (int a : dates) {
//            System.out.println(DatesTool.dateToEpoch(a));
//        }

                    /// HOMEWORK 4 ///
            
//a. Написать два варианта ф-ции определения сезона года по номеру месяца.
//Первый вариант ф-ции должен использовать if .. else .. if оператор.
//Второй вариант ф-ции должен использовать switch .. case.

/*

        for (int i = 0; i < 14; i++) {
            System.out.println(i + " = " + DatesTool.getSeasonByMonthNumSwitch(i));
            System.out.println(i + " = " + DatesTool.getSeasonByMonthNumIf(i));
        }*/

//b. Отдельным методом организовать конечный цикл с помощью for. Количество итераций 20.
//Вывести сообщение в цикле такого вида
//- "Race 1"
//- "Race 2"
//- "Race 3"
//И т.д
//Пропускать вывод сообщений о номере гонки на шагах: 6, 12, 18


        //Race.getRace();

//c. Создайте бесконечный циклы вида do .. while.
//Внутри цикла сгенерируйте случайное число с помощь JDK библиотеки  Math.
//double Math.random() - возвращает случайное число в диапазоне 0.0 <= Math.random() < 1.0;

//Если случайное число более 0.5, вывести сообщение "eagle"?, а если меньше 0.5, то "tails".
//Если "0.0", то немедленно выйти из цикла.


//      EagleTails.getTailsOrEagles();

//d. Организовать циклы do while обратного отсчета от 10 до 1 в выводом на экран.


        //Calculator.countDown(10, 1 , 1);
//e. Реализовать задачу таблицы умножения используя исключительно циклы вида while (не путать с do while).


        //Calculator.multiply();

//f. Реализовать функцию по нахождению сумм цифр в числе.


        //System.out.println(Calculator.getSumOfDigitsFromNumber(234));

//g. Написать функцию нахождения факториала числа используя цикл любой вид цикла по желанию.


        //System.out.println(Calculator.getFactorial(3));

//h. Написать функцию для вывода на экран арифметической прогрессии: 10, 12, 14, ..., 34, 36, 38.


        //Calculator.getIncrementedValues(10, 38, 2);


                    /// HomeWork 5 ///
            
//Определить является ли число палиндромом
//        System.out.println(Calculator.ifNumberPalendrom(123456)); // NO
//        System.out.println(Calculator.ifNumberPalendrom(123321)); // YES
//        System.out.println(Calculator.ifNumberPalendrom(9239329)); // YES*/


/*

Двумерный массив 10х10, заполнить случайными числами от -20 до 20.

*/
        //int[][] arr2 = ArrayTools.getArrayWithRandomValues(10,10,-20,20);
/*
определения суммы всех элементов массива,
*/
        //System.out.println(ArrayTools.getSummOfAllArrayElements(arr2));
/*
среднее арифметическое,
*/
        //System.out.println(ArrayTools.getArr2ElementsAverage(arr2));
/*
минимальный элемент,
*/
        //System.out.println(ArrayTools.getArr2ElementsMin(arr2));

/*максималный элемент,*/
        //System.out.println(ArrayTools.getArr2ElementsMax(arr2));
/*
кол-во положительных элементов,
кол-во отрицательных элементов.
*/
        //System.out.println(ArrayTools.getArr2NumOfPositiveElements(arr2, false));

/*
c. В числовой матрице 5x2 поменять местами два столбца,
т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
а его элементы второго переместить в первый.
*/
        //int[][] arr3 = ArrayTools.getArrayWithRandomValues(5,2,10,20);
        //arr3 = ArrayTools.switchArr2columnsElements(arr3, 0,1);

/*

d. Найти столбец матрицы с максимальной суммой элементов:
Задана матрица неотрицательных чисел 3x5. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

*/
        //int[][] arr4 = ArrayTools.getArrayWithRandomValues(3,5,10,20);
        //System.out.println("Max column total value: " + ArrayTools.getMaxArray2Column(arr4));


        // HOMEWORK 6 ///

/*   a. Написать рекурсивную функцию подсчета суммы элементов этого ряда для первых N элементов:
    F = K*1 + K*2 +K*3 + K*4 +K*5 + … + K*N,

    где N <= 30, а K - константа K = 3

    При N = 1, сумма будет равна: ‘3’.
    При N = 30, сумма должна быть равна: ‘1395’.

    Note: Используйте для конечной суммы тип данных long.*/
        //System.out.println(RecursionTools.sumOfElements(1));
        //System.out.println(RecursionTools.sumOfElements(30));


    /*b.  Написать функцию сравнения двух одномерных массивов типа char.
            В случае, если содержимое массивов равно, то возвращать true, а иначе false.
            Note: Используйте при этом цикл вида foreach: for (type your_variable: array[] )*/

        // Arrays has same values, but different positions
        // boolean defines if position metters
        //System.out.println(ArrayTools.arrayMatch(alpha, betta, true));
        //System.out.println(ArrayTools.arrayMatch(alpha, betta, false));

    }
}
