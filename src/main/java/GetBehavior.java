import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetBehavior implements Reporter {

	public Syntax getSyntax() {
		return SyntaxJ.reporterSyntax(
			new int[] { Syntax.StringType() }, Syntax.StringType());
	}

	public Object report(Argument args[], Context context)
		throws ExtensionException {
			return "hi";

	}

}
