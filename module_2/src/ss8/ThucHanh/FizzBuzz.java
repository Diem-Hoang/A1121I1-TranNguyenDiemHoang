package ss8.ThucHanh;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isBuzz = number % 3 == 0;
        boolean isFizz = isBuzz;
        if(isFizz && number % 5 == 0)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return number + "";
    }
}
