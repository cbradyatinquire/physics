import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class ShowGraph implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.ListType()} );
		//still with the list argument
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}