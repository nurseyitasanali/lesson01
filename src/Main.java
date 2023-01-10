
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Homework
      String homeworkFirst;
      final int NUM = 14;
      String word = "Hello word!";
      homeworkFirst = NUM + " " + word;
        System.out.println(NUM+ "," + word + "," + homeworkFirst);

    //--------------------------
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
    //------------------------

        System.out.print("Введите ваше имя (затем нажмите Enter): ");
        Scanner scan = new Scanner(System.in);
        String  name = scan.next();
        System.out.println ("Привет " + name);

    }
}