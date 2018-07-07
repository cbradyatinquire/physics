import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetRectanglePatch implements Reporter {

	public Syntax getSyntax() {
		return SyntaxJ.reporterSyntax(
			new int[] { Syntax.StringType() }, Syntax.patchType());
	}

	public Object report(Argument args[], Context context)
		throws ExtensionException {
			
	}

}
