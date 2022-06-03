package task5;

import java.util.Arrays;

public class LogicTask5 {
    public static void createDoubleLetters(String line) {
        String[] lineArray = line.split(" ");
        StringBuilder[] sbLineArray = new StringBuilder[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            sbLineArray[i] = new StringBuilder(lineArray[i]);
        }
        for (int i = 0; i < sbLineArray.length; i++) {
            for (int j = 0; j < sbLineArray[i].length(); j += 2) {
                if (Character.isLetter(sbLineArray[i].charAt(j))) {
                    sbLineArray[i].insert(j + 1, sbLineArray[i].charAt(j));
                } else {
                    j--;
                }
            }
        }
        String newLine = "";
        for (int i = 0; i < sbLineArray.length; i++) {
            newLine = newLine + sbLineArray[i] + " ";
        }
        System.out.println(newLine);
    }
}
