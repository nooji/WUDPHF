package cs356.assignment2;

public class TotalGroups implements HubStats {
	public void accept(VisitorStats visitor) {
		visitor.visit(this);
	}
}
