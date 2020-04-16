import java.util.Scanner;

public class Main {
    static int range = 0;
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число");
        int range = 9;
        playLevel(range);
    }
      public static void clickNumber(int click) {
         click = scanner.nextInt();
        if (click ==0) {
           System.out.println("Всего доброго!");
        } else{
            playLevel(range);
        }
    }
    private static void playLevel (int range){
        int count = 0;
        int maxCount = 3;
        int number = (int) (Math.random() * range);
        while (true){
            count++;
            int click = 0;
            System.out.println("Введите число от 0 до  " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали.  Повторить игру еще раз? 1 – да / 0 – нет");
                clickNumber(click);
                break;
            }else  if (count == maxCount) {
                System.out.println("Вы проиграли! Повторить игру еще раз? 1 – да / 0 – нет");
                     clickNumber(click);
                     break;
            }else if (input_number > number){
                System.out.println("Загаданное число меньше");
            }else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
