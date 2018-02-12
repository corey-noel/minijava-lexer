import java.io.*;
import java_cup.runtime.Symbol;

class LexerTester {
	private static final String outformat = "%-15s%-15s%-15s%-15s\n";


	public static void main(String[] args) {
		Lexer lex = null;

		if (args.length < 1) {
			System.out.println("Usage: java LexerTester [filename]");
			System.exit(-1);
		}

		try {
			lex = new Lexer(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			System.out.printf("File %s not found\n", args[0]);
			System.exit(-2);
		}

		System.out.printf(outformat, "LINE", "COL", "ID", "VAL");
		System.out.println("==============================" + 
			"==============================");

		try {
			Symbol sym = lex.next_token();
			while (sym.sym != SymTable.EOF) {
				printSym(sym);
				sym = lex.next_token();
			}
			printSym(sym);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void printSym(Symbol sym) {
		System.out.printf(outformat, 
			sym.left + 1, 
			sym.right + 1, 
			SymTable.lookup[sym.sym], 
			sym.value == null ? "" : sym.value
		);
	}
}