import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class HideGraph implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {} );
		//no arguments
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}