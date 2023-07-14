package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isGoodNumber = false;
        while (!isGoodNumber) {
            System.out.println("Podaj liczbę");
            int number = scanner.nextInt();
            if (number < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (number > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (number % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            } else {
                System.out.println("Twoja liczba jest ok");
                isGoodNumber = true;
            }
        }
    }
}
