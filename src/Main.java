import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//todo 1) Работа со String
//     2) Продемонстировать явное и неявное приведение типов
//     3) Показать переполнение

        //     1) Работа со String
        String str = "Hello ";
        System.out.println("Enter you name");
        String b = scanner.next();
        System.out.println(str + b);


        //     2) Продемонстировать явное и неявное приведение типов
        //     явное
        short e;
        long l;
        l = 777777777777l;
        e = (short) l;
        System.out.println(e);
        //     неявное
        double d;
        d = l;
        System.out.println(d);


        //     3) Показать переполнение
        byte a = 127;
        System.out.print(a += 1);
    }
}