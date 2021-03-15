package com.antGr;
//класс, инкапсулирующий статический метод, определяющий, является ли переданное в качестве
//аргумента число простым числом
class Primes {
        static boolean isPrime(int n){
            if (n>2){
                for(int i = 2; i < n; i++){
                    if(n%i == 0) {
                        //System.out.println(n+ " - is not prime number.");
                        return false;
                    }
                }
            }
            else{
                //System.out.println("Please, input number > 2.");
                return false;
            }

            //System.out.println(n+ " - is prime number.");
            return true;
        }
    }
