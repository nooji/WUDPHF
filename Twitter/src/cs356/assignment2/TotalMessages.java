package cs356.assignment2;

public class TotalMessages implements HubStats {
	public void accept(VisitorStats visitor) {
		visitor.visit(this);
	}
}
