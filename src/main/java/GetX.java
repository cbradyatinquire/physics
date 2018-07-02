import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetX implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType()}, Syntax.NumberType());
	//Input - string, return x-value  (4.2)
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    
	return Double.valueOf(4.2);
	
  }

}