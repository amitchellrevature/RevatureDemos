package game;
import fixtures.Room;
public class RoomManager {
	static Room startingRoom;
	Room[] rooms;
	public void init() {
		rooms = new Room[7];
	    Room deck = new Room(
    		"deck",
			"The Deck",
			"the main deck of the ship",
			"A large, sci-fi styled spaceship deck with a large transparent window on the ceiling acts as the entrance to the spaceship. Furnished like a living area.\n"
			+ "To the north is a swinging metal door that leads to the ship's cabin.\n"
			+ "A wheel-locked door leads to a hallway on the east.\n"
			+ "To the south is another swinging door with a circular window that leads to the kitchen.");
			this.rooms[0] = deck;
	        startingRoom = deck;
        Room kitchen = new Room(
    		"kitchen",
    		"The Kitchen",
    		"a kitchen for preparing and eating food",
			"A relatively plain and clean area that functions as a standard kitchen with 3 rectangular tables. Includes a stove, a fridge, a sink, and an oven.\n"
			+ "To the south is a swinging metal door that leads to the main deck.\n"
			+ "A wheel-locked door that is not intended for use leads to the engine room on the east.");
			String[] fridgeActions = {"open", "enter"};
	        kitchen.addItem("fridge", 
        		"The Fridge",
        		"A fairly large walk-in fridge.",
        		"After opening the fridge's metal swinging door, you observe the fridge's contents. Food of immense variety is stacked on all shelves.",
        		fridgeActions);
	        fridgeActions = null;
	        String[] sinkActions = {"use"};
	        kitchen.addItem("sink", 
        		"The Sink",
        		"A stainless steel sink for washing hands and dishing",
        		"You wash your hands, exemplifying good sanitary practice and discouraging the spread of bacteria.",
        		sinkActions);
	        sinkActions = null;
    		this.rooms[1] = kitchen;
    		deck.setExit(2, kitchen);
    		kitchen.setExit(0,  deck);
        Room cabin = new Room(
    		"cabin",
    		"The Cabin",
    		"a cabin that acts as the crew's sleeping quarters",
			"A spacious area where the crew sleeps. Offers 12 twin-sized mattresses, 12 wardrobes, 4 bathrooms, and 2 laundry rooms.\n"
			+ "To the south is a swinging metal door that leads to the main deck.\n"
			+ "A wheel-locked door that is not intended for use leads to the lab on the east."
			+ "To the south is another swinging door with a circular window that leads to the kitchen.");
    		this.rooms[2] = cabin;
    		deck.setExit(0,  cabin);
    		cabin.setExit(2, deck);
        Room hallway = new Room(
    		"hallway",
    		"The Hallway",
    		"a long, 4-directional hallway",
			"4 equal-length hallways connect the main deck to the more professional rooms. The hall is intentionally gray and featureless to prevent members from spending much time there.\n"
			+ "To the north is a wheel-locked door that leads to the ship's lab.\n"
			+ "A password-protected transparent sliding door leads to the cockpit on the east.\n"
			+ "To the south is another wheel-locked door that leads to the engine room.\n"
			+ "Yet another wheel-locked door leads to the main deck on the west");
    		this.rooms[3] = hallway;
    		deck.setExit(1,  hallway);
    		hallway.setExit(3, deck);
        Room lab = new Room(
    		"lab",
    		"The Lab",
    		"a lab where the crew's research is conducted",
			"Several pieces of advanced equipment allow the crew to conduct research and document findings in this lab. Geology is the crew's specialty, so the tools will assist such studies.\n"
			+ "To the south is a wheel-locked door that leads to the hallway.\n"
			+ "A wheel-locked door that is not intended for use leads to the cabin on the west.");
    		this.rooms[4] = lab;
    		String[] microscopeActions = {"research"};
	        lab.addItem("microscope", 
        		"A Microscope",
        		"A high-tech microscope that can magnify objects to varying degrees.",
        		"You peer into the microscope and adjust the image appropriately. You observe a mineral collected on a recent expedition that closely resembles salt.",
        		microscopeActions);
	        microscopeActions = null;
    		cabin.setExit(1,  lab);
    		lab.setExit(3, cabin);
    		hallway.setExit(0, lab);
    		lab.setExit(2, hallway);
        Room engineRoom = new Room(
    		"engineroom",
    		"the engine room",
    		"a cramped engine room room where the ship's engine is kept",
			"The large, whirring main engine sits in the back of the room, and other mechanisms that assist with the ship's functions are spaced throughout the suprisingly efficient clutter.\n"
			+ "To the north is a wheel-locked door that leads to the hallway.\n"
			+ "A wheel-locked door that is not intended for use leads to the kitchen on the west.");
    		this.rooms[5] = engineRoom;
    		kitchen.setExit(1,  engineRoom);
    		engineRoom.setExit(3, kitchen);
    		hallway.setExit(2, engineRoom);
    		engineRoom.setExit(2, hallway);
		Room cockpit = new Room(
    		"cockpit",
    		"The Cockpit",
    		"the cockpit designed for piloting the spaceship",
			"Buttons and switched in a huge variety of colors and sizes populate the control panel of this room. Two cushioned seats are in front of the panel for use by the pilots.\n"
			+ "A transparent sliding door leads to the hallway on the west.");
    		this.rooms[6] = cockpit;
    		String[] leverActions = {"pull", "flip", "switch"};
	        cockpit.addItem("switch", 
        		"A Lever",
        		"A large red level on the edge of the control panel",
        		"You pull the lever that is meant to power on the control panel. However, the ship's power has failed, and therefore nothing happens.",
        		leverActions);
	        leverActions = null;
    		hallway.setExit(1,  cockpit);
    		cockpit.setExit(3, hallway);
    		
	}
}
