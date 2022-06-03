package task4;


public class LogicTask4 {
    protected static void findPolydromes(int number, String line) {
        String[] lineArray = line.split("[ ,.:();'\"-/]+");
        StringBuilder[] sbLineArray = new StringBuilder[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            sbLineArray[i] = new StringBuilder(lineArray[i]);
        }
        if (number < sbLineArray.length && number >= 0) {
            if (sbLineArray[number].toString().equalsIgnoreCase(sbLineArray[number].reverse().toString())) {
                System.out.println(number + " word is \"" + lineArray[number] + "\". It's a polyndrome.");
            } else {
                System.out.println(number + " word is \"" + lineArray[number] + "\". It's not a polyndrome.");
            }
        } else if (number != -123) {
            System.out.println("Error! Enter another number!");
        }
    }
}
