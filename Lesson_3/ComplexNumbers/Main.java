package ru.nsu.home;

public class Main {

    public static void main(String[] args) {

        ComplexNumber complexNumber = new ComplexNumber(5.6, 7.8);
        System.out.println(complexNumber.getComplexNumberInfo());

        complexNumber.addition(78, 2);
        System.out.println(complexNumber.getComplexNumberInfo());

        complexNumber.subtraction(10.6, 10.8);
        System.out.println(complexNumber.getComplexNumberInfo());

        complexNumber.multiplication(6, 16);
        System.out.println(complexNumber.getComplexNumberInfo());

        complexNumber.division(3, 2);
        System.out.println(complexNumber.getComplexNumberInfo());

    }
}
