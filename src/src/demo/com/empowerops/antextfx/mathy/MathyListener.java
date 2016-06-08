// Generated from C:/Users/Geoff/Code/ANTextFX/src/src/demo\Mathy.g4 by ANTLR 4.5.1
package com.empowerops.antextfx.mathy;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathyParser}.
 */
public interface MathyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MathyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MathyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MathyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MathyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MathyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MathyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathyParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(MathyParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathyParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(MathyParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MathyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MathyParser.LiteralContext ctx);
}