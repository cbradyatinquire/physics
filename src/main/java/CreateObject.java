import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class CreateObject implements Command {

	public Syntax getSyntax() {
		return SyntaxJ.commandSyntax(
			new int[] { Syntax.ListType() });
	}

	public void perform(Argument args[], Context context)
		throws ExtensionException {
	}

}
