package com.antGr;

import java.io.Console;
import java.util.Scanner;

//Класс, инкапсулирующий метод, с которого начинается работа программы
public class Main {
    //Метод main, с которого начинается работа программы.
    //Метод создает экземпляр объекта Scanner для обеспечения консольного пользовательского ввода.
    //Затем вызывает метод primesCycle класса OperationsWithNumbers,
    // передавая методу в качестве аргумента введенное пользователем число
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number : ");
        try {
            int n = in.nextInt();
            OperationsWithNumbers.primesCycle(n);
        }
        catch (Exception ex){
            System.out.println("Ошибка: неверный формат данных. Нужно ввести число.");
        }
    }
}
