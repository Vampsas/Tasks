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

            char symbol =list.get(0).charAt(0);

            int liczba1 = Integer.parseInt(list.get(1));
            int liczba2 = Integer.parseInt(list.get(2));
            int suma, roznica, iloczyn, iloraz, reszta;

           switch (symbol){

               case '+' : suma = liczba1 + liczba2;
                   System.out.println(suma);
                   break;
               case '-': roznica = liczba1 - liczba2;
                   System.out.println(roznica);
                   break;
               case '*': iloczyn = liczba1 * liczba2;
                   System.out.println(iloczyn);
                   break;
               case '/': iloraz = liczba1 / liczba2;
                   System.out.println(iloraz);
                   break;
               case '%': reszta = liczba1 % liczba2;
                   System.out.println(reszta);
                   break;

                   default: break;
                 }
                list.clear();
            }
        }
    }