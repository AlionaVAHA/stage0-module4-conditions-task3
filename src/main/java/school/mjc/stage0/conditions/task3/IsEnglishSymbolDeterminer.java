package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if ((symbolInt >= 97 && symbolInt <= 122)) {
            System.out.println("English");
        } else if (symbolInt >= 41 && symbolInt <= 90) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
