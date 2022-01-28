package com.amdocs.dio;

public class FizzBuzz{
    public static String render(int number){
        boolean fizz = number % 3 ==0;
        boolean buzz = number % 5 == 0;
        boolean fizzbuzz = fizz && buzz;

        if (fizzbuzz)
            return "FizzBuzz";

        if (fizz)
            return "Fizz";

        if (buzz)
            return "Buzz";

        return String.valueOf(number);
    }
}
