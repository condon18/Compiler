package parse;
import java.util.List;

import errorMsg.*;

public class TokenGrammar implements wrangLR.runtime.MessageObject {

	public TokenGrammar(ErrorMsg em) {
		errorMsg = em;
	}
	private ErrorMsg errorMsg;

	public void error(int pos, String msg) {
		errorMsg.error(pos, msg);
	}

	public void warning(int pos, String msg) {
		errorMsg.warning(pos, msg);
	}

	public void reportTok(int pos, String s) {
		System.out.println(errorMsg.lineAndChar(pos)+": "+s);
	}


//: start ::= ws* token*


//: token ::= # `boolean =>
public void sawBoolean(int pos) {
       reportTok(pos, "`boolean");
}
//: token ::= # `class =>
public void sawClass(int pos) {
       reportTok(pos, "`class");
}
//: token ::= # `extends =>
public void sawExtends(int pos) {
       reportTok(pos, "`extends");
}
//: token ::= # `void =>
public void sawVoid(int pos) {
       reportTok(pos, "`void");
}
//: token ::= # `int =>
public void sawInt(int pos) {
       reportTok(pos, "`int");
}
//: token ::= # `while =>
public void sawWhile(int pos) {
       reportTok(pos, "`while");
}
//: token ::= # `if =>
public void sawIf(int pos) {
       reportTok(pos, "`if");
}
//: token ::= # `else =>
public void sawElse(int pos) {
       reportTok(pos, "`else");
}
//: token ::= # `for =>
public void sawFor(int pos) {
       reportTok(pos, "`for");
}
//: token ::= # `break =>
public void sawBreak(int pos) {
       reportTok(pos, "`break");
}
//: token ::= # `this =>
public void sawThis(int pos) {
       reportTok(pos, "`this");
}
//: token ::= # `false =>
public void sawFalse(int pos) {
       reportTok(pos, "`false");
}
//: token ::= # `true =>
public void sawTrue(int pos) {
       reportTok(pos, "`true");
}
//: token ::= # `super =>
public void sawSuper(int pos) {
       reportTok(pos, "`super");
}
//: token ::= # `null =>
public void sawNull(int pos) {
       reportTok(pos, "`null");
}
//: token ::= # `return =>
public void sawReturn(int pos) {
       reportTok(pos, "`return");
}
//: token ::= # `instanceof =>
public void sawInstanceof(int pos) {
       reportTok(pos, "`instanceof");
}
//: token ::= # `new =>
public void sawNew(int pos) {
       reportTok(pos, "`new");
}
//: token ::= # `abstract =>
public void sawAbstract(int pos) {
       reportTok(pos, "`abstract");
}
//: token ::= # `assert =>
public void sawAssert(int pos) {
       reportTok(pos, "`assert");
}
//: token ::= # `byte =>
public void sawByte(int pos) {
       reportTok(pos, "`byte");
}
//: token ::= # `case =>
public void sawCase(int pos) {
       reportTok(pos, "`case");
}
//: token ::= # `catch =>
public void sawCatch(int pos) {
       reportTok(pos, "`catch");
}
//: token ::= # `char =>
public void sawChar(int pos) {
       reportTok(pos, "`char");
}
//: token ::= # `const =>
public void sawConst(int pos) {
       reportTok(pos, "`const");
}
//: token ::= # `continue =>
public void sawContinue(int pos) {
       reportTok(pos, "`continue");
}
//: token ::= # `default =>
public void sawDefault(int pos) {
       reportTok(pos, "`default");
}
//: token ::= # `do =>
public void sawDo(int pos) {
       reportTok(pos, "`do");
}
//: token ::= # `double =>
public void sawDouble(int pos) {
       reportTok(pos, "`double");
}
//: token ::= # `enum =>
public void sawEnum(int pos) {
       reportTok(pos, "`enum");
}
//: token ::= # `final =>
public void sawFinal(int pos) {
       reportTok(pos, "`final");
}
//: token ::= # `finally =>
public void sawFinally(int pos) {
       reportTok(pos, "`finally");
}
//: token ::= # `float =>
public void sawFloat(int pos) {
       reportTok(pos, "`float");
}
//: token ::= # `goto =>
public void sawGoto(int pos) {
       reportTok(pos, "`goto");
}
//: token ::= # `implements =>
public void sawImplements(int pos) {
       reportTok(pos, "`implements");
}
//: token ::= # `import =>
public void sawImport(int pos) {
       reportTok(pos, "`import");
}
//: token ::= # `interface =>
public void sawInterface(int pos) {
       reportTok(pos, "`interface");
}
//: token ::= # `long =>
public void sawLong(int pos) {
       reportTok(pos, "`long");
}
//: token ::= # `native =>
public void sawNative(int pos) {
       reportTok(pos, "`native");
}
//: token ::= # `package =>
public void sawPackage(int pos) {
       reportTok(pos, "`package");
}
//: token ::= # `private =>
public void sawPrivate(int pos) {
       reportTok(pos, "`private");
}
//: token ::= # `protected =>
public void sawProtected(int pos) {
       reportTok(pos, "`protected");
}
//: token ::= # `public =>
public void sawPublic(int pos) {
       reportTok(pos, "`public");
}
//: token ::= # `short =>
public void sawShort(int pos) {
       reportTok(pos, "`short");
}
//: token ::= # `static =>
public void sawStatic(int pos) {
       reportTok(pos, "`static");
}
//: token ::= # `strictfp =>
public void sawStrictfp(int pos) {
       reportTok(pos, "`strictfp");
}
//: token ::= # `switch =>
public void sawSwitch(int pos) {
       reportTok(pos, "`switch");
}
//: token ::= # `synchronized =>
public void sawSynchronized(int pos) {
       reportTok(pos, "`synchronized");
}
//: token ::= # `throw =>
public void sawThrow(int pos) {
       reportTok(pos, "`throw");
}
//: token ::= # `throws =>
public void sawThrows(int pos) {
       reportTok(pos, "`throws");
}
//: token ::= # `transient =>
public void sawTransient(int pos) {
       reportTok(pos, "`transient");
}
//: token ::= # `try =>
public void sawTry(int pos) {
       reportTok(pos, "`try");
}
//: token ::= # `volatile =>
public void sawVolatile(int pos) {
       reportTok(pos, "`volatile");
}

//: token ::= # `! =>
public void sawNot(int pos) {
     reportTok(pos, "`!");
}
//: token ::= # `!= =>
public void sawNotEqual(int pos) {
     reportTok(pos, "`!=");
}
//: token ::= # `% =>
public void sawRemainder(int pos) {
     reportTok(pos, "`%");
}
//: token ::= # `&& =>
public void sawAnd(int pos) {
     reportTok(pos, "`&&");
}
//: token ::= # `* =>
public void sawTimes(int pos) {
     reportTok(pos, "`*");
}
//: token ::= # `( =>
public void sawLpar(int pos) {
     reportTok(pos, "`(");
}
//: token ::= # `) =>
public void sawRpar(int pos) {
     reportTok(pos, "`)");
}
//: token ::= # `{ =>
public void sawLbrace(int pos) {
     reportTok(pos, "`{");
}
//: token ::= # `} =>
public void sawRbrace(int pos) {
     reportTok(pos, "`}");
}
//: token ::= # `- =>
public void sawMinus(int pos) {
     reportTok(pos, "`-");
}
//: token ::= # `+ =>
public void sawPlus(int pos) {
     reportTok(pos, "`+");
}
//: token ::= # `= =>
public void sawAssign(int pos) {
     reportTok(pos, "`=");
}
//: token ::= # `== =>
public void sawEqual(int pos) {
     reportTok(pos, "`==");
}
//: token ::= # `[ =>
public void sawLbrack(int pos) {
     reportTok(pos, "`[");
}
//: token ::= # `] =>
public void sawRbrack(int pos) {
     reportTok(pos, "`]");
}
//: token ::= # `|| =>
public void sawOr(int pos) {
     reportTok(pos, "`||");
}
//: token ::= # `< =>
public void sawLess(int pos) {
     reportTok(pos, "`<");
}
//: token ::= # `<= =>
public void sawLessEq(int pos) {
     reportTok(pos, "`<=");
}
//: token ::= # `, =>
public void sawComma(int pos) {
     reportTok(pos, "`,");
}
//: token ::= # `> =>
public void sawGreater(int pos) {
     reportTok(pos, "`>");
}
//: token ::= # `>= =>
public void sawGreaterEq(int pos) {
     reportTok(pos, "`>=");
}
//: token ::= # `. =>
public void sawDot(int pos) {
     reportTok(pos, "`.");
}
//: token ::= # `; =>
public void sawSemi(int pos) {
     reportTok(pos, "`;");
}
//: token ::= # `++ =>
public void sawPlusPlus(int pos) {
     reportTok(pos, "`++");
}
//: token ::= # `-- =>
public void sawMinusMinus(int pos) {
     reportTok(pos, "`--");
}
//: token ::= # `/ =>
public void sawSlash(int pos) {
     reportTok(pos, "`/");
}

//: token ::= # ID =>
public void identifier(int pos, String s) {
	reportTok(pos, "identifier: "+s);
}

//: token ::= # INTLIT =>
public void intLit(int pos, int n) {
	reportTok(pos, "integer literal: "+n);
}

//: token ::= # STRINGLIT =>
public void stringLit(int pos, String s) {
	reportTok(pos, "string literal: "+s);
}

//: token ::= # CHARLIT =>
public void charLit(int pos, int n) {
	reportTok(pos, "character literal with ASCII value: "+n);
}
/////////////////////////////////////////////////////////////////
///////////  Your modifications should start here  //////////////
/////////////////////////////////////////////////////////////////

//================================================================
// the actual tokens
//================================================================

// reserved words
//: `class ::= "class" !idChar ws*
//: reserved ::= `class
//: `else ::= "else" !idChar ws*
//: reserved ::= `else
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `boolean ::= "boolean" !idChar ws*
//: reserved ::= `boolean
//: `false ::= "false" !idChar ws*
//: reserved ::= `false
//: `extends ::= "extends" !idChar ws*
//: reserved ::= `extends
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break
//: `break ::= "break" !idChar ws*
//: reserved ::= `break

//: `else ::= "else" !idChar ws*
//: reserved ::= `else
//special-token characters
//: `!= ::= "!=" ws*
//: `* ::= "*" ws*
//: `class ::= "class" !idChar ws*
//: reserved ::= `class
//: `else ::= "else" !idChar ws*
//: reserved ::= `else
// a numeric literal
//: INTLIT ::= # intLit2 ws* =>
public int convertToInt(int pos, String s) {
	try {
		return new Integer(s).intValue();
	}
	catch (NumberFormatException nfx) {
		error(pos, "Integer literal value "+s+" is out of range.");
		return 0;
	}
}

//================================================================
// character patterns -- "helper symbols"
//================================================================

// pattern that represents an integer literal (without trailing whitespace)
//: intLit2 ::= !"0" digit++ => text

// a character that can be a non-first character in an identifier
//: idChar ::= letter => pass
//: idChar ::= digit => pass
//: idChar ::= "_" => pass

// a letter
//: letter ::= {"a".."z" "A".."Z"} => pass

// a digit
//: digit ::= {"0".."9"} => pass

//================================================================
// whitespace
//================================================================

// whitespace
//: ws ::= {" " 9} // space or tab
//: ws ::= eol

// to handle the common end-of-line sequences on different types
// of systems, we treat the sequence CR+LF as an end of line.
// Otherwise, we treat CR or LF appearing separately each as an
// end of line.
//: eol ::= {10} registerNewline
//: eol ::= {13} {10} registerNewline
//: eol ::= {13} !{10} registerNewline // CR alone only if not followed by LF

// empty symbol which registers a new line at the position reduced
//: registerNewline ::= # =>
public void registerNewline(int pos) {
	errorMsg.newline(pos-1);
}

//================================================================
// dummied up (and incorrect) definitions, so that this starter-file
// will compile. These definitions use unprintable characters.
//================================================================
//: CHARLIT ::= {130} =>
public int zero(char c) { return 0;}
//: ID ::= {131} => text
//: STRINGLIT ::= {132} => text
//: `! ::= {133}
//: `% ::= {134}
//: `&& ::= {135}
//: `( ::= {136}
//: `) ::= {137}
//: `+ ::= {138}
//: `++ ::= {139}
//: `, ::= {140}
//: `- ::= {141}
//: `-- ::= {142}
//: `. ::= {143}
//: `/ ::= {144}
//: `; ::= {145}
//: `< ::= {146}
//: `<= ::= {147}
//: `= ::= {148}
//: `== ::= {149}
//: `> ::= {150}
//: `>= ::= {151}
//: `[ ::= {152}
//: `] ::= {153}
//: `{ ::= {154}
//: `|| ::= {155}
//: `} ::= {156}
//: `abstract ::= {157}
//: `assert ::= {158}
//: `boolean ::= {159}
//: `break ::= {160}
//: `byte ::= {161}
//: `case ::= {162}
//: `catch ::= {163}
//: `char ::= {164}
//: `const ::= {165}
//: `continue ::= {166}
//: `default ::= {167}
//: `do ::= {168}
//: `double ::= {169}
//: `enum ::= {170}
//: `extends ::= {171}
//: `false ::= {172}
//: `final ::= {173}
//: `finally ::= {174}
//: `float ::= {175}
//: `for ::= {176}
//: `goto ::= {177}
//: `if ::= {178}
//: `implements ::= {179}
//: `import ::= {180}
//: `instanceof ::= {181}
//: `int ::= {182}
//: `interface ::= {183}
//: `long ::= {184}
//: `native ::= {185}
//: `new ::= {186}
//: `null ::= {187}
//: `package ::= {188}
//: `private ::= {189}
//: `protected ::= {190}
//: `public ::= {191}
//: `return ::= {192}
//: `short ::= {193}
//: `static ::= {194}
//: `strictfp ::= {195}
//: `super ::= {196}
//: `switch ::= {197}
//: `synchronized ::= {198}
//: `this ::= {199}
//: `throw ::= {200}
//: `throws ::= {201}
//: `transient ::= {202}
//: `true ::= {203}
//: `try ::= {204}
//: `void ::= {205}
//: `volatile ::= {206}
//: `while ::= {207}

}
