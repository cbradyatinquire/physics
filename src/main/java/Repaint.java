import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class Repaint implements Command {

	public Syntax getSyntax() {
		return SyntaxJ.commandSyntax(
			new int[] { });
	}

	public void perform(Argument args[], Context context)
		throws ExtensionException {
	}

}
