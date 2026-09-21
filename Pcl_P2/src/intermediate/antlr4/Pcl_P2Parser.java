// Generated from Pcl_P2.g4 by ANTLR 4.13.2

    package intermediate.antlr4;
    
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec_P2;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Pcl_P2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, PROGRAM=13, CONST=14, TYPE=15, PACKED=16, 
		ARRAY=17, OF=18, RECORD=19, VAR=20, BEGIN=21, END=22, TRUE=23, FALSE=24, 
		IDENTIFIER=25, INTEGER=26, REAL=27, LETTER=28, DIGIT=29, DIGITS=30, CHARACTER=31, 
		STRING=32, WHITESPACE=33, COMMENT=34;
	public static final int
		RULE_program = 0, RULE_programHeader = 1, RULE_programParameters = 2, 
		RULE_identifier = 3, RULE_block = 4, RULE_compoundStatement = 5, RULE_declarations = 6, 
		RULE_constantsPart = 7, RULE_constantDefinitionsList = 8, RULE_constantDefinition = 9, 
		RULE_constant = 10, RULE_sign = 11, RULE_constantIdentifier = 12, RULE_unsignedConstant = 13, 
		RULE_integerConstant = 14, RULE_realConstant = 15, RULE_characterConstant = 16, 
		RULE_stringConstant = 17, RULE_booleanConstant = 18, RULE_typesPart = 19, 
		RULE_typeDefinitionsList = 20, RULE_typeDefinition = 21, RULE_typeSpecification = 22, 
		RULE_typeIdentifier = 23, RULE_ordinalType = 24, RULE_structuredType = 25, 
		RULE_enumeratedType = 26, RULE_subrangeType = 27, RULE_arrayType = 28, 
		RULE_dimensionList = 29, RULE_indexType = 30, RULE_elmtType = 31, RULE_recordType = 32, 
		RULE_variablesPart = 33, RULE_variableDeclarationsList = 34, RULE_variableDeclarations = 35, 
		RULE_variableIdentifierList = 36, RULE_procedureAndFunctionsPart = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeader", "programParameters", "identifier", "block", 
			"compoundStatement", "declarations", "constantsPart", "constantDefinitionsList", 
			"constantDefinition", "constant", "sign", "constantIdentifier", "unsignedConstant", 
			"integerConstant", "realConstant", "characterConstant", "stringConstant", 
			"booleanConstant", "typesPart", "typeDefinitionsList", "typeDefinition", 
			"typeSpecification", "typeIdentifier", "ordinalType", "structuredType", 
			"enumeratedType", "subrangeType", "arrayType", "dimensionList", "indexType", 
			"elmtType", "recordType", "variablesPart", "variableDeclarationsList", 
			"variableDeclarations", "variableIdentifierList", "procedureAndFunctionsPart"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'('", "','", "')'", "'='", "'-'", "'+'", "'..'", 
			"'['", "']'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "PROGRAM", "CONST", "TYPE", "PACKED", "ARRAY", "OF", "RECORD", 
			"VAR", "BEGIN", "END", "TRUE", "FALSE", "IDENTIFIER", "INTEGER", "REAL", 
			"LETTER", "DIGIT", "DIGITS", "CHARACTER", "STRING", "WHITESPACE", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pcl_P2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Pcl_P2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeaderContext programHeader() {
			return getRuleContext(ProgramHeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			programHeader();
			setState(77);
			block();
			setState(78);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramHeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(Pcl_P2Parser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProgramParametersContext programParameters() {
			return getRuleContext(ProgramParametersContext.class,0);
		}
		public ProgramHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitProgramHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeaderContext programHeader() throws RecognitionException {
		ProgramHeaderContext _localctx = new ProgramHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(PROGRAM);
			setState(81);
			identifier();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(82);
				programParameters();
				}
			}

			setState(85);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramParametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ProgramParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitProgramParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramParametersContext programParameters() throws RecognitionException {
		ProgramParametersContext _localctx = new ProgramParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__2);
			setState(88);
			identifier();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(89);
				match(T__3);
				setState(90);
				identifier();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public SymtabEntry entry = null;
		public Typespec_P2 typespec = null;
		public Object value = null;
		public TerminalNode IDENTIFIER() { return getToken(Pcl_P2Parser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			declarations();
			setState(101);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(Pcl_P2Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(Pcl_P2Parser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(BEGIN);
			setState(104);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public ConstantsPartContext constantsPart() {
			return getRuleContext(ConstantsPartContext.class,0);
		}
		public TypesPartContext typesPart() {
			return getRuleContext(TypesPartContext.class,0);
		}
		public VariablesPartContext variablesPart() {
			return getRuleContext(VariablesPartContext.class,0);
		}
		public ProcedureAndFunctionsPartContext procedureAndFunctionsPart() {
			return getRuleContext(ProcedureAndFunctionsPartContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(106);
				constantsPart();
				setState(107);
				match(T__1);
				}
			}

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(111);
				typesPart();
				setState(112);
				match(T__1);
				}
			}

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(116);
				variablesPart();
				setState(117);
				match(T__1);
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(121);
				procedureAndFunctionsPart();
				setState(122);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantsPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(Pcl_P2Parser.CONST, 0); }
		public ConstantDefinitionsListContext constantDefinitionsList() {
			return getRuleContext(ConstantDefinitionsListContext.class,0);
		}
		public ConstantsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantsPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitConstantsPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantsPartContext constantsPart() throws RecognitionException {
		ConstantsPartContext _localctx = new ConstantsPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantsPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(CONST);
			setState(127);
			constantDefinitionsList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefinitionsListContext extends ParserRuleContext {
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public ConstantDefinitionsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitConstantDefinitionsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionsListContext constantDefinitionsList() throws RecognitionException {
		ConstantDefinitionsListContext _localctx = new ConstantDefinitionsListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantDefinitionsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			constantDefinition();
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					match(T__1);
					setState(131);
					constantDefinition();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitConstantDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			identifier();
			setState(138);
			match(T__5);
			setState(139);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public Object value = null;
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case IDENTIFIER:
			case INTEGER:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==T__7) {
					{
					setState(141);
					sign();
					}
				}

				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(144);
					constantIdentifier();
					}
					break;
				case INTEGER:
				case REAL:
					{
					setState(145);
					unsignedConstant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				characterConstant();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				stringConstant();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				booleanConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantIdentifierContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public Object value = null;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitConstantIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantIdentifierContext constantIdentifier() throws RecognitionException {
		ConstantIdentifierContext _localctx = new ConstantIdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constantIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnsignedConstantContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public Object value = null;
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public RealConstantContext realConstant() {
			return getRuleContext(RealConstantContext.class,0);
		}
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unsignedConstant);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				integerConstant();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				realConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerConstantContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public Object value = null;
		public TerminalNode INTEGER() { return getToken(Pcl_P2Parser.INTEGER, 0); }
		public IntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerConstantContext integerConstant() throws RecognitionException {
		IntegerConstantContext _localctx = new IntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RealConstantContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public Object value = null;
		public TerminalNode REAL() { return getToken(Pcl_P2Parser.REAL, 0); }
		public RealConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitRealConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealConstantContext realConstant() throws RecognitionException {
		RealConstantContext _localctx = new RealConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_realConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterConstantContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public Object value = null;
		public TerminalNode CHARACTER() { return getToken(Pcl_P2Parser.CHARACTER, 0); }
		public CharacterConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterConstantContext characterConstant() throws RecognitionException {
		CharacterConstantContext _localctx = new CharacterConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_characterConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(CHARACTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringConstantContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public Object value = null;
		public TerminalNode STRING() { return getToken(Pcl_P2Parser.STRING, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanConstantContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public Object value = null;
		public TerminalNode TRUE() { return getToken(Pcl_P2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Pcl_P2Parser.FALSE, 0); }
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypesPartContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(Pcl_P2Parser.TYPE, 0); }
		public TypeDefinitionsListContext typeDefinitionsList() {
			return getRuleContext(TypeDefinitionsListContext.class,0);
		}
		public TypesPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitTypesPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesPartContext typesPart() throws RecognitionException {
		TypesPartContext _localctx = new TypesPartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typesPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(TYPE);
			setState(172);
			typeDefinitionsList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefinitionsListContext extends ParserRuleContext {
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public TypeDefinitionsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitTypeDefinitionsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionsListContext typeDefinitionsList() throws RecognitionException {
		TypeDefinitionsListContext _localctx = new TypeDefinitionsListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeDefinitionsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			typeDefinition();
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					match(T__1);
					setState(176);
					typeDefinition();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeSpecificationContext typeSpecification() {
			return getRuleContext(TypeSpecificationContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			identifier();
			setState(183);
			match(T__5);
			setState(184);
			typeSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecificationContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public OrdinalTypeContext ordinalType() {
			return getRuleContext(OrdinalTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public TypeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitTypeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecificationContext typeSpecification() throws RecognitionException {
		TypeSpecificationContext _localctx = new TypeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeSpecification);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				ordinalType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				structuredType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrdinalTypeContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public EnumeratedTypeContext enumeratedType() {
			return getRuleContext(EnumeratedTypeContext.class,0);
		}
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public OrdinalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinalType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitOrdinalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinalTypeContext ordinalType() throws RecognitionException {
		OrdinalTypeContext _localctx = new OrdinalTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ordinalType);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				enumeratedType();
				}
				break;
			case T__6:
			case T__7:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case INTEGER:
			case REAL:
			case CHARACTER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				subrangeType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructuredTypeContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structuredType);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				arrayType();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				recordType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratedTypeContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public EnumeratedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratedType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitEnumeratedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratedTypeContext enumeratedType() throws RecognitionException {
		EnumeratedTypeContext _localctx = new EnumeratedTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumeratedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__2);
			setState(202);
			identifier();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(203);
				match(T__3);
				setState(204);
				identifier();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubrangeTypeContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitSubrangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			constant();
			setState(213);
			match(T__8);
			setState(214);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public Typespec_P2 typespec = null;
		public TerminalNode ARRAY() { return getToken(Pcl_P2Parser.ARRAY, 0); }
		public DimensionListContext dimensionList() {
			return getRuleContext(DimensionListContext.class,0);
		}
		public TerminalNode OF() { return getToken(Pcl_P2Parser.OF, 0); }
		public ElmtTypeContext elmtType() {
			return getRuleContext(ElmtTypeContext.class,0);
		}
		public TerminalNode PACKED() { return getToken(Pcl_P2Parser.PACKED, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKED) {
				{
				setState(216);
				match(PACKED);
				}
			}

			setState(219);
			match(ARRAY);
			setState(220);
			match(T__9);
			setState(221);
			dimensionList();
			setState(222);
			match(T__10);
			setState(223);
			match(OF);
			setState(224);
			elmtType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionListContext extends ParserRuleContext {
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public DimensionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitDimensionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionListContext dimensionList() throws RecognitionException {
		DimensionListContext _localctx = new DimensionListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dimensionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			indexType();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(227);
				match(T__3);
				setState(228);
				indexType();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public OrdinalTypeContext ordinalType() {
			return getRuleContext(OrdinalTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitIndexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_indexType);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				ordinalType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElmtTypeContext extends ParserRuleContext {
		public TypeSpecificationContext typeSpecification() {
			return getRuleContext(TypeSpecificationContext.class,0);
		}
		public ElmtTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elmtType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitElmtType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElmtTypeContext elmtType() throws RecognitionException {
		ElmtTypeContext _localctx = new ElmtTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elmtType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			typeSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordTypeContext extends ParserRuleContext {
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesPartContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Pcl_P2Parser.VAR, 0); }
		public VariableDeclarationsListContext variableDeclarationsList() {
			return getRuleContext(VariableDeclarationsListContext.class,0);
		}
		public VariablesPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitVariablesPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesPartContext variablesPart() throws RecognitionException {
		VariablesPartContext _localctx = new VariablesPartContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variablesPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(VAR);
			setState(243);
			variableDeclarationsList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationsListContext extends ParserRuleContext {
		public List<VariableDeclarationsContext> variableDeclarations() {
			return getRuleContexts(VariableDeclarationsContext.class);
		}
		public VariableDeclarationsContext variableDeclarations(int i) {
			return getRuleContext(VariableDeclarationsContext.class,i);
		}
		public VariableDeclarationsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitVariableDeclarationsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationsListContext variableDeclarationsList() throws RecognitionException {
		VariableDeclarationsListContext _localctx = new VariableDeclarationsListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarationsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			variableDeclarations();
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					match(T__1);
					setState(247);
					variableDeclarations();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationsContext extends ParserRuleContext {
		public VariableIdentifierListContext variableIdentifierList() {
			return getRuleContext(VariableIdentifierListContext.class,0);
		}
		public TypeSpecificationContext typeSpecification() {
			return getRuleContext(TypeSpecificationContext.class,0);
		}
		public VariableDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitVariableDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationsContext variableDeclarations() throws RecognitionException {
		VariableDeclarationsContext _localctx = new VariableDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			variableIdentifierList();
			setState(254);
			match(T__11);
			setState(255);
			typeSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public VariableIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitVariableIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdentifierListContext variableIdentifierList() throws RecognitionException {
		VariableIdentifierListContext _localctx = new VariableIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			identifier();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(258);
				match(T__3);
				setState(259);
				identifier();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureAndFunctionsPartContext extends ParserRuleContext {
		public ProcedureAndFunctionsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionsPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pcl_P2Visitor ) return ((Pcl_P2Visitor<? extends T>)visitor).visitProcedureAndFunctionsPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureAndFunctionsPartContext procedureAndFunctionsPart() throws RecognitionException {
		ProcedureAndFunctionsPartContext _localctx = new ProcedureAndFunctionsPartContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_procedureAndFunctionsPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u010c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001T\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\\\b\u0002\n\u0002\f\u0002_\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"n\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006x\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0085\b\b\n\b\f\b\u0088\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u008f\b\n\u0001\n\u0001\n\u0003"+
		"\n\u0093\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0098\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00a0\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00b2\b\u0014\n\u0014\f\u0014"+
		"\u00b5\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00be\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u00c4\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00c8\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u00ce\b\u001a\n\u001a\f\u001a\u00d1\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0003"+
		"\u001c\u00da\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u00e6\b\u001d\n\u001d\f\u001d\u00e9\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u00ed\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u00f9\b\"\n\"\f\"\u00fc"+
		"\t\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u0105\b$"+
		"\n$\f$\u0108\t$\u0001%\u0001%\u0001%\u0000\u0000&\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJ\u0000\u0002\u0001\u0000\u0007\b\u0001\u0000\u0017\u0018"+
		"\u00fd\u0000L\u0001\u0000\u0000\u0000\u0002P\u0001\u0000\u0000\u0000\u0004"+
		"W\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bd\u0001\u0000"+
		"\u0000\u0000\ng\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000e"+
		"~\u0001\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0089"+
		"\u0001\u0000\u0000\u0000\u0014\u0097\u0001\u0000\u0000\u0000\u0016\u0099"+
		"\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a\u009f"+
		"\u0001\u0000\u0000\u0000\u001c\u00a1\u0001\u0000\u0000\u0000\u001e\u00a3"+
		"\u0001\u0000\u0000\u0000 \u00a5\u0001\u0000\u0000\u0000\"\u00a7\u0001"+
		"\u0000\u0000\u0000$\u00a9\u0001\u0000\u0000\u0000&\u00ab\u0001\u0000\u0000"+
		"\u0000(\u00ae\u0001\u0000\u0000\u0000*\u00b6\u0001\u0000\u0000\u0000,"+
		"\u00bd\u0001\u0000\u0000\u0000.\u00bf\u0001\u0000\u0000\u00000\u00c3\u0001"+
		"\u0000\u0000\u00002\u00c7\u0001\u0000\u0000\u00004\u00c9\u0001\u0000\u0000"+
		"\u00006\u00d4\u0001\u0000\u0000\u00008\u00d9\u0001\u0000\u0000\u0000:"+
		"\u00e2\u0001\u0000\u0000\u0000<\u00ec\u0001\u0000\u0000\u0000>\u00ee\u0001"+
		"\u0000\u0000\u0000@\u00f0\u0001\u0000\u0000\u0000B\u00f2\u0001\u0000\u0000"+
		"\u0000D\u00f5\u0001\u0000\u0000\u0000F\u00fd\u0001\u0000\u0000\u0000H"+
		"\u0101\u0001\u0000\u0000\u0000J\u0109\u0001\u0000\u0000\u0000LM\u0003"+
		"\u0002\u0001\u0000MN\u0003\b\u0004\u0000NO\u0005\u0001\u0000\u0000O\u0001"+
		"\u0001\u0000\u0000\u0000PQ\u0005\r\u0000\u0000QS\u0003\u0006\u0003\u0000"+
		"RT\u0003\u0004\u0002\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0005\u0002\u0000\u0000V\u0003\u0001"+
		"\u0000\u0000\u0000WX\u0005\u0003\u0000\u0000X]\u0003\u0006\u0003\u0000"+
		"YZ\u0005\u0004\u0000\u0000Z\\\u0003\u0006\u0003\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005"+
		"\u0005\u0000\u0000a\u0005\u0001\u0000\u0000\u0000bc\u0005\u0019\u0000"+
		"\u0000c\u0007\u0001\u0000\u0000\u0000de\u0003\f\u0006\u0000ef\u0003\n"+
		"\u0005\u0000f\t\u0001\u0000\u0000\u0000gh\u0005\u0015\u0000\u0000hi\u0005"+
		"\u0016\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jk\u0003\u000e\u0007"+
		"\u0000kl\u0005\u0002\u0000\u0000ln\u0001\u0000\u0000\u0000mj\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000nr\u0001\u0000\u0000\u0000op\u0003"+
		"&\u0013\u0000pq\u0005\u0002\u0000\u0000qs\u0001\u0000\u0000\u0000ro\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sw\u0001\u0000\u0000\u0000"+
		"tu\u0003B!\u0000uv\u0005\u0002\u0000\u0000vx\u0001\u0000\u0000\u0000w"+
		"t\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x|\u0001\u0000\u0000"+
		"\u0000yz\u0003J%\u0000z{\u0005\u0002\u0000\u0000{}\u0001\u0000\u0000\u0000"+
		"|y\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\r\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u000e\u0000\u0000\u007f\u0080\u0003\u0010\b\u0000"+
		"\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u0086\u0003\u0012\t\u0000\u0082"+
		"\u0083\u0005\u0002\u0000\u0000\u0083\u0085\u0003\u0012\t\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0011"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0003\u0006\u0003\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b\u008c"+
		"\u0003\u0014\n\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008f\u0003"+
		"\u0016\u000b\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u0093\u0003"+
		"\u0018\f\u0000\u0091\u0093\u0003\u001a\r\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0098\u0001\u0000"+
		"\u0000\u0000\u0094\u0098\u0003 \u0010\u0000\u0095\u0098\u0003\"\u0011"+
		"\u0000\u0096\u0098\u0003$\u0012\u0000\u0097\u008e\u0001\u0000\u0000\u0000"+
		"\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0007\u0000\u0000\u0000\u009a\u0017\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0003\u0006\u0003\u0000\u009c\u0019\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0003\u001c\u000e\u0000\u009e\u00a0\u0003\u001e\u000f\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u001b\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u001a\u0000\u0000"+
		"\u00a2\u001d\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001b\u0000\u0000"+
		"\u00a4\u001f\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u001f\u0000\u0000"+
		"\u00a6!\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005 \u0000\u0000\u00a8#"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0001\u0000\u0000\u00aa%\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\u000f\u0000\u0000\u00ac\u00ad\u0003"+
		"(\u0014\u0000\u00ad\'\u0001\u0000\u0000\u0000\u00ae\u00b3\u0003*\u0015"+
		"\u0000\u00af\u00b0\u0005\u0002\u0000\u0000\u00b0\u00b2\u0003*\u0015\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4)\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0003\u0006\u0003\u0000\u00b7\u00b8\u0005\u0006\u0000\u0000\u00b8"+
		"\u00b9\u0003,\u0016\u0000\u00b9+\u0001\u0000\u0000\u0000\u00ba\u00be\u0003"+
		".\u0017\u0000\u00bb\u00be\u00030\u0018\u0000\u00bc\u00be\u00032\u0019"+
		"\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be-\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0003\u0006\u0003\u0000\u00c0/\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c4\u00034\u001a\u0000\u00c2\u00c4\u00036\u001b\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c41\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c8\u00038\u001c\u0000\u00c6\u00c8\u0003@ \u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c83\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0003\u0000\u0000\u00ca"+
		"\u00cf\u0003\u0006\u0003\u0000\u00cb\u00cc\u0005\u0004\u0000\u0000\u00cc"+
		"\u00ce\u0003\u0006\u0003\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0005\u0000\u0000\u00d3"+
		"5\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0014\n\u0000\u00d5\u00d6"+
		"\u0005\t\u0000\u0000\u00d6\u00d7\u0003\u0014\n\u0000\u00d77\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0005\u0010\u0000\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u0011\u0000\u0000\u00dc\u00dd\u0005\n\u0000"+
		"\u0000\u00dd\u00de\u0003:\u001d\u0000\u00de\u00df\u0005\u000b\u0000\u0000"+
		"\u00df\u00e0\u0005\u0012\u0000\u0000\u00e0\u00e1\u0003>\u001f\u0000\u00e1"+
		"9\u0001\u0000\u0000\u0000\u00e2\u00e7\u0003<\u001e\u0000\u00e3\u00e4\u0005"+
		"\u0004\u0000\u0000\u00e4\u00e6\u0003<\u001e\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8;\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ed\u0003.\u0017\u0000"+
		"\u00eb\u00ed\u00030\u0018\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed=\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0003,\u0016\u0000\u00ef?\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1A\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0014\u0000"+
		"\u0000\u00f3\u00f4\u0003D\"\u0000\u00f4C\u0001\u0000\u0000\u0000\u00f5"+
		"\u00fa\u0003F#\u0000\u00f6\u00f7\u0005\u0002\u0000\u0000\u00f7\u00f9\u0003"+
		"F#\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fbE\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0003H$\u0000\u00fe\u00ff\u0005\f\u0000\u0000\u00ff\u0100"+
		"\u0003,\u0016\u0000\u0100G\u0001\u0000\u0000\u0000\u0101\u0106\u0003\u0006"+
		"\u0003\u0000\u0102\u0103\u0005\u0004\u0000\u0000\u0103\u0105\u0003\u0006"+
		"\u0003\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107I\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010aK\u0001\u0000\u0000\u0000"+
		"\u0015S]mrw|\u0086\u008e\u0092\u0097\u009f\u00b3\u00bd\u00c3\u00c7\u00cf"+
		"\u00d9\u00e7\u00ec\u00fa\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}