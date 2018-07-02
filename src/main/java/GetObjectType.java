import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetObjectType implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType()}, Syntax.StringType());
	//input name - returns string describing object type.
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    
	return "description of object type";
	
  }

}