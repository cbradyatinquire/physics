import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class RenameObject implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType(), Syntax.StringType()} );
		//object name, new name
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}