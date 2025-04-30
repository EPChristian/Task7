package com.example;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

            try(Scanner scanner = new Scanner(System.in)) {
                System.out.print("Введите первое число: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Введите второе число: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                if (num2 == 0) {
                    try {
                        throw new ArithmeticException("Ошибка: деление на ноль");
                    } catch (ArithmeticException e) {
                        log.error("Произошло деление на ноль: ", e);
                    }
                } else {
                        double result = num1 / num2;
                        System.out.println("Результат деления: " + result);
                    }

                } catch(NumberFormatException e){
                    log.error("Ошибка ввода: введено не число.", e);
                }

        log.info("Программа работает корректно");
        log.warn("Предупреждение");
        log.error("Ошибка");

    }
}
