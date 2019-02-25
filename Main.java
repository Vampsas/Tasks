import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter symbol (+, -, %, * or /) and two numbers separeted by spaces :");

        String text;

        while((text = sc.readLine()) != null && text.length() > 0) {

            ArrayList<String> list = new ArrayList<String>(Arrays.asList(text.split(" ")));

            char symbol = list.get(0).charAt(0);

            int num1 = Integer.parseInt(list.get(1));
            int num2 = Integer.parseInt(list.get(2));
            int sum, substraction, multi, division, rest;

           switch (sumbol){

               case '+' : sum = num1 + num2;
                   System.out.println(sum);
                   break;
               case '-': substraction = num1 - num2;
                   System.out.println(substraction);
                   break;
               case '*': multi = num1 * num2;
                   System.out.println(multi);
                   break;
               case '/': division = num1 / num2;
                   System.out.println(division);
                   break;
               case '%': rest = num1 % num2;
                   System.out.println(rest);
                   break;

                   default: break;
                 }
                list.clear();
            }
        }
    }
