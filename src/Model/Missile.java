package Model;

public class Missile extends Mobile {
	private static final int SPEED = 4;
	private static final int WIDHT = 30;
	private static final int HEIGHT = 10;
	private static final Position POSITION = new Position(1, 1, 50, 50);
	private static final Dimension DIMENSION = new Dimension(WIDHT, HEIGHT);
	private static final int MAX_DISTANCE_TRAVELED =1400;
	private static final String IMAGE = "missiles";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction,Position position, Dimension dimension) {
		super(direction, POSITION, DIMENSION, SPEED, IMAGE);
	}
	public static int getWidthWithADirection(Direction direction) {
		int test = 0;
		switch (direction) {
		case UP:
			test = HEIGHT;
		case DOWN:
			test = HEIGHT;
		case RIGHT:
			test = WIDHT ;
		case LEFT:
		test = WIDHT;
		}
		return test;
	}
	public static int getHeightWithADirection(Direction direction) {
		int test = 0;
		switch (direction) {
		case UP:
			test = HEIGHT;
		case DOWN:
			test = HEIGHT;
		case RIGHT:
			test = WIDHT;
		case LEFT:
			test = WIDHT;
		}
		return test;
	}
	public boolean isWeapon() {
		return true;
	}
	
	public void move(Direction direction) {
		Position position;
		switch(direction) {
		case UP:
			position = new Position(WIDHT, HEIGHT+1, 50, 50);
		case DOWN:
			position = new Position (WIDHT, HEIGHT-1, 50,50);
		case RIGHT:
			position = new Position (WIDHT+1,HEIGHT,50,50);
		case LEFT:
			position = new Position(WIDHT -1,HEIGHT,50,50);			
		}
	}
}
