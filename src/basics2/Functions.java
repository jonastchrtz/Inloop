package basics2;

public class Functions {

        public static int factorial(int n) {

            if (n == 0)
                return 1;
            else
                return(n * factorial(n-1));
        }

        public static void main(String[] args){

            int number = 5;

            int fact = factorial(number);

            System.out.println("The factorial of " + number + " is " + fact +".");
    }
}