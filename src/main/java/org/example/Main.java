package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sisestage kolmekohaline number: ");
            int number = scanner.nextInt();

            if (number >= 100 && number <= 999) {
                int number1 = number / 100;
                int number2 = (number / 10) % 10;
                int number3 = number % 10;
                int summa = number1 + number2 + number3;
                System.out.println("Summa on: " + summa);
            } else {
                System.out.println("See number ei ole kolmekohaline");
            }
        }
    }
