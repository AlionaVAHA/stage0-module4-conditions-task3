package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int symbolInt = symbol;
        if (symbolInt==97 || symbolInt == 101 || symbolInt == 105 ||
        symbolInt == 111 || symbolInt ==117){
            System.out.println("Vowel");
        } else if ((symbolInt >= 97 && symbolInt <= 122) || (symbolInt >= 41 && symbolInt <= 90)) {
            System.out.println("Consonant");
        }
        else {
            System.out.println("wrong alphabet!");
        }
    }
}
