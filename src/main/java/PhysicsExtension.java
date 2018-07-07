import org.nlogo.api.*;
public class PhysicsExtension extends DefaultClassManager {
	public void load(PrimitiveManager primitiveManager) {
		primitiveManager.addPrimitive( "hide-world", new HideWorld() );
		primitiveManager.addPrimitive( "show-world", new ShowWorld() );
		primitiveManager.addPrimitive( "set-gravity-xy", new SetGravityXy() );
		primitiveManager.addPrimitive( "get-gravity-xy", new GetGravityXy() );
		primitiveManager.addPrimitive( "set-wrap-xy", new SetWrapXy() );
		primitiveManager.addPrimitive( "get-wrap-xy", new GetWrapXy() );
		primitiveManager.addPrimitive( "set-time-step", new SetTimeStep() );
		primitiveManager.addPrimitive( "get-time-step", new GetTimeStep() );
		primitiveManager.addPrimitive( "set-velocity-iterations", new SetVelocityIterations() );
		primitiveManager.addPrimitive( "get-velocity-iterations", new GetVelocityIterations() );
		primitiveManager.addPrimitive( "set-position-iterations", new SetPositionIterations() );
		primitiveManager.addPrimitive( "get-position-iterations", new GetPositionIterations() );
		primitiveManager.addPrimitive( "create-body", new CreateBody() );
		primitiveManager.addPrimitive( "set-behavior", new SetBehavior() );
		primitiveManager.addPrimitive( "set-body-xy", new SetBodyXy() );
		primitiveManager.addPrimitive( "set-angle", new SetAngle() );
		primitiveManager.addPrimitive( "set-linear-velocity", new SetLinearVelocity() );
		primitiveManager.addPrimitive( "set-angular-velocity", new SetAngularVelocity() );
		primitiveManager.addPrimitive( "get-behavior", new GetBehavior() );
		primitiveManager.addPrimitive( "get-body-xy", new GetBodyXy() );
		primitiveManager.addPrimitive( "get-angle", new GetAngle() );
		primitiveManager.addPrimitive( "get-linear-velocity", new GetLinearVelocity() );
		primitiveManager.addPrimitive( "get-angular-velocity", new GetAngularVelocity() );
		primitiveManager.addPrimitive( "set-friction", new SetFriction() );
		primitiveManager.addPrimitive( "set-density", new SetDensity() );
		primitiveManager.addPrimitive( "set-restitution", new SetRestitution() );
		primitiveManager.addPrimitive( "get-friction", new GetFriction() );
		primitiveManager.addPrimitive( "get-density", new GetDensity() );
		primitiveManager.addPrimitive( "get-restitution", new GetRestitution() );
		primitiveManager.addPrimitive( "create-line", new CreateLine() );
		primitiveManager.addPrimitive( "set-line-relative-endpoints", new SetLineRelativeEndpoints() );
		primitiveManager.addPrimitive( "set-line-endpoints", new SetLineEndpoints() );
		primitiveManager.addPrimitive( "get-line-relative-endpoints", new GetLineRelativeEndpoints() );
		primitiveManager.addPrimitive( "get-line-endpoints", new GetLineEndpoints() );
		primitiveManager.addPrimitive( "create-circle", new CreateCircle() );
		primitiveManager.addPrimitive( "set-circle-radius", new SetCircleRadius() );
		primitiveManager.addPrimitive( "set-circle-relative-center", new SetCircleRelativeCenter() );
		primitiveManager.addPrimitive( "set-circle-center", new SetCircleCenter() );
		primitiveManager.addPrimitive( "get-circle-radius", new GetCircleRadius() );
		primitiveManager.addPrimitive( "get-circle-relative-center", new GetCircleRelativeCenter() );
		primitiveManager.addPrimitive( "get-circle-center", new GetCircleCenter() );
		primitiveManager.addPrimitive( "create-polygon", new CreatePolygon() );
		primitiveManager.addPrimitive( "set-polygon-relative-vertices", new SetPolygonRelativeVertices() );
		primitiveManager.addPrimitive( "set-polygon-vertices", new SetPolygonVertices() );
		primitiveManager.addPrimitive( "get-polygon-relative-vertices", new GetPolygonRelativeVertices() );
		primitiveManager.addPrimitive( "get-polygon-vertices", new GetPolygonVertices() );
		primitiveManager.addPrimitive( "create-target", new CreateTarget() );
		primitiveManager.addPrimitive( "set-target-relative-xy", new SetTargetRelativeXy() );
		primitiveManager.addPrimitive( "set-target-xy", new SetTargetXy() );
		primitiveManager.addPrimitive( "get-target-relative-xy", new GetTargetRelativeXy() );
		primitiveManager.addPrimitive( "get-target-xy", new GetTargetXy() );
		primitiveManager.addPrimitive( "set-body-id", new SetBodyId() );
		primitiveManager.addPrimitive( "get-body-id", new GetBodyId() );
		primitiveManager.addPrimitive( "create-objects", new CreateObjects() );
		primitiveManager.addPrimitive( "create-object", new CreateObject() );
		primitiveManager.addPrimitive( "get-objects", new GetObjects() );
		primitiveManager.addPrimitive( "get-object", new GetObject() );
		primitiveManager.addPrimitive( "get-object-type", new GetObjectType() );
		primitiveManager.addPrimitive( "delete-object", new DeleteObject() );
		primitiveManager.addPrimitive( "delete-targets", new DeleteTargets() );
		primitiveManager.addPrimitive( "delete-objects", new DeleteObjects() );
		primitiveManager.addPrimitive( "apply-force", new ApplyForce() );
		primitiveManager.addPrimitive( "apply-force-relative-angle", new ApplyForceRelativeAngle() );
		primitiveManager.addPrimitive( "apply-linear-impulse", new ApplyLinearImpulse() );
		primitiveManager.addPrimitive( "apply-linear-impulse-relative-angle", new ApplyLinearImpulseRelativeAngle() );
		primitiveManager.addPrimitive( "apply-torque", new ApplyTorque() );
		primitiveManager.addPrimitive( "apply-angular-impulse", new ApplyAngularImpulse() );
		primitiveManager.addPrimitive( "connect-who-to-object", new ConnectWhoToObject() );
		primitiveManager.addPrimitive( "disconnect-who", new DisconnectWho() );
		primitiveManager.addPrimitive( "object-exists", new ObjectExists() );
		primitiveManager.addPrimitive( "get-connected", new GetConnected() );
		primitiveManager.addPrimitive( "reset-ticks", new ResetTicks() );
		primitiveManager.addPrimitive( "tick", new Tick() );
		primitiveManager.addPrimitive( "get-tick", new GetTick() );
		primitiveManager.addPrimitive( "repaint", new Repaint() );
		primitiveManager.addPrimitive( "create-rectangle", new CreateRectangle() );
		primitiveManager.addPrimitive( "set-rectangle-relative-corners", new SetRectangleRelativeCorners() );
		primitiveManager.addPrimitive( "set-rectangle-corners", new SetRectangleCorners() );
		primitiveManager.addPrimitive( "get-rectangle-relative-corners", new GetRectangleRelativeCorners() );
		primitiveManager.addPrimitive( "get-rectangle-corners", new GetRectangleCorners() );
		primitiveManager.addPrimitive( "show-object", new ShowObject() );
		primitiveManager.addPrimitive( "hide-object", new HideObject() );
		primitiveManager.addPrimitive( "show-objects", new ShowObjects() );
		primitiveManager.addPrimitive( "hide-objects", new HideObjects() );
		primitiveManager.addPrimitive( "export-world", new ExportWorld() );
		primitiveManager.addPrimitive( "import-world", new ImportWorld() );
		primitiveManager.addPrimitive( "set-rectangle-patch", new SetRectanglePatch() );
		primitiveManager.addPrimitive( "get-rectangle-patch", new GetRectanglePatch() );
		primitiveManager.addPrimitive( "get-world-offset", new GetWorldOffset() );
		primitiveManager.addPrimitive( "set-world-offset", new SetWorldOffset() );
		primitiveManager.addPrimitive( "set-all", new SetAll() );
		primitiveManager.addPrimitive( "get-all", new GetAll() );
		primitiveManager.addPrimitive( "show-toolbar", new ShowToolbar() );
		primitiveManager.addPrimitive( "hide-toolbar", new HideToolbar() );
	}
}