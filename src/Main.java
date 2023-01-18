import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Descending Order: ");
        descendingNumbersRow(number);

        System.out.print("Ascending Order: ");
        ascendingNumbersRow(number);

        System.out.println();
        System.out.print("Factorial: ");
        System.out.print(checkFactorial(number));

        System.out.println();
        System.out.print("Fibonacci Number: ");
        System.out.print(fibonacciNumber(number));
    }

    private static int descendingNumbersRow(int number){
        if(number != 0){
            System.out.print(number+" ");
            return descendingNumbersRow(number - 1);
        }
        else{
            System.out.println("0");
            return 0;
        }
    }

    private static void ascendingNumbersRow(int number){
        if(number !=0){
            ascendingNumbersRow(number - 1);
            System.out.print(number+" ");
        }
        else{
            System.out.print("0 ");
        }
    }

    private static int checkFactorial(int number){
        if(number != 0){
            return number * checkFactorial(number - 1);
        }
        else{
            return 1;
        }
    }

    private static int fibonacciNumber(int number){
        if(number <= 1){
            return number;
        }
        else{
            return (fibonacciNumber(number - 1) + fibonacciNumber(number - 2));
        }
    }
}
