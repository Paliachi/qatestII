// 1-ლი ამოცანა

abstract class VowelCounter {
    public abstract void countVowel(String str);
}


class VowelCounterChild extends VowelCounter {
    @Override
    public void countVowel(String str) {
        String vowels = "aouei";
        int vowelCounter = 0;
        String lowerStr = str.toLowerCase();

        for (char letter : lowerStr.toCharArray()) {
            if (vowels.indexOf(letter) != -1) {
                vowelCounter++;
            }
        }

        System.out.println("ამ სტრიქონში არის " + vowelCounter + " ხმოვანი");
    }
}

public class Main {
    public static void main(String[] args) {
        VowelCounterChild vowelCounterInst = new VowelCounterChild();

        vowelCounterInst.countVowel("Here we go!");
        vowelCounterInst.countVowel("Avoiding letters");
        vowelCounterInst.countVowel("Pgrsnkl dmnkdld");
    }
}

