package fixtures;

public class Item extends Fixture {
	private String[] actions;
	public Item(String functionalName, String name, String shortDescription, String longDescription, String[] actions) {
		super(functionalName, name, shortDescription, longDescription);
		this.actions = actions;
	}
	
	public String interact(String action) {
		if (action.equals("check") || action.equals("interact") || action.equals("use") || action.equals("examine")) {
			System.out.println("\n" + this.shortDescription + "\n");
			return longDescription;
		}
		
		for(int i = 0; i < actions.length; i++) {
			if(actions[i].equals(action)) {
				System.out.println("\n" + this.shortDescription + "\n");
				return longDescription;
			}
		}
		
		return "Invalid action for this item";
	}
}
