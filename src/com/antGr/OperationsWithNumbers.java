package com.antGr;
//класс со статическими методами для операций над числами
class OperationsWithNumbers {
    //метод, выводящий в консоль все числа, являющиеся простыми,
    //до переданного в качестве агрумента числа, включительно
    static void primesCycle(int maxNumber){
        for(int i = 0 ; i<=maxNumber; i++){
            if (Primes.isPrime(i)){
                System.out.println(i+ " - is prime number.");
            }
        }
    }
}
