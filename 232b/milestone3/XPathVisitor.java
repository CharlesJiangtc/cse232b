// Generated from XPath.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XPathParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(XPathParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XPathParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApChildren(XPathParser.ApChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApDescendant}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApDescendant(XPathParser.ApDescendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllChildren(XPathParser.AllChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpConcatenation}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpConcatenation(XPathParser.RpConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XPathParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpChildren(XPathParser.RpChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpDescendant}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDescendant(XPathParser.RpDescendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpwithParentheses}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpwithParentheses(XPathParser.RpwithParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XPathParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tag}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(XPathParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XPathParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(XPathParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqual(XPathParser.FilterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterwithParentheses}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterwithParentheses(XPathParser.FilterwithParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNot(XPathParser.FilterNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterOr(XPathParser.FilterOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAnd(XPathParser.FilterAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(XPathParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterIs(XPathParser.FilterIsContext ctx);
}