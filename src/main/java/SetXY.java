import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class SetXY implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType(), Syntax.ListType()} );
		//point name, list of x,y values of the point
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}