package task1;

public class MainClass {
    public static void main(String[] args) {
        String line = "1236-oiU-9874-kJh-1r2f";
        StringAnalysis.showNumbers(line);
        StringAnalysis.replaceLetters(line);
        StringAnalysis.showLettersInLowerCase(line);
        StringAnalysis.showLettersInUpperCase(line);
        StringAnalysis.findSubstring(line, "oiU");
        StringAnalysis.findSubstring(line, "abc");
        StringAnalysis.areFirstNumbersFixed(line, "123");
        StringAnalysis.areFirstNumbersFixed(line, "555");
        StringAnalysis.areLastSymbolsFixed(line, "1r2f");
        StringAnalysis.areLastSymbolsFixed(line, "1a2b");
    }
}
