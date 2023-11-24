import FA.FA;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        //testSymbolTable();
        //testLexicalAnalyzer();
        //testFA();
        testLexicalAnalyzerFA();
    }

    private static void testLexicalAnalyzer() {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer("p2");
        try {
            lexicalAnalyzer.scan();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void testLexicalAnalyzerFA() {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer("p1err");
        try {
            lexicalAnalyzer.scanFA();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void testSymbolTable() {
        SymbolTable sym = new SymbolTable(98);
        sym.addSymbol("a",1);
        System.out.println(sym.getSymbolPosition("a"));
        sym.addSymbol("a",2);
        System.out.println(sym.getSymbolPosition("a"));
        sym.addSymbol("bc",2);
        sym.addSymbol("ad",2);
        sym.addSymbol("nmnmnmnm",2);
        System.out.println(sym.getSymbolPosition("ad"));
        System.out.println(sym.getSymbolPosition("nu este"));
        System.out.println(sym.removeSymbol("ad"));
        System.out.println(sym.getSymbolPosition("ad"));
    }

    private static void testFA() throws FileNotFoundException {
        FA fa = new FA("identifierFiniteAutomata");
        String sequence1 = "identifierGOOD012";
        String sequence2 = "01identifier bad";
        System.out.println(fa.checkIfGood(sequence1));
        System.out.println(fa.checkIfGood(sequence2));
        fa = new FA("constFiniteAutomata");
        String sequence3 = "-23";
        String sequence4 = "-01";
        System.out.println(fa.checkIfGood(sequence3));
        System.out.println(fa.checkIfGood(sequence4));
    }
}