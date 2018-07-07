import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetGravityXy implements Reporter {

	public Syntax getSyntax() {
		return SyntaxJ.reporterSyntax(
			new int[] { }, Syntax.ListType());
	}

	public Object report(Argument args[], Context context)
		throws ExtensionException {
			LogoListBuilder list = new LogoListBuilder();
			list.add(42);
			return list.toLogoList();

	}

}
