/*
* generated by Xtext
*/
package org.osate.xtext.aadl2.errormodel.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.osate.xtext.aadl2.errormodel.services.ErrorModelGrammarAccess;

public class ErrorModelParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ErrorModelGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.osate.xtext.aadl2.errormodel.parser.antlr.internal.InternalErrorModelParser createParser(XtextTokenStream stream) {
		return new org.osate.xtext.aadl2.errormodel.parser.antlr.internal.InternalErrorModelParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ErrorModelGrammarRoot";
	}
	
	public ErrorModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ErrorModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
