import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of testes :");
        int quantity, numbers;
        int number_of_test = sc.nextInt();
        int sum = 0;

         for(int i = 1; i <= number_of_test; i++){
             System.out.println("Enter quantity of numbers :");
             quantity = sc.nextInt();

                for(int j = 1; j <= quantity; j++){
                  numbers = sc.nextInt();
                  sum += numbers ;
                }

             System.out.print(sum);
             System.out.println();
             sum = 0;
         }
    }
}
