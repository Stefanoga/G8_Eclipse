package parser;

// $ANTLR 3.5.1 D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g 2019-06-26 16:12:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import start.G8;

@SuppressWarnings("all")
public class G8Parser extends Parser {
	
	String Titolo;
	String Name="No Name";
	float DrawspaceWidth;
	float DrawspaceHeigth;
	ArrayList<String> names = new ArrayList<String>();
	
	public class SameNameError extends Exception {

		 SameNameError()
		  {
		    super("Attention, you have inserted the same name for more than one figure");
		  }
	}
	
	public class ShapeLayoutError extends Exception {

		ShapeLayoutError()
		  {
		    super("Attention, coordinates of a figure are incorrect");
		  }
	}
	
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "FLOAT", "RGB", "ROTATION", 
		"TEXT", "WS", "'CIRC:'", "'COLOR'", "'COLORBODY'", "'CURV:'", "'DRAWSPACE HEIGTH'", 
		"'DRAWSPACE WIDTH'", "'ELLIPS:'", "'END'", "'ENDANGLE'", "'LINE:'", "'NAME'", 
		"'RADIUS'", "'RECT:'", "'ROTATION'", "'SEMAX'", "'SEMIN'", "'STARTANGLE'", 
		"'TITLE'", "'TRIANGLE:'", "'WIDTH'", "'XA'", "'XB'", "'XC'", "'XCENTER'", 
		"'XEND'", "'XMIDDLE'", "'XSTART'", "'YA'", "'YB'", "'YC'", "'YCENTER'", 
		"'YEND'", "'YMIDDLE'", "'YSTART'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public G8Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public G8Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return G8Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g"; }



	// $ANTLR start "begin"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:3:1: begin : 'TITLE' b1= TEXT 'DRAWSPACE WIDTH' b2= FLOAT 'DRAWSPACE HEIGTH' b3= FLOAT ( list )* end ;
	public final void begin() throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
		Token b1=null;
		Token b2=null;
		Token b3=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:3:7: ( 'TITLE' b1= TEXT 'DRAWSPACE WIDTH' b2= FLOAT 'DRAWSPACE HEIGTH' b3= FLOAT ( list )* end )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:3:9: 'TITLE' b1= TEXT 'DRAWSPACE WIDTH' b2= FLOAT 'DRAWSPACE HEIGTH' b3= FLOAT ( list )* end
			{
			match(input,27,FOLLOW_27_in_begin10); 
			b1=(Token)match(input,TEXT,FOLLOW_TEXT_in_begin14); 
			Titolo=(b1!=null?b1.getText():null);
			match(input,15,FOLLOW_15_in_begin18); 
			b2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_begin22); 
			DrawspaceWidth=Float.valueOf((b2!=null?b2.getText():null));
			match(input,14,FOLLOW_14_in_begin26); 
			b3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_begin30); 
			DrawspaceHeigth=Float.valueOf((b3!=null?b3.getText():null));
			
			G8.writeFile("<!doctype html>");
			G8.writeFile("<html>");
			G8.writeFile("<head>");
			G8.writeFile("<title> " + Titolo + " </title>");
			G8.writeFile("<style> canvas {border: 1px #000 dotted;} </style>");
			G8.writeFile("<script>");
			G8.writeFile("window.onload = function () {\n");
			G8.writeFile("	var canvas = document.getElementById('" + Titolo + "');");
			G8.writeFile("	var context = canvas.getContext('2d'); \n");
			
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:3:154: ( list )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==10||LA1_0==13||LA1_0==16||LA1_0==19||LA1_0==22||LA1_0==28) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:3:155: list
					{
					pushFollow(FOLLOW_list_in_begin35);
					list();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_end_in_begin39);
			end();
			state._fsp--;
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "begin"



	// $ANTLR start "list"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:16:1: list : ( line | triangle | rectangle | curve | circle | ellipse );
	public final void list() throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:16:6: ( line | triangle | rectangle | curve | circle | ellipse )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt2=1;
				}
				break;
			case 28:
				{
				alt2=2;
				}
				break;
			case 22:
				{
				alt2=3;
				}
				break;
			case 13:
				{
				alt2=4;
				}
				break;
			case 10:
				{
				alt2=5;
				}
				break;
			case 16:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:16:8: line
					{
					pushFollow(FOLLOW_line_in_list59);
					line();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:16:16: triangle
					{
					pushFollow(FOLLOW_triangle_in_list64);
					triangle();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:16:28: rectangle
					{
					pushFollow(FOLLOW_rectangle_in_list69);
					rectangle();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:16:41: curve
					{
					pushFollow(FOLLOW_curve_in_list74);
					curve();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:16:50: circle
					{
					pushFollow(FOLLOW_circle_in_list79);
					circle();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:16:60: ellipse
					{
					pushFollow(FOLLOW_ellipse_in_list84);
					ellipse();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "list"



	// $ANTLR start "line"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:19:1: line : 'LINE:' ( 'NAME' n= TEXT )? 'XSTART' l1= FLOAT 'YSTART' l2= FLOAT 'XEND' l3= FLOAT 'YEND' l4= FLOAT ( 'COLOR' l5= RGB )? ( 'WIDTH' l6= FLOAT )? ;
	public final void line() throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
		Token n=null;
		Token l1=null;
		Token l2=null;
		Token l3=null;
		Token l4=null;
		Token l5=null;
		Token l6=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:19:7: ( 'LINE:' ( 'NAME' n= TEXT )? 'XSTART' l1= FLOAT 'YSTART' l2= FLOAT 'XEND' l3= FLOAT 'YEND' l4= FLOAT ( 'COLOR' l5= RGB )? ( 'WIDTH' l6= FLOAT )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:19:9: 'LINE:' ( 'NAME' n= TEXT )? 'XSTART' l1= FLOAT 'YSTART' l2= FLOAT 'XEND' l3= FLOAT 'YEND' l4= FLOAT ( 'COLOR' l5= RGB )? ( 'WIDTH' l6= FLOAT )?
			{
			match(input,19,FOLLOW_19_in_line95); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:19:17: ( 'NAME' n= TEXT )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==20) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:19:18: 'NAME' n= TEXT
					{
					match(input,20,FOLLOW_20_in_line98); 
					n=(Token)match(input,TEXT,FOLLOW_TEXT_in_line102); 
					Name=(n!=null?n.getText():null);
					}
					break;

			}

			match(input,36,FOLLOW_36_in_line108); 
			l1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line112); 
			float xstart=Float.valueOf((l1!=null?l1.getText():null));
			match(input,43,FOLLOW_43_in_line116); 
			l2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line120); 
			float ystart=Float.valueOf((l2!=null?l2.getText():null));
			match(input,34,FOLLOW_34_in_line124); 
			l3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line128); 
			float xend=Float.valueOf((l3!=null?l3.getText():null));
			match(input,41,FOLLOW_41_in_line132); 
			l4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line136); 
			float yend=Float.valueOf((l4!=null?l4.getText():null));
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:19:214: ( 'COLOR' l5= RGB )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==11) ) {
				alt4=1;
			}
			
			String color = null;
			switch (alt4) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:19:215: 'COLOR' l5= RGB
					{
					match(input,11,FOLLOW_11_in_line141); 
					l5=(Token)match(input,RGB,FOLLOW_RGB_in_line145); 
					color=(l5!=null?l5.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:19:257: ( 'WIDTH' l6= FLOAT )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==29) ) {
				alt5=1;
			}
			
			float width = 0;
			
			switch (alt5) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:19:258: 'WIDTH' l6= FLOAT
					{
					match(input,29,FOLLOW_29_in_line152); 
					l6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line156); 
					width=Float.valueOf((l6!=null?l6.getText():null));
					}
					break;

			}
			
			if (color==null) {
				color = "#000000";
				}
			if (Name==null || Name=="No Name") {
					Name="No name";
				}else {
					if(names.contains(Name)) {
						throw new SameNameError();
					}else {
						names.add(Name);
					}
				}
				
			if (xstart==xend && ystart==yend) {
				throw new ShapeLayoutError();
			}
			
				G8.writeFile("	//" + Name);
				G8.writeFile("	context.beginPath();");
				G8.writeFile("	context.lineWidth = " + width + ";");
				G8.writeFile("	context.strokeStyle = '" + color + "';");
				G8.writeFile("	context.moveTo( " + xstart + ", " + ystart + ");");
				G8.writeFile("	context.lineTo( " + xend + ", " + yend + ");");
				G8.writeFile("	context.stroke();");
				G8.writeFile("	context.closePath();\n");
				Name="No Name";
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "line"



	// $ANTLR start "triangle"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:1: triangle : 'TRIANGLE:' ( 'NAME' n= TEXT )? 'XA' t1= FLOAT 'YA' t2= FLOAT 'XB' t3= FLOAT 'YB' t4= FLOAT 'XC' t5= FLOAT 'YC' t6= FLOAT ( 'COLOR' t7= RGB )? ( 'WIDTH' t8= FLOAT )? ( 'COLORBODY' t9= RGB )? ;
	public final void triangle() throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
		Token n=null;
		Token t1=null;
		Token t2=null;
		Token t3=null;
		Token t4=null;
		Token t5=null;
		Token t6=null;
		Token t7=null;
		Token t8=null;
		Token t9=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:11: ( 'TRIANGLE:' ( 'NAME' n= TEXT )? 'XA' t1= FLOAT 'YA' t2= FLOAT 'XB' t3= FLOAT 'YB' t4= FLOAT 'XC' t5= FLOAT 'YC' t6= FLOAT ( 'COLOR' t7= RGB )? ( 'WIDTH' t8= FLOAT )? ( 'COLORBODY' t9= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:13: 'TRIANGLE:' ( 'NAME' n= TEXT )? 'XA' t1= FLOAT 'YA' t2= FLOAT 'XB' t3= FLOAT 'YB' t4= FLOAT 'XC' t5= FLOAT 'YC' t6= FLOAT ( 'COLOR' t7= RGB )? ( 'WIDTH' t8= FLOAT )? ( 'COLORBODY' t9= RGB )?
			{
			match(input,28,FOLLOW_28_in_triangle176); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:25: ( 'NAME' n= TEXT )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==20) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:26: 'NAME' n= TEXT
					{
					match(input,20,FOLLOW_20_in_triangle179); 
					n=(Token)match(input,TEXT,FOLLOW_TEXT_in_triangle183); 
					Name=(n!=null?n.getText():null);
					}
					break;

			}

			match(input,30,FOLLOW_30_in_triangle189); 
			t1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle193); 
			float xa=Float.valueOf((t1!=null?t1.getText():null));
			match(input,37,FOLLOW_37_in_triangle197); 
			t2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle201); 
			float ya=Float.valueOf((t2!=null?t2.getText():null));
			match(input,31,FOLLOW_31_in_triangle205); 
			t3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle209); 
			float xb=Float.valueOf((t3!=null?t3.getText():null));
			match(input,38,FOLLOW_38_in_triangle213); 
			t4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle217); 
			float yb=Float.valueOf((t4!=null?t4.getText():null));
			match(input,32,FOLLOW_32_in_triangle221); 
			t5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle225); 
			float xc=Float.valueOf((t5!=null?t5.getText():null));
			match(input,39,FOLLOW_39_in_triangle229); 
			t6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle233); 
			float yc=Float.valueOf((t6!=null?t6.getText():null));
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:268: ( 'COLOR' t7= RGB )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==11) ) {
				alt7=1;
			}
			
			String color = null;
			switch (alt7) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:269: 'COLOR' t7= RGB
					{
					match(input,11,FOLLOW_11_in_triangle238); 
					t7=(Token)match(input,RGB,FOLLOW_RGB_in_triangle242); 
					color=(t7!=null?t7.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:311: ( 'WIDTH' t8= FLOAT )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==29) ) {
				alt8=1;
			}
			
			float width = 0;
			switch (alt8) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:312: 'WIDTH' t8= FLOAT
					{
					match(input,29,FOLLOW_29_in_triangle249); 
					t8=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle253); 
					width=Float.valueOf((t8!=null?t8.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:355: ( 'COLORBODY' t9= RGB )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==12) ) {
				alt9=1;
			}
			
			String colorbody = null;
			switch (alt9) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:31:356: 'COLORBODY' t9= RGB
					{
					match(input,12,FOLLOW_12_in_triangle260); 
					t9=(Token)match(input,RGB,FOLLOW_RGB_in_triangle264); 
					colorbody=(t9!=null?t9.getText():null);
					}
					break;

			}
				if (color==null) {
				color = "#000000";
				}
				if (Name==null || Name=="No Name") {
					Name="No name";
				}else {
					if(names.contains(Name)) {
						throw new SameNameError();
					}else {
						names.add(Name);
					}
				}
				
				if ((xa==xb && ya==yb)||(xb==xc && yb==yc)||(xa==xc && ya==yc)||(xa==xb && xb==xc)||(ya==yb && yb==yc)) {
						throw new ShapeLayoutError();
				}
				
				G8.writeFile("	//" + Name);
				G8.writeFile("	context.beginPath();");
				G8.writeFile("	context.lineWidth = " + width + ";");
				G8.writeFile("	context.strokeStyle = '" + color + "';");
				G8.writeFile("	context.moveTo(" + xa + ", " + ya + ");");
				G8.writeFile("	context.lineTo(" + xb + ", " + yb + ");");
				G8.writeFile("	context.lineTo(" + xc + ", " + yc + ");");
				G8.writeFile("	context.lineTo(" + xa + ", " + ya + ");");
				G8.writeFile("	context.stroke();");
				if (colorbody!=null) {
					G8.writeFile("	context.fillStyle= '" + colorbody + "';");
					G8.writeFile("	context.fill();");
					}
				G8.writeFile("	context.closePath();\n");
				Name="No Name";
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "triangle"



	// $ANTLR start "rectangle"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:1: rectangle : 'RECT:' ( 'NAME' n= TEXT )? 'XSTART' r1= FLOAT 'YSTART' r2= FLOAT 'XEND' r3= FLOAT 'YEND' r4= FLOAT ( 'COLOR' r5= RGB )? ( 'WIDTH' r6= FLOAT )? ( 'COLORBODY' r7= RGB )? ;
	public final void rectangle() throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
		Token n=null;
		Token r1=null;
		Token r2=null;
		Token r3=null;
		Token r4=null;
		Token r5=null;
		Token r6=null;
		Token r7=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:12: ( 'RECT:' ( 'NAME' n= TEXT )? 'XSTART' r1= FLOAT 'YSTART' r2= FLOAT 'XEND' r3= FLOAT 'YEND' r4= FLOAT ( 'COLOR' r5= RGB )? ( 'WIDTH' r6= FLOAT )? ( 'COLORBODY' r7= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:14: 'RECT:' ( 'NAME' n= TEXT )? 'XSTART' r1= FLOAT 'YSTART' r2= FLOAT 'XEND' r3= FLOAT 'YEND' r4= FLOAT ( 'COLOR' r5= RGB )? ( 'WIDTH' r6= FLOAT )? ( 'COLORBODY' r7= RGB )?
			{
			match(input,22,FOLLOW_22_in_rectangle284); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:22: ( 'NAME' n= TEXT )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==20) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:23: 'NAME' n= TEXT
					{
					match(input,20,FOLLOW_20_in_rectangle287); 
					n=(Token)match(input,TEXT,FOLLOW_TEXT_in_rectangle291); 
					Name=(n!=null?n.getText():null);
					}
					break;

			}

			match(input,36,FOLLOW_36_in_rectangle297); 
			r1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle301); 
			float xstart=Float.valueOf((r1!=null?r1.getText():null));
			match(input,43,FOLLOW_43_in_rectangle305); 
			r2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle309); 
			float ystart=Float.valueOf((r2!=null?r2.getText():null));
			match(input,34,FOLLOW_34_in_rectangle313); 
			r3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle317); 
			float xend=Float.valueOf((r3!=null?r3.getText():null));
			match(input,41,FOLLOW_41_in_rectangle321); 
			r4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle325); 
			float yend=Float.valueOf((r4!=null?r4.getText():null));
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:219: ( 'COLOR' r5= RGB )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==11) ) {
				alt11=1;
			}
			
			String color = null;
			switch (alt11) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:220: 'COLOR' r5= RGB
					{
					match(input,11,FOLLOW_11_in_rectangle330); 
					r5=(Token)match(input,RGB,FOLLOW_RGB_in_rectangle334); 
					color=(r5!=null?r5.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:262: ( 'WIDTH' r6= FLOAT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==29) ) {
				alt12=1;
			}
			
			float width = 0;
			switch (alt12) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:263: 'WIDTH' r6= FLOAT
					{
					match(input,29,FOLLOW_29_in_rectangle341); 
					r6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle345); 
					width=Float.valueOf((r6!=null?r6.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:306: ( 'COLORBODY' r7= RGB )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==12) ) {
				alt13=1;
			}
			
			String colorbody = null;
			switch (alt13) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:46:307: 'COLORBODY' r7= RGB
					{
					match(input,12,FOLLOW_12_in_rectangle352); 
					r7=(Token)match(input,RGB,FOLLOW_RGB_in_rectangle356); 
					colorbody=(r7!=null?r7.getText():null);
					}
					break;

			}
				if (color==null) {
				color = "#000000";
				}
				float heigth=yend-ystart;
				float breadth=xend-xstart;
				if (Name==null || Name=="No Name") {
					Name="No name";
				}else {
					if(names.contains(Name)) {
						throw new SameNameError();
					}else {
						names.add(Name);
					}
				}
				
				if ((heigth==0)||(breadth==0)) {
					throw new ShapeLayoutError();
				}
				
				G8.writeFile("	//" + Name);
				G8.writeFile("	context.beginPath();");
				G8.writeFile("	context.lineWidth = " + width + ";");
				G8.writeFile("	context.strokeStyle = '" + color + "';");
				G8.writeFile("	context.rect( " + xstart + ", " + ystart + ", " + heigth + ", " + breadth + ");");
				G8.writeFile("	context.stroke();");
				if (colorbody!=null) {
					G8.writeFile("	context.fillStyle= '" + colorbody + "';");
					G8.writeFile("	context.fill();");
					}
				G8.writeFile("	context.closePath();\n");
				Name="No Name";
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "rectangle"



	// $ANTLR start "curve"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:1: curve : 'CURV:' ( 'NAME' n= TEXT )? 'XSTART' cu1= FLOAT 'YSTART' cu2= FLOAT 'XMIDDLE' cu3= FLOAT 'YMIDDLE' cu4= FLOAT 'XEND' cu5= FLOAT 'YEND' cu6= FLOAT ( 'COLOR' cu7= RGB )? ( 'WIDTH' cu8= FLOAT )? ( 'COLORBODY' cu9= RGB )? ;
	public final void curve() throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
		Token n=null;
		Token cu1=null;
		Token cu2=null;
		Token cu3=null;
		Token cu4=null;
		Token cu5=null;
		Token cu6=null;
		Token cu7=null;
		Token cu8=null;
		Token cu9=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:8: ( 'CURV:' ( 'NAME' n= TEXT )? 'XSTART' cu1= FLOAT 'YSTART' cu2= FLOAT 'XMIDDLE' cu3= FLOAT 'YMIDDLE' cu4= FLOAT 'XEND' cu5= FLOAT 'YEND' cu6= FLOAT ( 'COLOR' cu7= RGB )? ( 'WIDTH' cu8= FLOAT )? ( 'COLORBODY' cu9= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:10: 'CURV:' ( 'NAME' n= TEXT )? 'XSTART' cu1= FLOAT 'YSTART' cu2= FLOAT 'XMIDDLE' cu3= FLOAT 'YMIDDLE' cu4= FLOAT 'XEND' cu5= FLOAT 'YEND' cu6= FLOAT ( 'COLOR' cu7= RGB )? ( 'WIDTH' cu8= FLOAT )? ( 'COLORBODY' cu9= RGB )?
			{
			match(input,13,FOLLOW_13_in_curve376); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:18: ( 'NAME' n= TEXT )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==20) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:19: 'NAME' n= TEXT
					{
					match(input,20,FOLLOW_20_in_curve379); 
					n=(Token)match(input,TEXT,FOLLOW_TEXT_in_curve383); 
					Name=(n!=null?n.getText():null);
					}
					break;

			}

			match(input,36,FOLLOW_36_in_curve389); 
			cu1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve393); 
			float xstart=Float.valueOf((cu1!=null?cu1.getText():null));
			match(input,43,FOLLOW_43_in_curve397); 
			cu2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve401); 
			float ystart=Float.valueOf((cu2!=null?cu2.getText():null));
			match(input,35,FOLLOW_35_in_curve405); 
			cu3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve409); 
			float xmiddle=Float.valueOf((cu3!=null?cu3.getText():null));
			match(input,42,FOLLOW_42_in_curve413); 
			cu4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve417); 
			float ymiddle=Float.valueOf((cu4!=null?cu4.getText():null));
			match(input,34,FOLLOW_34_in_curve421); 
			cu5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve425); 
			float xend=Float.valueOf((cu5!=null?cu5.getText():null));
			match(input,41,FOLLOW_41_in_curve429); 
			cu6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve433); 
			float yend=Float.valueOf((cu6!=null?cu6.getText():null));
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:317: ( 'COLOR' cu7= RGB )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==11) ) {
				alt15=1;
			}
			
			String color = null;
			switch (alt15) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:318: 'COLOR' cu7= RGB
					{
					match(input,11,FOLLOW_11_in_curve438); 
					cu7=(Token)match(input,RGB,FOLLOW_RGB_in_curve442); 
					color=(cu7!=null?cu7.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:362: ( 'WIDTH' cu8= FLOAT )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==29) ) {
				alt16=1;
			}
			
			float width = 0;
			switch (alt16) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:363: 'WIDTH' cu8= FLOAT
					{
					match(input,29,FOLLOW_29_in_curve449); 
					cu8=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve453); 
					width=Float.valueOf((cu8!=null?cu8.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:408: ( 'COLORBODY' cu9= RGB )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==12) ) {
				alt17=1;
			}
			
			String colorbody = null;
			switch (alt17) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:61:409: 'COLORBODY' cu9= RGB
					{
					match(input,12,FOLLOW_12_in_curve460); 
					cu9=(Token)match(input,RGB,FOLLOW_RGB_in_curve464); 
					colorbody=(cu9!=null?cu9.getText():null);
					}
					break;

			}
				if (color==null) {
				color = "#000000";
				}
				if (Name==null || Name=="No Name") {
					Name="No name";
				}else {
					if(names.contains(Name)) {
						throw new SameNameError();
					}else {
						names.add(Name);
					}
				}
				
				if (xstart==xend && ystart==yend) {
					throw new ShapeLayoutError();
				}
				
				G8.writeFile("	//" + Name);
				G8.writeFile("	context.beginPath();");
				G8.writeFile("	context.lineWidth = " + width + ";");
				G8.writeFile("	context.strokeStyle = '" + color + "';");
				G8.writeFile("	context.moveTo( " + xstart + ", " + ystart + ");");
				G8.writeFile("	context.quadraticCurveTo( " + xmiddle + ", " + ymiddle + ", " + xend + ", " + yend + ");");
				G8.writeFile("	context.stroke();");
				if (colorbody!=null) {
					G8.writeFile("	context.fillStyle= '" + colorbody + "';");
					G8.writeFile("	context.fill();");
					}
				G8.writeFile("	context.closePath();\n");
				Name="No Name";
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "curve"



	// $ANTLR start "circle"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:1: circle : 'CIRC:' ( 'NAME' n= TEXT )? 'XCENTER' ci1= FLOAT 'YCENTER' ci2= FLOAT 'RADIUS' ci3= FLOAT ( 'STARTANGLE' ci4= FLOAT )? ( 'ENDANGLE' ci5= FLOAT )? ( 'COLOR' ci6= RGB )? ( 'WIDTH' ci7= FLOAT )? ( 'COLORBODY' ci8= RGB )? ;
	public final void circle() throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
		Token n=null;
		Token ci1=null;
		Token ci2=null;
		Token ci3=null;
		Token ci4=null;
		Token ci5=null;
		Token ci6=null;
		Token ci7=null;
		Token ci8=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:9: ( 'CIRC:' ( 'NAME' n= TEXT )? 'XCENTER' ci1= FLOAT 'YCENTER' ci2= FLOAT 'RADIUS' ci3= FLOAT ( 'STARTANGLE' ci4= FLOAT )? ( 'ENDANGLE' ci5= FLOAT )? ( 'COLOR' ci6= RGB )? ( 'WIDTH' ci7= FLOAT )? ( 'COLORBODY' ci8= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:11: 'CIRC:' ( 'NAME' n= TEXT )? 'XCENTER' ci1= FLOAT 'YCENTER' ci2= FLOAT 'RADIUS' ci3= FLOAT ( 'STARTANGLE' ci4= FLOAT )? ( 'ENDANGLE' ci5= FLOAT )? ( 'COLOR' ci6= RGB )? ( 'WIDTH' ci7= FLOAT )? ( 'COLORBODY' ci8= RGB )?
			{
			match(input,10,FOLLOW_10_in_circle483); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:19: ( 'NAME' n= TEXT )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==20) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:20: 'NAME' n= TEXT
					{
					match(input,20,FOLLOW_20_in_circle486); 
					n=(Token)match(input,TEXT,FOLLOW_TEXT_in_circle490); 
					Name=(n!=null?n.getText():null);
					}
					break;

			}

			match(input,33,FOLLOW_33_in_circle496); 
			ci1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle500); 
			float xcenter=Float.valueOf((ci1!=null?ci1.getText():null));
			match(input,40,FOLLOW_40_in_circle504); 
			ci2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle508); 
			float ycenter=Float.valueOf((ci2!=null?ci2.getText():null));
			match(input,21,FOLLOW_21_in_circle512); 
			ci3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle516); 
			float radius=Float.valueOf((ci3!=null?ci3.getText():null));
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:191: ( 'STARTANGLE' ci4= FLOAT )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==26) ) {
				alt19=1;
			}
			
			float startangle = 0;
			switch (alt19) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:192: 'STARTANGLE' ci4= FLOAT
					{
					match(input,26,FOLLOW_26_in_circle521); 
					ci4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle525); 
					startangle=Float.valueOf((ci4!=null?ci4.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:247: ( 'ENDANGLE' ci5= FLOAT )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==18) ) {
				alt20=1;
			}
			
			float endangle = 0;
			switch (alt20) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:248: 'ENDANGLE' ci5= FLOAT
					{
					match(input,18,FOLLOW_18_in_circle532); 
					ci5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle536); 
					endangle=Float.valueOf((ci5!=null?ci5.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:299: ( 'COLOR' ci6= RGB )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==11) ) {
				alt21=1;
			}
			
			String color = null;
			switch (alt21) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:300: 'COLOR' ci6= RGB
					{
					match(input,11,FOLLOW_11_in_circle543); 
					ci6=(Token)match(input,RGB,FOLLOW_RGB_in_circle547); 
					color=(ci6!=null?ci6.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:344: ( 'WIDTH' ci7= FLOAT )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==29) ) {
				alt22=1;
			}
			
			float width = 0;
			switch (alt22) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:345: 'WIDTH' ci7= FLOAT
					{
					match(input,29,FOLLOW_29_in_circle554); 
					ci7=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle558); 
					width=Float.valueOf((ci7!=null?ci7.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:390: ( 'COLORBODY' ci8= RGB )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==12) ) {
				alt23=1;
			}
			
			String colorbody = null;
			switch (alt23) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:75:391: 'COLORBODY' ci8= RGB
					{
					match(input,12,FOLLOW_12_in_circle565); 
					ci8=(Token)match(input,RGB,FOLLOW_RGB_in_circle569); 
					colorbody=(ci8!=null?ci8.getText():null);
					}
					break;

			}
				if (color==null) {
				color = "#000000";
				}
				if(endangle==0) {
					endangle = 360;
				}
				if (Name==null || Name=="No Name" || Name=="No Name") {
					Name="No name";
				}else {
					if(names.contains(Name)) {
						throw new SameNameError();
					}else {
						names.add(Name);
					}
				}
				
				if (startangle==endangle) {
					throw new ShapeLayoutError();
				}
				
				G8.writeFile("	//" + Name);
				G8.writeFile("	context.beginPath();");
				G8.writeFile("	var centerX = " + xcenter + ";");
				G8.writeFile("	var centerY = " + ycenter + ";");
				G8.writeFile("	var radius = " + radius + ";");
				G8.writeFile("	var startAngle = " + startangle + "* Math.PI/180;");
				G8.writeFile("	var endAngle = " + endangle + "* Math.PI/180;");
				G8.writeFile("	context.arc (centerX, centerY, radius, startAngle, endAngle);");
				G8.writeFile("	context.lineWidth = " + width + ";");
				G8.writeFile("	context.strokeStyle = '" + color + "';");
				G8.writeFile("	context.stroke();");
				if (colorbody!=null) {
					G8.writeFile("	context.fillStyle= '" + colorbody + "';");
					G8.writeFile("	context.fill();");
					}
				G8.writeFile("	context.closePath();\n");
				Name="No Name";
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "circle"



	// $ANTLR start "ellipse"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:1: ellipse : 'ELLIPS:' ( 'NAME' n= TEXT )? 'XCENTER' e1= FLOAT 'YCENTER' e2= FLOAT 'SEMIN' e3= FLOAT 'SEMAX' e4= FLOAT ( 'STARTANGLE' e5= FLOAT )? ( 'ENDANGLE' e6= FLOAT )? ( 'ROTATION' e7= ROTATION )? ( 'COLOR' e8= RGB )? ( 'WIDTH' e9= FLOAT )? ( 'COLORBODY' e10= RGB )? ;
	public final void ellipse() throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
		Token n=null;
		Token e1=null;
		Token e2=null;
		Token e3=null;
		Token e4=null;
		Token e5=null;
		Token e6=null;
		Token e7=null;
		Token e8=null;
		Token e9=null;
		Token e10=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:10: ( 'ELLIPS:' ( 'NAME' n= TEXT )? 'XCENTER' e1= FLOAT 'YCENTER' e2= FLOAT 'SEMIN' e3= FLOAT 'SEMAX' e4= FLOAT ( 'STARTANGLE' e5= FLOAT )? ( 'ENDANGLE' e6= FLOAT )? ( 'ROTATION' e7= ROTATION )? ( 'COLOR' e8= RGB )? ( 'WIDTH' e9= FLOAT )? ( 'COLORBODY' e10= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:12: 'ELLIPS:' ( 'NAME' n= TEXT )? 'XCENTER' e1= FLOAT 'YCENTER' e2= FLOAT 'SEMIN' e3= FLOAT 'SEMAX' e4= FLOAT ( 'STARTANGLE' e5= FLOAT )? ( 'ENDANGLE' e6= FLOAT )? ( 'ROTATION' e7= ROTATION )? ( 'COLOR' e8= RGB )? ( 'WIDTH' e9= FLOAT )? ( 'COLORBODY' e10= RGB )?
			{
			match(input,16,FOLLOW_16_in_ellipse588); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:22: ( 'NAME' n= TEXT )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==20) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:23: 'NAME' n= TEXT
					{
					match(input,20,FOLLOW_20_in_ellipse591); 
					n=(Token)match(input,TEXT,FOLLOW_TEXT_in_ellipse595); 
					Name=(n!=null?n.getText():null);
					}
					break;

			}

			match(input,33,FOLLOW_33_in_ellipse601); 
			e1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse605); 
			float xcenter=Float.valueOf((e1!=null?e1.getText():null));
			match(input,40,FOLLOW_40_in_ellipse609); 
			e2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse613); 
			float ycenter=Float.valueOf((e2!=null?e2.getText():null));
			match(input,25,FOLLOW_25_in_ellipse617); 
			e3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse621); 
			float semin=Float.valueOf((e3!=null?e3.getText():null));
			match(input,24,FOLLOW_24_in_ellipse625); 
			e4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse629); 
			float semax=Float.valueOf((e4!=null?e4.getText():null));
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:227: ( 'STARTANGLE' e5= FLOAT )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==26) ) {
				alt25=1;
			}
			
			float startangle = 0;
			switch (alt25) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:228: 'STARTANGLE' e5= FLOAT
					{
					match(input,26,FOLLOW_26_in_ellipse634); 
					e5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse638); 
					startangle=Float.valueOf((e5!=null?e5.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:281: ( 'ENDANGLE' e6= FLOAT )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==18) ) {
				alt26=1;
			}
			
			float endangle = 0;
			switch (alt26) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:282: 'ENDANGLE' e6= FLOAT
					{
					match(input,18,FOLLOW_18_in_ellipse645); 
					e6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse649); 
					endangle=Float.valueOf((e6!=null?e6.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:331: ( 'ROTATION' e7= ROTATION )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==23) ) {
				alt27=1;
			}
			
			float rotation = 0;
			switch (alt27) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:332: 'ROTATION' e7= ROTATION
					{
					match(input,23,FOLLOW_23_in_ellipse656); 
					e7=(Token)match(input,ROTATION,FOLLOW_ROTATION_in_ellipse660); 
					rotation=Float.valueOf((e7!=null?e7.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:384: ( 'COLOR' e8= RGB )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==11) ) {
				alt28=1;
			}
			
			String color = null;
			switch (alt28) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:385: 'COLOR' e8= RGB
					{
					match(input,11,FOLLOW_11_in_ellipse667); 
					e8=(Token)match(input,RGB,FOLLOW_RGB_in_ellipse671); 
					color=(e8!=null?e8.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:427: ( 'WIDTH' e9= FLOAT )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==29) ) {
				alt29=1;
			}
			
			float width = 0;
			switch (alt29) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:428: 'WIDTH' e9= FLOAT
					{
					match(input,29,FOLLOW_29_in_ellipse678); 
					e9=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse682); 
					width=Float.valueOf((e9!=null?e9.getText():null));
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:471: ( 'COLORBODY' e10= RGB )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==12) ) {
				alt30=1;
			}
			
			String colorbody = null;
			switch (alt30) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:93:472: 'COLORBODY' e10= RGB
					{
					match(input,12,FOLLOW_12_in_ellipse689); 
					e10=(Token)match(input,RGB,FOLLOW_RGB_in_ellipse693); 
					colorbody=(e10!=null?e10.getText():null);
					}
					break;

			}
				if (color==null) {
				color = "#000000";
				}
				if(endangle==0) {
					endangle = 360;
				}
				
				if (Name==null || Name=="No Name") {
					Name="No name";
				}else {
					if(names.contains(Name)) {
						throw new SameNameError();
					}else {
						names.add(Name);
					}
				}
				
				if ((semax==0)||(semin==0)||(startangle==endangle)) {
					throw new ShapeLayoutError();
				}
				
				G8.writeFile("	//" + Name);
				G8.writeFile("	context.beginPath();");
				G8.writeFile("	var centerX = " + xcenter + ";");
				G8.writeFile("	var centerY = " + ycenter + ";");
				G8.writeFile("	var radiusMax = " + semax + ";");
				G8.writeFile("	var radiusMin= " + semin + ";");
				G8.writeFile("	var rotation= " + rotation + "*Math.PI/180;");
				G8.writeFile("	var startAngle=" + startangle +"*Math.PI/180;");
				G8.writeFile("	var endAngle=" + endangle + "*Math.PI/180;");
				G8.writeFile("	context.ellipse(centerX, centerY, radiusMax, radiusMin, rotation, startAngle, endAngle);");
				G8.writeFile("	context.lineWidth = " + width + ";");
				G8.writeFile("	context.strokeStyle = '" + color + "';");
				G8.writeFile("	context.stroke();");
				if (colorbody!=null) {
					G8.writeFile("	context.fillStyle= '" + colorbody + "';");
					G8.writeFile("	context.fill();");
					}
				G8.writeFile("	context.closePath();\n");
				Name="No Name";
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ellipse"



	// $ANTLR start "end"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:113:1: end : 'END' ;
	public final void end() throws RecognitionException, IOException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:113:5: ( 'END' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8new.g:113:7: 'END'
			{
			match(input,17,FOLLOW_17_in_end712); 
			if (Name==null || Name=="No Name") {
				Name="No name";
			}
			G8.writeFile("}");
			G8.writeFile("</script>");
			G8.writeFile("</head>");
			G8.writeFile("<body>");
			G8.writeFile("<canvas id='" + Titolo + "' width='" + DrawspaceWidth + "' height='" + DrawspaceHeigth + "'></canvas>");
			G8.writeFile("</body>");
			G8.writeFile("</html>");
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "end"

	// Delegated rules



	public static final BitSet FOLLOW_27_in_begin10 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TEXT_in_begin14 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_begin18 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_begin22 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_begin26 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_begin30 = new BitSet(new long[]{0x00000000104B2400L});
	public static final BitSet FOLLOW_list_in_begin35 = new BitSet(new long[]{0x00000000104B2400L});
	public static final BitSet FOLLOW_end_in_begin39 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_list59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triangle_in_list64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rectangle_in_list69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_curve_in_list74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_circle_in_list79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ellipse_in_list84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_line95 = new BitSet(new long[]{0x0000001000100000L});
	public static final BitSet FOLLOW_20_in_line98 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TEXT_in_line102 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_line108 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line112 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_line116 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line120 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_line124 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line128 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_line132 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line136 = new BitSet(new long[]{0x0000000020000802L});
	public static final BitSet FOLLOW_11_in_line141 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_line145 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_line152 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_triangle176 = new BitSet(new long[]{0x0000000040100000L});
	public static final BitSet FOLLOW_20_in_triangle179 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TEXT_in_triangle183 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_triangle189 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle193 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_triangle197 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle201 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_triangle205 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle209 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_triangle213 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle217 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_triangle221 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle225 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_triangle229 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle233 = new BitSet(new long[]{0x0000000020001802L});
	public static final BitSet FOLLOW_11_in_triangle238 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_triangle242 = new BitSet(new long[]{0x0000000020001002L});
	public static final BitSet FOLLOW_29_in_triangle249 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle253 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_triangle260 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_triangle264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_rectangle284 = new BitSet(new long[]{0x0000001000100000L});
	public static final BitSet FOLLOW_20_in_rectangle287 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TEXT_in_rectangle291 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_rectangle297 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle301 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_rectangle305 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle309 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_rectangle313 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle317 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_rectangle321 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle325 = new BitSet(new long[]{0x0000000020001802L});
	public static final BitSet FOLLOW_11_in_rectangle330 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_rectangle334 = new BitSet(new long[]{0x0000000020001002L});
	public static final BitSet FOLLOW_29_in_rectangle341 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle345 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_rectangle352 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_rectangle356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_curve376 = new BitSet(new long[]{0x0000001000100000L});
	public static final BitSet FOLLOW_20_in_curve379 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TEXT_in_curve383 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_curve389 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve393 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_curve397 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve401 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_curve405 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve409 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_curve413 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve417 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_curve421 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve425 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_curve429 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve433 = new BitSet(new long[]{0x0000000020001802L});
	public static final BitSet FOLLOW_11_in_curve438 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_curve442 = new BitSet(new long[]{0x0000000020001002L});
	public static final BitSet FOLLOW_29_in_curve449 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve453 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_curve460 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_curve464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_circle483 = new BitSet(new long[]{0x0000000200100000L});
	public static final BitSet FOLLOW_20_in_circle486 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TEXT_in_circle490 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_circle496 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle500 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_circle504 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle508 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_circle512 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle516 = new BitSet(new long[]{0x0000000024041802L});
	public static final BitSet FOLLOW_26_in_circle521 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle525 = new BitSet(new long[]{0x0000000020041802L});
	public static final BitSet FOLLOW_18_in_circle532 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle536 = new BitSet(new long[]{0x0000000020001802L});
	public static final BitSet FOLLOW_11_in_circle543 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_circle547 = new BitSet(new long[]{0x0000000020001002L});
	public static final BitSet FOLLOW_29_in_circle554 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle558 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_circle565 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_circle569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ellipse588 = new BitSet(new long[]{0x0000000200100000L});
	public static final BitSet FOLLOW_20_in_ellipse591 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TEXT_in_ellipse595 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_ellipse601 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse605 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_ellipse609 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse613 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ellipse617 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse621 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ellipse625 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse629 = new BitSet(new long[]{0x0000000024841802L});
	public static final BitSet FOLLOW_26_in_ellipse634 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse638 = new BitSet(new long[]{0x0000000020841802L});
	public static final BitSet FOLLOW_18_in_ellipse645 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse649 = new BitSet(new long[]{0x0000000020801802L});
	public static final BitSet FOLLOW_23_in_ellipse656 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ROTATION_in_ellipse660 = new BitSet(new long[]{0x0000000020001802L});
	public static final BitSet FOLLOW_11_in_ellipse667 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_ellipse671 = new BitSet(new long[]{0x0000000020001002L});
	public static final BitSet FOLLOW_29_in_ellipse678 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse682 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_ellipse689 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_ellipse693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_end712 = new BitSet(new long[]{0x0000000000000002L});
}
