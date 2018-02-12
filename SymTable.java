class SymTable {
	public static final int EOF = 0;
	public static final int ID = 1;
	public static final int INT_LITERAL = 2;
	public static final int LPAREN = 3;
	public static final int RPAREN = 4;
	public static final int SEMI_COLON = 5;
	public static final int PLUS = 6;
	public static final int MINUS = 7;
	public static final int TIMES = 8;
	public static final int LESS_THAN = 9;
	public static final int AND = 10;
	public static final int NOT = 11;
	public static final int DOT = 12;
	public static final int COMMA = 13;
	public static final int ASSIGNMENT = 14;
	public static final int EQUALITY = 15;
	public static final int PRINT = 16;
	public static final int IF = 17;
	public static final int WHILE = 18;
	public static final int ELSE = 19;
	public static final int INT = 20;
	public static final int BOOLEAN = 21;
	public static final int STRING = 22;
	public static final int RETURN = 23;
	public static final int TRUE = 24;
	public static final int FALSE = 25;
	public static final int CLASS = 26;
	public static final int PUBLIC = 27;
	public static final int STATIC = 28;
	public static final int VOID = 29;
	public static final int THIS = 30;
	public static final int NEW = 31;
	public static final int MAIN = 32;
	public static final int EXTENDS = 33;
	public static final int LENGTH = 34;
	public static final int LBRACE = 35;
	public static final int RBRACE = 36;
	public static final int LBRACKET = 37;
	public static final int RBRACKET = 38;


	// I hate this
	// but couldn't think of a better way to do it
	public static final String[] lookup = {
		"EOF",
		"ID",
		"INT_LITERAL",
		"LPAREN",
		"RPAREN",
		"SEMI_COLON",
		"PLUS",
		"MINUS",
		"TIMES",
		"LESS_THAN",
		"AND",
		"NOT",
		"DOT",
		"COMMA",
		"ASSIGNMENT",
		"EQUALITY",
		"PRINT",
		"IF",
		"WHILE",
		"ELSE",
		"INT",
		"BOOLEAN",
		"STRING",
		"RETURN",
		"TRUE",
		"FALSE",
		"CLASS",
		"PUBLIC",
		"STATIC",
		"VOID",
		"THIS",
		"NEW",
		"MAIN",
		"EXTENDS",
		"LENGTH",
		"LBRACE",
		"RBRACE",
		"LBRACKET",
		"RBRACKET"
	};
}