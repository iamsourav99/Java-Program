import java.util.regex.*;

public class RegexExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pattern pat=Pattern.compile("[abc]"); //R.E compiled 
		 Matcher matcher=pat.matcher("a");// provide the input character sequences
		 System.out.println(matcher.matches());// matches method returns the boolean value if match -->> true vise versa 
	}

}
