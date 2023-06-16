package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if ((symbol >= 97 && symbol <= 122)) {
            System.out.println("English");
        } else if (symbol >= 41 && symbol <= 90) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
