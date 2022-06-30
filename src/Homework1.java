public class Homework1 {

    public static void main(String[] args) {

        System.out.println(calcSum(3,4,19,23));
        System.out.println(between1020(5,19));
        positiveOrNegative(-5);
        System.out.println(someText("Kevin"));
        leapYear(1600);

    }

    public static double calcSum(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }

    public static boolean between1020(int a, int b){
        if( a + b > 10 && a + b <= 20){
            return true;
        }
        else{
            return false;
        }
    }

    public static void positiveOrNegative(int a){
        if( a >= 0){
            System.out.println(a + " is positive ");
        }
        else{
            System.out.println(a + " is negative");
        }
    }

    public static String someText(String name){
        return ("Привет, " + name + "!");
    }

    public static void leapYear(int a){
        if(a % 4 == 0 && (a % 400 == 0 && a % 100 == 0))
        {
            System.out.println(a + " is leap year");
        }
        else {
            System.out.println(a + " is not leap year");
        }
    }


}
