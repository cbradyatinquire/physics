import org.nlogo.api.*;

public class GraphExtension extends DefaultClassManager {
  public void load(PrimitiveManager primitiveManager) {
	
	primitiveManager.addPrimitive("import-file", new ImportFile());
	
    primitiveManager.addPrimitive("show-graph", new ShowGraph());
	primitiveManager.addPrimitive("hide-graph", new HideGraph());
	
	primitiveManager.addPrimitive("create-point", new CreatePoint());
	primitiveManager.addPrimitive("delete-point", new DeletePoint());
	primitiveManager.addPrimitive("get-point", new GetPoint());
	
	primitiveManager.addPrimitive("create-points", new CreatePoints());
	primitiveManager.addPrimitive("delete-points", new DeletePoints());
	primitiveManager.addPrimitive("get-points", new GetPoints());
	
	primitiveManager.addPrimitive("set-x", new SetX());
	primitiveManager.addPrimitive("set-y", new SetY());
	primitiveManager.addPrimitive("set-xy", new SetXY());
	
	primitiveManager.addPrimitive("get-x", new GetX());
	primitiveManager.addPrimitive("get-y", new GetY());
	primitiveManager.addPrimitive("get-xy", new GetXY());
	
	primitiveManager.addPrimitive("create-objects", new CreateObjects());
	primitiveManager.addPrimitive("get-objects", new GetObjects());
	primitiveManager.addPrimitive("delete-objects", new DeleteObjects());
	
	primitiveManager.addPrimitive("get-object", new GetObject());
	primitiveManager.addPrimitive("get-value", new GetValue());
	primitiveManager.addPrimitive("get-object-type", new GetObjectType());
	
	primitiveManager.addPrimitive("exists", new Exists());

	primitiveManager.addPrimitive("rename-object", new RenameObject());
	primitiveManager.addPrimitive("delete-object", new DeleteObject());
	
	primitiveManager.addPrimitive("hide-object", new HideObject());
	primitiveManager.addPrimitive("show-object", new ShowObject());
	
	primitiveManager.addPrimitive("graph-to-patch", new GraphToPatch());
	primitiveManager.addPrimitive("patch-to-graph", new PatchToGraph());
	primitiveManager.addPrimitive("eval-command", new EvalCommand());
	
  }
}