package task1;

import java.util.Arrays;
import java.util.Locale;

public class StringAnalysis {

    public static void showNumbers(String line) {
        String[] array = line.split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]).append(array[2]);
        System.out.println(sb.toString());
    }

    public static void replaceLetters(String line) {
        String subString1 = line.substring(5, 8);
        String subString2 = line.substring(14, 17);
        System.out.println(subString1 + " " + subString2);
        String newLine = line.replaceAll(subString1, "***").replaceAll(subString2, "***");
        System.out.println(newLine);
    }

    public static void showLettersInLowerCase(String line) {
        char[] array = line.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (Character.isAlphabetic(array[i])) {
                sb.append(Character.toLowerCase(array[i]));
            }
        }
        sb.insert(3, '/').insert(7, '/').insert(9, '/');
        System.out.println(sb.toString());
    }

    public static void showLettersInUpperCase(String line) {
        char[] array = line.toCharArray();
        StringBuilder sb = new StringBuilder("Letters:");
        for (int i = 0; i < array.length; i++) {
            if (Character.isAlphabetic(array[i])) {
                sb.append(Character.toUpperCase(array[i]));
            }
        }
        sb.insert(11, '/').insert(15, '/').insert(17, '/');
        System.out.println(sb.toString());
    }

    public static void findSubstring(String line, String substring) {

        if (line.toLowerCase().indexOf(substring.toLowerCase()) < 0) {
            System.out.println("The line doesn't contain substring " + substring);
        } else {
            System.out.println("The line contains substring " + substring);
        }
    }

    public static void areFirstNumbersFixed(String line, String numbers) {
        if (line.startsWith(numbers)) {
            System.out.println("The line starts with numbers " + numbers);
        } else {
            System.out.println("The line doesn't start with numbers " + numbers);
        }
    }

    public static void areLastSymbolsFixed(String line, String symbols) {
        if (line.endsWith(symbols)) {
            System.out.println("The line ends with symbols " + symbols);
        } else {
            System.out.println("The line doesn't end with symbols " + symbols);
        }
    }
}
