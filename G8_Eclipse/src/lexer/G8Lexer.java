package lexer;
// $ANTLR 3.5.1 D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g 2019-06-27 23:27:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class G8Lexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int COMMENT=4;
	public static final int FLOAT=5;
	public static final int RGB=6;
	public static final int ROTATION=7;
	public static final int TEXT=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public G8Lexer() {} 
	public G8Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public G8Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:2:7: ( 'CIRC:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:2:9: 'CIRC:'
			{
			match("CIRC:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:3:7: ( 'COLOR' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:3:9: 'COLOR'
			{
			match("COLOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:4:7: ( 'COLORBODY' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:4:9: 'COLORBODY'
			{
			match("COLORBODY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:5:7: ( 'CURV:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:5:9: 'CURV:'
			{
			match("CURV:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:6:7: ( 'DRAWSPACE HEIGTH' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:6:9: 'DRAWSPACE HEIGTH'
			{
			match("DRAWSPACE HEIGTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:7:7: ( 'DRAWSPACE WIDTH' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:7:9: 'DRAWSPACE WIDTH'
			{
			match("DRAWSPACE WIDTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:8:7: ( 'ELLIPS:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:8:9: 'ELLIPS:'
			{
			match("ELLIPS:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:9:7: ( 'END' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:9:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:10:7: ( 'ENDANGLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:10:9: 'ENDANGLE'
			{
			match("ENDANGLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:11:7: ( 'LINE:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:11:9: 'LINE:'
			{
			match("LINE:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:12:7: ( 'NAME' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:12:9: 'NAME'
			{
			match("NAME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:13:7: ( 'RADIUS' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:13:9: 'RADIUS'
			{
			match("RADIUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:14:7: ( 'RECT:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:14:9: 'RECT:'
			{
			match("RECT:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:15:7: ( 'ROTATION' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:15:9: 'ROTATION'
			{
			match("ROTATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:16:7: ( 'SEMAX' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:16:9: 'SEMAX'
			{
			match("SEMAX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:17:7: ( 'SEMIN' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:17:9: 'SEMIN'
			{
			match("SEMIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:18:7: ( 'STARTANGLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:18:9: 'STARTANGLE'
			{
			match("STARTANGLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:19:7: ( 'TITLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:19:9: 'TITLE'
			{
			match("TITLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:20:7: ( 'TRIANGLE:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:20:9: 'TRIANGLE:'
			{
			match("TRIANGLE:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:21:7: ( 'WIDTH' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:21:9: 'WIDTH'
			{
			match("WIDTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:22:7: ( 'XA' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:22:9: 'XA'
			{
			match("XA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:23:7: ( 'XB' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:23:9: 'XB'
			{
			match("XB"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:24:7: ( 'XC' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:24:9: 'XC'
			{
			match("XC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:25:7: ( 'XCENTER' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:25:9: 'XCENTER'
			{
			match("XCENTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:26:7: ( 'XEND' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:26:9: 'XEND'
			{
			match("XEND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:27:7: ( 'XMIDDLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:27:9: 'XMIDDLE'
			{
			match("XMIDDLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:28:7: ( 'XSTART' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:28:9: 'XSTART'
			{
			match("XSTART"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:29:7: ( 'YA' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:29:9: 'YA'
			{
			match("YA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:30:7: ( 'YB' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:30:9: 'YB'
			{
			match("YB"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:31:7: ( 'YC' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:31:9: 'YC'
			{
			match("YC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:32:7: ( 'YCENTER' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:32:9: 'YCENTER'
			{
			match("YCENTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:33:7: ( 'YEND' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:33:9: 'YEND'
			{
			match("YEND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:34:7: ( 'YMIDDLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:34:9: 'YMIDDLE'
			{
			match("YMIDDLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:35:7: ( 'YSTART' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:35:9: 'YSTART'
			{
			match("YSTART"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "RGB"
	public final void mRGB() throws RecognitionException {
		try {
			int _type = RGB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:124:5: ( '#' ( '0' .. '9' | 'A' .. 'F' )+ )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:124:7: '#' ( '0' .. '9' | 'A' .. 'F' )+
			{
			match('#'); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:124:11: ( '0' .. '9' | 'A' .. 'F' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'F')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RGB"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:127:7: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:127:11: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
			{
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:127:11: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:127:23: ( '.' ( '0' .. '9' )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:127:24: '.' ( '0' .. '9' )*
					{
					match('.'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:127:27: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:130:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:130:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
			{
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:130:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT"

	// $ANTLR start "ROTATION"
	public final void mROTATION() throws RecognitionException {
		try {
			int _type = ROTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:10: ( '-' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '+' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='-') ) {
				alt12=1;
			}
			else if ( (LA12_0=='+') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:12: '-' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
					{
					match('-'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:16: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:28: ( '.' ( '0' .. '9' )* )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='.') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:29: '.' ( '0' .. '9' )*
							{
							match('.'); 
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:32: ( '0' .. '9' )*
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
									alt7=1;
								}

								switch (alt7) {
								case 1 :
									// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop7;
								}
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:50: '+' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
					{
					match('+'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:54: ( '0' .. '9' )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:66: ( '.' ( '0' .. '9' )* )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='.') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:67: '.' ( '0' .. '9' )*
							{
							match('.'); 
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:133:70: ( '0' .. '9' )*
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
									alt10=1;
								}

								switch (alt10) {
								case 1 :
									// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop10;
								}
							}

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROTATION"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:136:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='/') ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1=='/') ) {
					alt16=1;
				}
				else if ( (LA16_1=='*') ) {
					alt16=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:136:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:136:18: (~ ( '\\n' | '\\r' ) )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\uFFFF')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop13;
						}
					}

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:136:32: ( '\\r' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='\r') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:136:32: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:137:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:137:14: ( options {greedy=false; } : . )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0=='*') ) {
							int LA15_1 = input.LA(2);
							if ( (LA15_1=='/') ) {
								alt15=2;
							}
							else if ( ((LA15_1 >= '\u0000' && LA15_1 <= '.')||(LA15_1 >= '0' && LA15_1 <= '\uFFFF')) ) {
								alt15=1;
							}

						}
						else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ')')||(LA15_0 >= '+' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:137:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop15;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:140:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:140:8: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RGB | FLOAT | TEXT | ROTATION | COMMENT | WS )
		int alt17=40;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:106: T__26
				{
				mT__26(); 

				}
				break;
			case 18 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:112: T__27
				{
				mT__27(); 

				}
				break;
			case 19 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:118: T__28
				{
				mT__28(); 

				}
				break;
			case 20 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:124: T__29
				{
				mT__29(); 

				}
				break;
			case 21 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:130: T__30
				{
				mT__30(); 

				}
				break;
			case 22 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:136: T__31
				{
				mT__31(); 

				}
				break;
			case 23 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:142: T__32
				{
				mT__32(); 

				}
				break;
			case 24 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:148: T__33
				{
				mT__33(); 

				}
				break;
			case 25 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:154: T__34
				{
				mT__34(); 

				}
				break;
			case 26 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:160: T__35
				{
				mT__35(); 

				}
				break;
			case 27 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:166: T__36
				{
				mT__36(); 

				}
				break;
			case 28 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:172: T__37
				{
				mT__37(); 

				}
				break;
			case 29 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:178: T__38
				{
				mT__38(); 

				}
				break;
			case 30 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:184: T__39
				{
				mT__39(); 

				}
				break;
			case 31 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:190: T__40
				{
				mT__40(); 

				}
				break;
			case 32 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:196: T__41
				{
				mT__41(); 

				}
				break;
			case 33 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:202: T__42
				{
				mT__42(); 

				}
				break;
			case 34 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:208: T__43
				{
				mT__43(); 

				}
				break;
			case 35 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:214: RGB
				{
				mRGB(); 

				}
				break;
			case 36 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:218: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 37 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:224: TEXT
				{
				mTEXT(); 

				}
				break;
			case 38 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:229: ROTATION
				{
				mROTATION(); 

				}
				break;
			case 39 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:238: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 40 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8final.g:1:246: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA17_eotS =
		"\1\uffff\13\16\1\uffff\1\56\4\uffff\20\16\1\77\1\100\1\102\3\16\1\106"+
		"\1\107\1\111\3\16\1\uffff\5\16\1\123\12\16\2\uffff\1\16\1\uffff\3\16\2"+
		"\uffff\1\16\1\uffff\11\16\1\uffff\1\16\1\156\12\16\1\171\3\16\1\175\2"+
		"\16\1\uffff\1\u0081\1\uffff\3\16\2\uffff\1\16\1\uffff\1\16\1\u0087\1\u0088"+
		"\1\16\1\u008a\1\16\1\u008c\1\16\1\uffff\3\16\1\uffff\3\16\1\uffff\3\16"+
		"\1\u0097\1\16\2\uffff\1\16\1\uffff\1\16\1\uffff\2\16\1\u009d\2\16\1\u00a0"+
		"\2\16\1\uffff\1\16\1\uffff\3\16\1\u00a7\1\u00a8\1\uffff\1\u00a9\1\u00aa"+
		"\1\uffff\2\16\1\u00ad\1\u00ae\2\16\4\uffff\1\u00b1\1\16\2\uffff\1\16\3"+
		"\uffff\1\u00b6\3\uffff";
	static final String DFA17_eofS =
		"\u00b7\uffff";
	static final String DFA17_minS =
		"\1\11\1\111\1\122\1\114\1\111\2\101\1\105\2\111\2\101\1\uffff\1\60\4\uffff"+
		"\1\122\1\114\1\122\1\101\1\114\1\104\1\116\1\115\1\104\1\103\1\124\1\115"+
		"\1\101\1\124\1\111\1\104\3\60\1\116\1\111\1\124\3\60\1\116\1\111\1\124"+
		"\1\uffff\1\103\1\117\1\126\1\127\1\111\1\60\2\105\1\111\1\124\2\101\1"+
		"\122\1\114\1\101\1\124\2\uffff\1\116\1\uffff\2\104\1\101\2\uffff\1\116"+
		"\1\uffff\2\104\1\101\1\72\1\122\1\72\1\123\1\120\1\116\1\uffff\1\72\1"+
		"\60\1\125\1\72\1\124\1\130\1\116\1\124\1\105\1\116\1\110\1\124\1\60\1"+
		"\104\1\122\1\124\1\60\1\104\1\122\1\uffff\1\60\1\uffff\1\120\1\123\1\107"+
		"\2\uffff\1\123\1\uffff\1\111\2\60\1\101\1\60\1\107\1\60\1\105\1\uffff"+
		"\1\114\1\124\1\105\1\uffff\1\114\1\124\1\117\1\uffff\1\101\1\72\1\114"+
		"\1\60\1\117\2\uffff\1\116\1\uffff\1\114\1\uffff\1\122\1\105\1\60\1\122"+
		"\1\105\1\60\1\104\1\103\1\uffff\1\105\1\uffff\1\116\1\107\1\105\2\60\1"+
		"\uffff\2\60\1\uffff\1\131\1\105\2\60\1\114\1\72\4\uffff\1\60\1\40\2\uffff"+
		"\1\105\2\uffff\1\110\1\60\3\uffff";
	static final String DFA17_maxS =
		"\1\172\1\125\1\122\1\116\1\111\1\101\1\117\1\124\1\122\1\111\2\123\1\uffff"+
		"\1\172\4\uffff\1\122\1\114\1\122\1\101\1\114\1\104\1\116\1\115\1\104\1"+
		"\103\1\124\1\115\1\101\1\124\1\111\1\104\3\172\1\116\1\111\1\124\3\172"+
		"\1\116\1\111\1\124\1\uffff\1\103\1\117\1\126\1\127\1\111\1\172\2\105\1"+
		"\111\1\124\1\101\1\111\1\122\1\114\1\101\1\124\2\uffff\1\116\1\uffff\2"+
		"\104\1\101\2\uffff\1\116\1\uffff\2\104\1\101\1\72\1\122\1\72\1\123\1\120"+
		"\1\116\1\uffff\1\72\1\172\1\125\1\72\1\124\1\130\1\116\1\124\1\105\1\116"+
		"\1\110\1\124\1\172\1\104\1\122\1\124\1\172\1\104\1\122\1\uffff\1\172\1"+
		"\uffff\1\120\1\123\1\107\2\uffff\1\123\1\uffff\1\111\2\172\1\101\1\172"+
		"\1\107\1\172\1\105\1\uffff\1\114\1\124\1\105\1\uffff\1\114\1\124\1\117"+
		"\1\uffff\1\101\1\72\1\114\1\172\1\117\2\uffff\1\116\1\uffff\1\114\1\uffff"+
		"\1\122\1\105\1\172\1\122\1\105\1\172\1\104\1\103\1\uffff\1\105\1\uffff"+
		"\1\116\1\107\1\105\2\172\1\uffff\2\172\1\uffff\1\131\1\105\2\172\1\114"+
		"\1\72\4\uffff\1\172\1\40\2\uffff\1\105\2\uffff\1\127\1\172\3\uffff";
	static final String DFA17_acceptS =
		"\14\uffff\1\43\1\uffff\1\45\1\46\1\47\1\50\34\uffff\1\44\20\uffff\1\25"+
		"\1\26\1\uffff\1\27\3\uffff\1\34\1\35\1\uffff\1\36\11\uffff\1\10\23\uffff"+
		"\1\1\1\uffff\1\4\3\uffff\1\12\1\13\1\uffff\1\15\10\uffff\1\31\3\uffff"+
		"\1\40\3\uffff\1\2\5\uffff\1\17\1\20\1\uffff\1\22\1\uffff\1\24\10\uffff"+
		"\1\7\1\uffff\1\14\5\uffff\1\33\2\uffff\1\42\6\uffff\1\30\1\32\1\37\1\41"+
		"\2\uffff\1\11\1\16\1\uffff\1\23\1\3\2\uffff\1\5\1\6\1\21";
	static final String DFA17_specialS =
		"\u00b7\uffff}>";
	static final String[] DFA17_transitionS = {
			"\2\21\2\uffff\1\21\22\uffff\1\21\2\uffff\1\14\7\uffff\1\17\1\uffff\1"+
			"\17\1\uffff\1\20\12\15\7\uffff\2\16\1\1\1\2\1\3\6\16\1\4\1\16\1\5\3\16"+
			"\1\6\1\7\1\10\2\16\1\11\1\12\1\13\1\16\6\uffff\32\16",
			"\1\22\5\uffff\1\23\5\uffff\1\24",
			"\1\25",
			"\1\26\1\uffff\1\27",
			"\1\30",
			"\1\31",
			"\1\32\3\uffff\1\33\11\uffff\1\34",
			"\1\35\16\uffff\1\36",
			"\1\37\10\uffff\1\40",
			"\1\41",
			"\1\42\1\43\1\44\1\uffff\1\45\7\uffff\1\46\5\uffff\1\47",
			"\1\50\1\51\1\52\1\uffff\1\53\7\uffff\1\54\5\uffff\1\55",
			"",
			"\12\15\7\uffff\32\16\6\uffff\32\16",
			"",
			"",
			"",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\12\16\7\uffff\4\16\1\101\25\16\6\uffff\32\16",
			"\1\103",
			"\1\104",
			"\1\105",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\12\16\7\uffff\4\16\1\110\25\16\6\uffff\32\16",
			"\1\112",
			"\1\113",
			"\1\114",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\12\16\7\uffff\1\122\31\16\6\uffff\32\16",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131\7\uffff\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"",
			"",
			"\1\137",
			"",
			"\1\140",
			"\1\141",
			"\1\142",
			"",
			"",
			"\1\143",
			"",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"",
			"\1\155",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\172",
			"\1\173",
			"\1\174",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\176",
			"\1\177",
			"",
			"\12\16\7\uffff\1\16\1\u0080\30\16\6\uffff\32\16",
			"",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"",
			"",
			"\1\u0085",
			"",
			"\1\u0086",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\u0089",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\u008b",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\u008d",
			"",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\u0098",
			"",
			"",
			"\1\u0099",
			"",
			"\1\u009a",
			"",
			"\1\u009b",
			"\1\u009c",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\u009e",
			"\1\u009f",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\u00a1",
			"\1\u00a2",
			"",
			"\1\u00a3",
			"",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"",
			"\1\u00ab",
			"\1\u00ac",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\u00af",
			"\1\u00b0",
			"",
			"",
			"",
			"",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"\1\u00b2",
			"",
			"",
			"\1\u00b3",
			"",
			"",
			"\1\u00b4\16\uffff\1\u00b5",
			"\12\16\7\uffff\32\16\6\uffff\32\16",
			"",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RGB | FLOAT | TEXT | ROTATION | COMMENT | WS );";
		}
	}

}
