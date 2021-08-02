package game;
import fixtures.Room;
public class Player {
	Room currentRoom;
	public Player() {
		currentRoom = RoomManager.startingRoom;
	}
	
	public void moveTo(String newRoom) {
		for(int i = 1; i < 4; i++) {
			if(newRoom.equals(Main.directions[i]))
				if(currentRoom.getExit(i) != currentRoom)
					currentRoom = currentRoom.getExit(i);
				else {
					System.out.println("\nThere is no " + Main.directions[i] + "ern door.");
					return;
				}
		}
		
		for (int i = 0; i < 4; i++) {
			if (newRoom.equals(currentRoom.getExit(i).functionalName)) {
				currentRoom = currentRoom.getExit(i);
				return;
			}
		}
		
		System.out.println("\nYou are not adjacent a room with that name.");
		return;
	}
}
