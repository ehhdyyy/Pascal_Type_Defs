// Generated from Pcl_P2.g4 by ANTLR 4.13.2

    package intermediate.antlr4;
    
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec_P2;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Pcl_P2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Pcl_P2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Pcl_P2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(Pcl_P2Parser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#programParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramParameters(Pcl_P2Parser.ProgramParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Pcl_P2Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Pcl_P2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(Pcl_P2Parser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(Pcl_P2Parser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#constantsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantsPart(Pcl_P2Parser.ConstantsPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#constantDefinitionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionsList(Pcl_P2Parser.ConstantDefinitionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(Pcl_P2Parser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(Pcl_P2Parser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(Pcl_P2Parser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#constantIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantIdentifier(Pcl_P2Parser.ConstantIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(Pcl_P2Parser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(Pcl_P2Parser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#realConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConstant(Pcl_P2Parser.RealConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#characterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(Pcl_P2Parser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(Pcl_P2Parser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(Pcl_P2Parser.BooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#typesPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesPart(Pcl_P2Parser.TypesPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#typeDefinitionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionsList(Pcl_P2Parser.TypeDefinitionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(Pcl_P2Parser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#typeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecification(Pcl_P2Parser.TypeSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(Pcl_P2Parser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#ordinalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinalType(Pcl_P2Parser.OrdinalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(Pcl_P2Parser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#enumeratedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratedType(Pcl_P2Parser.EnumeratedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(Pcl_P2Parser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Pcl_P2Parser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#dimensionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionList(Pcl_P2Parser.DimensionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(Pcl_P2Parser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#elmtType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElmtType(Pcl_P2Parser.ElmtTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(Pcl_P2Parser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#variablesPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesPart(Pcl_P2Parser.VariablesPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#variableDeclarationsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationsList(Pcl_P2Parser.VariableDeclarationsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#variableDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarations(Pcl_P2Parser.VariableDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#variableIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifierList(Pcl_P2Parser.VariableIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl_P2Parser#procedureAndFunctionsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionsPart(Pcl_P2Parser.ProcedureAndFunctionsPartContext ctx);
}