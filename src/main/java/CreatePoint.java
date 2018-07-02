import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class CreatePoint implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType(), Syntax.ListType()} );
		//point name, 2 value list for x, y.
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}