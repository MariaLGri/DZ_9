package ru.Maria.Grishina;

public class OperationsOnTypes {
    public static void main(String[] args) {
        int firstVariable = 10;
        int secondVariable = 1;
        int thirdVariable = -2;
        double ADouble = 3.1;
        double BDouble = 1.1;
        float oneF = Float.MAX_VALUE;
        double oneD = Double.MIN_VALUE;

        System.out.println("0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int");
        System.out.println(firstVariable - secondVariable * secondVariable);
        System.out.println(firstVariable + secondVariable - firstVariable);
        System.out.println(firstVariable + secondVariable - firstVariable * thirdVariable);
        System.out.println("1) применить несколько арифметических операций над int и double в одном выражении");
        System.out.println(ADouble / BDouble - thirdVariable);
        System.out.println(ADouble / (BDouble + thirdVariable) * firstVariable);
        System.out.println("2) применить несколько логических операций ( < , >, >=, <= )");
        System.out.println(secondVariable > firstVariable);
        System.out.println(secondVariable <= firstVariable);
        System.out.println(ADouble != firstVariable == secondVariable > firstVariable);
        System.out.println("получить переполнение при арифметической операции");
        System.out.println(oneF * 10);
        System.out.println(-oneF / oneD);
    }
}