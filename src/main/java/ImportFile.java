import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class ImportFile implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType()} );
		//filename (ggb) .
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}