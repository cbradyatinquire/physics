import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetXY implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType()}, Syntax.ListType());
	//input point name- output xy-list
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    
	LogoListBuilder list = new LogoListBuilder();
	list.add(Double.valueOf(4));
	list.add(Double.valueOf(2));
	return list.toLogoList();
	
  }

}