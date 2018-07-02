import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetObject implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType()}, Syntax.ListType());
	//input name - returns creation string.
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    

	LogoListBuilder list = new LogoListBuilder();
	list.add("example: ['my-triangle' 'Polygon(F, G, H)')'] ]");
	return list.toLogoList();
	
  }

}