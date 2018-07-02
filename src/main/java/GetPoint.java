import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetPoint implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType()}, Syntax.ListType());
	//input name - returns list describing it.
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    

	LogoListBuilder list = new LogoListBuilder();
	list.add("example: ['A' [ 4 2 ] ]");
	return list.toLogoList();
	
  }

}