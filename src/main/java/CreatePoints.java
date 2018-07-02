import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class CreatePoints implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.ListType()} );
		//LIST OF lists, with point arguments (point name, 2 value list for x, y)
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}