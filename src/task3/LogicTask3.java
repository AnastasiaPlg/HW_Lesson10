package task3;


import java.util.Arrays;

public class LogicTask3 {
    public static void findWordWithMinDiffChars(String line) {
        String[] lineArray = line.split("[ ,.:();'\"-/]+");
        StringBuilder[] sbLineArray = new StringBuilder[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            sbLineArray[i] = new StringBuilder(lineArray[i]);
        }

        for (int i = 0; i < sbLineArray.length; i++) {
            for (int j = 0; j < sbLineArray[i].length(); j++) {
                for (int k = j + 1; k < sbLineArray[i].length(); k++) {
                    if (sbLineArray[i].charAt(j) == sbLineArray[i].charAt(k)) {
                        sbLineArray[i].deleteCharAt(k);
                        k--;
                    }
                }
            }
        }
        int minDiffChar = sbLineArray[0].length();
        int index = 0;
        for (int i = 0; i < sbLineArray.length; i++) {
            if (sbLineArray[i].length() < minDiffChar) {
                minDiffChar = sbLineArray[i].length();
                index = i;
            }
        }
        System.out.println(lineArray[index]);
    }
}

