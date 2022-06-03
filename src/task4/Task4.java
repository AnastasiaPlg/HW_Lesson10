package task4;

import task3.LogicTask3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "The pictures were hung on the wall at eye level";
        String line1 = "Jim liked driving around town with his hazard lights on.";
        while (true) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            System.out.println();
            LogicTask4.findPolydromes(number, line);
            LogicTask4.findPolydromes(number, line1);
            if (number == -123) {
                break;
            }
        }
    }
}
