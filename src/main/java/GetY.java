import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetY implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType()}, Syntax.NumberType());
	//Input - string, return y-value  (.42)
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    
	return Double.valueOf(0.42);
	
  }

}