/**
 * Class information:
 *	A Java class to 
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *	Author Information
 *
 *	The MIT License (MIT)
 *
 *	Copyright (c) <2016> Zhiyang Ong
 *
 *	Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 *	The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 *	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *	Email address: echo "cukj -wb- 23wU4X5M589 TROJANS cqkH wiuz2y 0f Mw Stanford" | awk '{ sub("23wU4X5M589","F.d_c_b. ") sub("Stanford","d0mA1n"); print $5, $2, $8; for (i=1; i<=1; i++) print "6\b"; print $9, $7, $6 }' | sed y/kqcbuHwM62z/gnotrzadqmC/ | tr 'q' ' ' | tr -d [:cntrl:] | tr -d 'ir' | tr y "\n"		Don't compromise my computing accounts. You have been warned.
 *
 */











import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class JavaParserTest extends JavaBaseListener{
//	static TokenStreamRewriter rewriter = null;

	public static void main(String[] args) throws IOException {
		if(args.length<1)
		{
			System.err.println("java JavaParserTest input-filename\n"
					+"Example: java JavaParserTest Test.java");
			return;
		}
		String inputFile = args[0];
    	CharStream input = new ANTLRFileStream(inputFile);
    	JavaLexer lexer = new JavaLexer(input);
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	JavaParser parser = new JavaParser(tokens); //create parser

    	ParseTree tree = parser.compilationUnit();
    	ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
    	JavaParserTest listener = new JavaParserTest(); // create a parse tree listener
    	walker.walk(listener, tree); // traverse parse tree with listener
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void enterStatement(JavaParser.StatementContext ctx){
		ParExpressionContext parExpressionCtx = ctx.parExpression();
		ExpressionContext exprCtx = parExpressoinCtx.expression();

		// Is the first token 'if'?
		if(ctx.getStart().getText().equals("if")) {
			System.out.println("If statement Found!");
			// Second token is '('
			if(ctx.getStart().getText().equals('!')) {
				System.out.println("Found Negated Boolean Expression");
			}else{
				System.out.println("Found Boolean Expression");
			}
		}

//		System.out.println("enterStatement");
	    //your code starts here
	}
}
