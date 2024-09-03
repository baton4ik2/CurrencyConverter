import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner input = new Scanner(System.in);
        System.out.print("Пожалуйста, введите операцию(сложение/вычитание): ");
        String text = input.nextLine();
        System.out.print("Пожалуйста, введите первое значение в рублях: ");
        double num1 = input.nextDouble();
        System.out.print("Пожалуйста, введите второе значение в долларах: ");
        double num2 = input.nextDouble();
        input.nextLine();
        if (text.equals("сложение")) {
            double sumResult = main.sumCurrency(num1, main.converterToRubles(num2));
            System.out.println("Результат: " + num1 + "р + " + num2 + "$ = " +  sumResult + "р");
        }
        if (text.equals("вычитание")) {
            double subResult =  main.subtractionCurrency(num1, main.converterToRubles(num2));
            System.out.println("Результат: " + num1 + "р - " + num2 + "$ = " +  subResult + "р");
        }

    }

    //сложение
    public double sumCurrency(double rubles, double dollars) {
        return rubles + dollars;
    }

    //вычитание
    public double subtractionCurrency(double rubles, double dollars) {
        return rubles - dollars;
    }

    //конвертация
    public double converterToRubles(double dollars) {
        return dollars * 90;
    }
}