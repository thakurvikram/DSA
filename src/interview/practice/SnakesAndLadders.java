package interview.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakesAndLadders {

	private static Scanner scanner = new Scanner(System.in);
	private static Random random = new Random();
	private static int noOfPlayers;
	private static Map<Integer, Integer> ladderPositionMap = new HashMap<>();
	private static Map<Integer, Integer> snakePositionMap = new HashMap<>();
	private static Map<Integer, Player> playerMap = new HashMap<>();

	public static void main(String[] args) {
		initSnakes();
		initLadders();
		setupPlayers();
		playGame();
	}

	private static void playGame() {

		int currentPlayer = 1;

		while (2 > 1) {

			System.out.println();
			System.out.println("Its Player: " + currentPlayer + " chance to play, Role the dice by pressing enter...");

			Player player = playerMap.get(currentPlayer);
			int currentPosition = player.getPosition();

			scanner.nextLine();

			int diceValue = random.nextInt(6) + 1;

			System.out.println("Dice value -> " + diceValue);

			int nextCalculatedPosition = player.getPosition() + diceValue;
			Integer snakePosition = checkSnakes(nextCalculatedPosition);
			Integer ladderPosition = checkLadders(nextCalculatedPosition);

			int nextPosition = 0;
			if (snakePosition == null && ladderPosition == null) {
				nextPosition = nextCalculatedPosition;
			} else if (snakePosition != null) {
				System.out.println("Ohh..you get the snake");
				nextPosition = snakePosition;
			} else if (ladderPosition != null) {
				System.out.println("Yoo..you get the ladder");
				nextPosition = ladderPosition;
			}

			if (nextPosition > 36) {
				nextPosition = currentPosition;
			} else if (nextPosition == 36) {
				System.out.println("**************************************");
				System.out.println("Player " + currentPlayer + " won the game");
				break;
			} else {
				player.setPosition(nextPosition);
				playerMap.put(currentPlayer, player);
				System.out
						.println("Player " + currentPlayer + " moved from " + currentPosition + " to " + nextPosition);
			}

			if (noOfPlayers != currentPlayer) {
				currentPlayer++;
			} else {
				currentPlayer = 1;
			}
		}
	}

	private static Integer checkSnakes(int diceValue) {
		return snakePositionMap.get(diceValue);
	}

	private static Integer checkLadders(int diceValue) {
		return ladderPositionMap.get(diceValue);
	}

	private static void setupPlayers() {
		System.out.println("Enter number of players: ");
		noOfPlayers = scanner.nextInt();
		for (int i = 1; i <= noOfPlayers; i++) {
			playerMap.put(i, new Player("Player" + i));
		}

	}

	private static void initLadders() {
		ladderPositionMap.put(3, 16);
		ladderPositionMap.put(15, 25);
		ladderPositionMap.put(21, 32);
	}

	private static void initSnakes() {
		snakePositionMap.put(12, 2);
		snakePositionMap.put(30, 4);
		snakePositionMap.put(35, 22);
	}
}

class Player {
	private String name;
	private int position;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
}