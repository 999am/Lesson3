import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    /**
     * ЗАДАЧА-1
     * Цензура
     * Далеко не все слова можно и нужно
     * произносить вслух. Опишем программу,
     * которая заменит все символы в заданном
     * слове, кроме первого и последнего, на символ *. Например, С УПРЯ -> C***Я
     */
    public static void task1() {
        System.out.println("ЗАДАЧА-1");
        System.out.println("Введите цезурное слово:");
        Scanner scan = new Scanner(System.in);
        String censure = scan.nextLine();

        char[] ch1 = censure.toCharArray();
        for (int i = 1; i < ch1.length - 1; i++) {
            ch1[i] = '*';
        }
        String str2 = new String(ch1);
        System.out.println("Цензурное слово выглядит так: " + str2);
    }

    /**
     * ЗАДАЧА-2
     * Учет тезок:
     * Опишите программу, которая принимает с клавиатуры два строковых значения,
     * каждое из которых содержит имя человека, и проверяет, являются ли эти люди тезками. По результатам
     * проверки следует вывести на экран
     * соответствующее сообщение.
     */
    public static void task2() {
        System.out.println("\nЗАДАЧА-2");
        Scanner scan = new Scanner(System.in);
        String s1;
        String s2;
        System.out.println("Введите первое имя:");
        s1 = scan.nextLine();
        System.out.println("Введите второе имя:");
        s2 = scan.nextLine();
        System.out.println(s1.equals(s2) ? "Вы ввели одинаковые имена: " + s1 + " КАК " + s2
                : "Вы ввели разные имена: " + s1 + " НЕ " + s2);
    }

    /**
     * ЗАДАЧА-3
     * Парсим соцсети
     * У вас есть публикация в социальной сети, и вам необходимо определить индекс последнего появления
     * определенного хэш-тега: JavaForever.
     */
    public static void task3() {
        System.out.println("\nЗАДАЧА-3");
        String s3 = "JavaForever";
        System.out.println("символ последнего появления: " + s3.substring(s3.length() - 1));
        System.out.println("индекс последнего появления: " + s3.lastIndexOf(s3.substring(s3.length() - 1)));

    }

    /**
     * ЗАДАЧА-4
     * Вводится строка и две подстроки.  Необходимо заменить все вхождения одной подстроки на
     * другую.
     */
    public static void task4() {
        System.out.println("\nЗАДАЧА-4");
        String a1 = "white";
        String a2 = "black";
        String a = "The " + a2 + " dog has a " + a2 + " puppy.";

        System.out.println("До: " + a);
        String replace = a.replace(a2, a1);
        System.out.println("После: " + replace);

    }

    /**
     * ЗАДАЧА-5
     * Шифровка пароля.
     * Условие. Необходимо написать программу, которая принимает на вход пароль из 5 символов (строка из латинских букв и цифр) и шифрует его. ароль должен быть зашифрован следующим образом: каждая буква
     * должна быть заменена на код символа, а каждая цифра должна быть
     * увеличена на 1. Зашифрованный пароль должен быть выведен на экран.
     * Требования:
     * 1) программа должна считывать строку из латинских букв и цифр.
     * 2) программа изменяет строку согласно условию.
     * 3) программа должна выводить результат шифрования.
     */
    public static void task5() {
        System.out.println("\nЗАДАЧА-5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        if (password.length() != 5) {
            System.out.println("Ошибка! \nПароль должен состоять из 5-и символов.");

        } else if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("Ошибка! \nПароль должен состоять только из латинских букв и цифр.");

        } else {
            StringBuilder passwordEncryption = new StringBuilder();
            for (
                    int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (Character.isLetter(c)) {

                    passwordEncryption.append((int) c);
                } else if (Character.isDigit(c)) {

                    int digit = Character.getNumericValue(c);
                    passwordEncryption.append(digit + 1);
                }
            }
            System.out.println("Зашифрованный пароль:\n" + passwordEncryption);
        }
    }
}