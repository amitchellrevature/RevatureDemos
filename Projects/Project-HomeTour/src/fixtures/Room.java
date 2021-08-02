package fixtures;

import java.util.ArrayList;
import java.util.List;

public class Room extends Fixture {
	private Room[] exits = {this, this, this, this};
	private List<Item> items = new ArrayList<>();;
	
	public Room(String functionalName, String name, String shortDescription, String longDescription) {
		super(functionalName, name, shortDescription, longDescription);
	}
	
	public Room[] getExits() {
		return exits;
	}
	
	public Room getExit(int direction) {
		return exits[direction];
	}
	
	public void setExit(int direction, Room room) {
		exits[direction] = room;
	}
	
	public void addItem(String functionalName, String name, String shortDescription, String longDescription, String[] actions) {
		Item newItem = new Item(functionalName, name, shortDescription, longDescription, actions);
		items.add(newItem);
	}
	
	public Item getItem(int itemNumber) {
		return items.get(itemNumber);
	}

	public int getItemCount() {
		return items.size();
	}
}
