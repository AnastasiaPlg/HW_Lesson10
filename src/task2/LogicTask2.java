package task2;

public class LogicTask2 {
    public static void findMaxAndMinLengthWords(String line) {
        String[] array = line.split("[ ,.:();'\"-/]+");
        int maxLength = array[0].length();
        int maxLengthWordIndex = 0;
        int minLength = array[0].length();
        int minLengthWordIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= maxLength) {
                maxLength = array[i].length();
                maxLengthWordIndex = i;
            }
            if(array[i].length() <= minLength) {
                minLength = array[i].length();
                minLengthWordIndex = i;
            }
        }
        System.out.println("Max length word in the line is " + array[maxLengthWordIndex]);
        System.out.println("Min length word in the line is " + array[minLengthWordIndex]);
    }
}
