package Model;

public class Missile extends Mobile {
	private static final int SPEED = 4;
	private static final int WIDHT = 30;
	private static final int HEIGHT = 10;
	private static final int MAX_DISTANCE_TRAVELED =1400;
	private static final String IMAGE = "missiles";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Dimension dimension) {
		super(direction, null, dimension, MAX_DISTANCE_TRAVELED, IMAGE);
	}
	public static int getWidthWithADirection(Direction direction) {
		return 1;
	}
	public static int getHeightWithADirection(Direction direction) {
		return 1;
	}
	public boolean isWeapon() {
		return false;
	}
}
