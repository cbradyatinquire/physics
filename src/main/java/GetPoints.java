import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetPoints implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {}, Syntax.ListType());
	//no argument - just gets all the points in the construction
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    
	LogoListBuilder list = new LogoListBuilder();
	list.add("example: [ [ 'point-1' [ 0 2 ] ] [ 'point-2' [ 0 0 ] ] ]");
	return list.toLogoList();
	
  }

}