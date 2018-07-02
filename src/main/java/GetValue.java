import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetValue implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType()}, Syntax.WildcardType());
	//input name - returns value (wildcard but actually returning a number here)
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    
	return Double.valueOf(42);
	
  }

}