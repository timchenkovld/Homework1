package homeWork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Вывести в одну строку символы:
//
//        for (char ch = 'A'; ch <= 'Z'; ch++) {
//            System.out.print(ch);
//        }
//
//        for (char ch1 = 'z'; 'a' <= ch1; ch1--) {
//            System.out.print(ch1);
//        }
//
//        for (char ch2 = 'а'; ch2 <= 'я'; ch2++){
//            System.out.print(ch2);
//        }

//        for (byte i = 0; i <= 9; i++){
//            System.out.print(i);
//        }

//        //  ●	печатного диапазона таблицы ASCII
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите символ: ");
//        char ch = scanner.next().charAt(0);
//        int ascii = (char) ch;
//        System.out.println("Значение: " + ascii);

      //  2. Написать и протестировать функции преобразования:

//        double x = 1.123;
//        String y = String.valueOf((int)x);
//        System.out.println(y);

//        double x = 123.2;
//        String y = String.valueOf(x);
//        System.out.println(y);

        String st = "123";
        int x = Integer.parseInt(st);
        System.out.println(x);

        String st1 = "1234.34";
        float x1 = Float.parseFloat(st1);
        System.out.println(x1);

        
    }
}
