// მე-2 ამოცანა
interface ReplaceSymbolA {
    void replaceSymbolA(String str);
}


interface ReplaceSymbolB {
    void replaceSymbolB(String str);
}


class SymbolReplacer implements ReplaceSymbolA, ReplaceSymbolB {

    @Override
    public void replaceSymbolA(String str) {
        String result = str.replace('a', 'z').replace('A', 'Z');
        System.out.println("The result of replaceSymbolA: " + result);
    }

    @Override
    public void replaceSymbolB(String str) {
        String result = str.replace('b', 'w').replace('B', 'W');
        System.out.println("The result of replaceSymbolB: " + result);
    }
}


public class ReplaceMain {
    public static void main(String[] args) {
        SymbolReplacer replacer = new SymbolReplacer();

        replacer.replaceSymbolA("Mchadi");
        replacer.replaceSymbolB("Bratislava border");
    }
}

