import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetCircleRadius implements Reporter {

	public Syntax getSyntax() {
		return SyntaxJ.reporterSyntax(
			new int[] { Syntax.StringType() }, Syntax.NumberType());
	}

	public Object report(Argument args[], Context context)
		throws ExtensionException {
			return Double.valueOf(42);

	}

}
