import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  numbers separeted by spaces :");
        String s = sc.nextLine();
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));
        Collections.reverse(list);


        for(String k : list) {
            System.out.print(k);
            System.out.print(" ");

        }
    }
}
