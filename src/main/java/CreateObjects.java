import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class CreateObjects implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.ListType()} );
		//LIST OF lists, ea with object definitions
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}