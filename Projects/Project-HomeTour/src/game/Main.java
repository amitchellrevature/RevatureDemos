package game;
import java.util.Scanner;
public class Main {
	private static Scanner scanner;
	public static String[] directions = {"north", "east", "south", "west"};
	public static void main(String[] args) {
		RoomManager roomManager = new RoomManager();
		roomManager.init();
		Player player = new Player();
		String[] userInput;
		System.out.println("Welcome to HomeTour!\n"
				+ "The theme of this environment is a sci-fi spaceship where the crew is tasked with studying the geology of foreign planets.\n"
				+ "This game accepts text as input, and each exit and item in a room can be traversed or interacted with.\n"
				+ "Choose an action and a target separated by a space to perform the action, e.g \"go kitchen,\" \"travel north,\" and \"check book.\"\n"
				+ "-------------------------------------------------------------------------------------------------------------------------------------");
		while (true) {
			printRoom(player);
			userInput = collectInput();
			if(userInput[0].equals("exit"))
				return;
			parse(userInput, player);
		}
	}
	
	private static void printRoom(Player player) {
		System.out.println("\nYou find yourself in " 
				+ player.currentRoom.shortDescription + ".\n\n"
				+ player.currentRoom.longDescription + "\n\n"
				+ "In this room, you observe:");
		
		for(int i = 0; i < 4; i++) {
			if (player.currentRoom.getExit(i) != player.currentRoom)
				System.out.println("To the " + directions[i] + ": " + player.currentRoom.getExit(i).name);
		}
		
		for(int i = 0; i < player.currentRoom.getItemCount(); i++) {
			System.out.println(player.currentRoom.getItem(i).name);
		}
		
		System.out.print("\n");
	}
	
	private static String[] collectInput() {
		String userInput;
		scanner = new Scanner(System.in);
		userInput = scanner.nextLine();
		userInput.toLowerCase();
		String[] newInput = userInput.split(" ", 2);
		if(newInput[0].equals("exit"))
			return newInput;
		if(newInput.length < 2) {
			String[] badInput = {"a", "b"};
			return badInput;
		}
		newInput[1] = newInput[1].replaceAll(" ", "");
		return newInput;
	}
	
	private static void parse(String[]command, Player player) {
		switch(command[0]) {
		case "go":
		case "travel":
		case "move":
		case "enter":
			player.moveTo(command[1]);
			return;
		}
		for(int i = (player.currentRoom.getItemCount() - 1); i >= 0; i--) {
			if(command[1].equals(player.currentRoom.getItem(i).functionalName)) {
				System.out.println(player.currentRoom.getItem(i).interact(command[0]));
				return;
			}
		}
		System.out.println("\nError: Invalid command or target.");
		return;
	}
	
	
}
