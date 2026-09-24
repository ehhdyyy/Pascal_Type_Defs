// Generated from /Users/vkouru007/Desktop/cs153/Pascal_Type_Defs/Pcl_P2/Pcl_P2.g4 by ANTLR 4.13.2

    package intermediate.antlr4;
    
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec_P2;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Pcl_P2Parser}.
 */
public interface Pcl_P2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Pcl_P2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Pcl_P2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(Pcl_P2Parser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(Pcl_P2Parser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#programParameters}.
	 * @param ctx the parse tree
	 */
	void enterProgramParameters(Pcl_P2Parser.ProgramParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#programParameters}.
	 * @param ctx the parse tree
	 */
	void exitProgramParameters(Pcl_P2Parser.ProgramParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Pcl_P2Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Pcl_P2Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Pcl_P2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Pcl_P2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(Pcl_P2Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(Pcl_P2Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(Pcl_P2Parser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(Pcl_P2Parser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#constantsPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantsPart(Pcl_P2Parser.ConstantsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#constantsPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantsPart(Pcl_P2Parser.ConstantsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#constantDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionsList(Pcl_P2Parser.ConstantDefinitionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#constantDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionsList(Pcl_P2Parser.ConstantDefinitionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(Pcl_P2Parser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(Pcl_P2Parser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(Pcl_P2Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(Pcl_P2Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(Pcl_P2Parser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(Pcl_P2Parser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantIdentifier(Pcl_P2Parser.ConstantIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantIdentifier(Pcl_P2Parser.ConstantIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(Pcl_P2Parser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(Pcl_P2Parser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(Pcl_P2Parser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(Pcl_P2Parser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(Pcl_P2Parser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(Pcl_P2Parser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(Pcl_P2Parser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(Pcl_P2Parser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(Pcl_P2Parser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(Pcl_P2Parser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(Pcl_P2Parser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(Pcl_P2Parser.BooleanConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#typesPart}.
	 * @param ctx the parse tree
	 */
	void enterTypesPart(Pcl_P2Parser.TypesPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#typesPart}.
	 * @param ctx the parse tree
	 */
	void exitTypesPart(Pcl_P2Parser.TypesPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#typeDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionsList(Pcl_P2Parser.TypeDefinitionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#typeDefinitionsList}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionsList(Pcl_P2Parser.TypeDefinitionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(Pcl_P2Parser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(Pcl_P2Parser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecification(Pcl_P2Parser.TypeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecification(Pcl_P2Parser.TypeSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(Pcl_P2Parser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(Pcl_P2Parser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#ordinalType}.
	 * @param ctx the parse tree
	 */
	void enterOrdinalType(Pcl_P2Parser.OrdinalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#ordinalType}.
	 * @param ctx the parse tree
	 */
	void exitOrdinalType(Pcl_P2Parser.OrdinalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(Pcl_P2Parser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(Pcl_P2Parser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#enumeratedType}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratedType(Pcl_P2Parser.EnumeratedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#enumeratedType}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratedType(Pcl_P2Parser.EnumeratedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(Pcl_P2Parser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(Pcl_P2Parser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Pcl_P2Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Pcl_P2Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#dimensionList}.
	 * @param ctx the parse tree
	 */
	void enterDimensionList(Pcl_P2Parser.DimensionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#dimensionList}.
	 * @param ctx the parse tree
	 */
	void exitDimensionList(Pcl_P2Parser.DimensionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(Pcl_P2Parser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(Pcl_P2Parser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#elmtType}.
	 * @param ctx the parse tree
	 */
	void enterElmtType(Pcl_P2Parser.ElmtTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#elmtType}.
	 * @param ctx the parse tree
	 */
	void exitElmtType(Pcl_P2Parser.ElmtTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(Pcl_P2Parser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(Pcl_P2Parser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#variablesPart}.
	 * @param ctx the parse tree
	 */
	void enterVariablesPart(Pcl_P2Parser.VariablesPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#variablesPart}.
	 * @param ctx the parse tree
	 */
	void exitVariablesPart(Pcl_P2Parser.VariablesPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#variableDeclarationsList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationsList(Pcl_P2Parser.VariableDeclarationsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#variableDeclarationsList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationsList(Pcl_P2Parser.VariableDeclarationsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarations(Pcl_P2Parser.VariableDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarations(Pcl_P2Parser.VariableDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#variableIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifierList(Pcl_P2Parser.VariableIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#variableIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifierList(Pcl_P2Parser.VariableIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#procedureAndFunctionsPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionsPart(Pcl_P2Parser.ProcedureAndFunctionsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#procedureAndFunctionsPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionsPart(Pcl_P2Parser.ProcedureAndFunctionsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl_P2Parser#hashtableType}.
	 * @param ctx the parse tree
	 */
	void enterHashtableType(Pcl_P2Parser.HashtableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl_P2Parser#hashtableType}.
	 * @param ctx the parse tree
	 */
	void exitHashtableType(Pcl_P2Parser.HashtableTypeContext ctx);
}