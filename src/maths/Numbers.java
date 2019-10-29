package maths;

public class Numbers {

    public static int getSum(int x, int y){
        int sum= x + y;
        return sum;
    }

    public static boolean isPositive(int positive){
        if(positive > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isNegative(int negative){
        if(negative < 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isEvenAndGreaterThanZero(int c){
        if (c%2==0  && c>0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isLeapYear(int year){
        if (year%400==0 || year%100!=0 && year%4==0){
            return true;
        }
        else {
            return false;
        }
    }

}

