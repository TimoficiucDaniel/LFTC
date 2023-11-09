public class Main {
    public static void main(String[] args) throws Exception {
        //testSymbolTable();
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer("p3");
        try {
            lexicalAnalyzer.scan();
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
}