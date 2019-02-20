import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        do {
            System.out.println("Выберите с какими цифрами вы хотите работать: ");
            System.out.println("1-Арабские; 2-Римские;");
            a = scanner.nextInt();
           }
        while (a!=1 && a!=2);
        if (a==1)
            calcArab();
        else if (a==2)
            calcRoman();
    }
    public static void calcArab() {
        System.out.println("Введите первое значение: ");
        byte x = scanner.nextByte();
        System.out.println("Введите второе значение: ");
        byte y = scanner.nextByte();
        System.out.println("Выберите операцию: 1 - сумма; 2 - разница; 3 - умножение; 4 - деление");
        byte operation = scanner.nextByte();
        switch (operation) {
            case 1: System.out.println(x + "+" + y + " = " + (x + y));
                break;
            case 2: System.out.println(x + "-" + y + " = " + (x - y));
                break;
            case 3: System.out.println(x + "*" + y + " = " + (x * y));
                break;
            case 4: System.out.println(x + ":" + y + " = " + (x / y));
                break;
        }
    }
    public static void calcRoman() {
        Scanner roman = new Scanner(System.in);
        String[] romanNum = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String x, y;

    do  {
        System.out.println("Введите первое значение: ");
        x = roman.next();
        }
    while (!(Arrays.stream(romanNum).anyMatch(x::equals)));
        int index1 = (Arrays.asList(romanNum).indexOf(x) + 1);
    do {
        System.out.println("Введите второе значение: ");
        y = roman.next();
       }
    while (!(Arrays.stream(romanNum).anyMatch(y::equals)));
        int index2 = (Arrays.asList(romanNum).indexOf(y) + 1);

        System.out.println("Выберите операцию: 1 - сумма; 2 - разница; 3 - умножение; 4 - деление");
        byte operation = scanner.nextByte();
        switch (operation) {
            case 1: System.out.println(x + "+" + y + " = " + (romanNum[(index1 + index2) - 1]));
                break;
            case 2: System.out.println(x + "-" + y + " = " + (romanNum[(index1 - index2) - 1]));
                break;
            case 3: System.out.println(x + "*" + y + " = " + (romanNum[(index1 * index2) - 1]));
                break;
            case 4: System.out.println(x + ":" + y + " = " + (romanNum[(index1 / index2) - 1]));
                break;
        }
    }
}