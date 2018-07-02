import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class EvalCommand implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType()} );
		//string containing GeoGebra command to execute
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}