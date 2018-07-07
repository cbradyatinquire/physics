import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetLinearVelocity implements Reporter {

	public Syntax getSyntax() {
		return SyntaxJ.reporterSyntax(
			new int[] { Syntax.StringType() }, Syntax.ListType());
	}

	public Object report(Argument args[], Context context)
		throws ExtensionException {
			LogoListBuilder list = new LogoListBuilder();
			list.add(42);
			return list.toLogoList();

	}

}
