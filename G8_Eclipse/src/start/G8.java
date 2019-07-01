package start;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import lexer.G8Lexer;
import parser.G8Parser;
import parser.G8Parser.SameNameError;
import parser.G8Parser.ShapeLayoutError;

public class G8 {

	public static void main(String[] args) throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
		
		File outputFile = new File("D:\\Users\\Stefano\\eclipse-workspace\\G8_Eclipse\\files\\output.html");
		outputFile.delete();
		outputFile.createNewFile();
		 String stringa = readFile();
		 
		 ANTLRStringStream in = new ANTLRStringStream(stringa);
	     G8Lexer lexer = new G8Lexer(in);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     G8Parser parser = new G8Parser(tokens);
	     parser.begin();

	}
	
	public static String readFile() throws IOException {
		
		File inputFile = new File("D:\\Users\\Stefano\\eclipse-workspace\\G8_Eclipse\\files\\input.g8");
		
		InputStream is = new FileInputStream(inputFile); 
		BufferedReader buf = new BufferedReader(new InputStreamReader(is)); 
		
		String line = buf.readLine(); 
		StringBuilder sb = new StringBuilder();
		
		while(line != null){
			sb.append(line).append(" "); 
			line = buf.readLine(); 
		} 
		
		String fileAsString = sb.toString();
		
		buf.close();
		
		return fileAsString;
	}
	
	public static void writeFile(String toWrite) throws IOException {
		
		File outputFile = new File("D:\\Users\\Stefano\\eclipse-workspace\\G8_Eclipse\\files\\output.html");
		
		FileWriter out = new FileWriter(outputFile, true);
		
		out.append(toWrite);
		
		if(toWrite != "</html>") {
			out.append("\n");
		}
		
		out.close();
		
	}
}