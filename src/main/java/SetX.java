import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class SetX implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType(), Syntax.NumberType()} );
		//point name,  x value.
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}