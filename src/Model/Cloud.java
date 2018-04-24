package Model;

public class Cloud extends Mobile {
	private static final int SPEED = 1;
	private static final int WIDHT = 300;
	private static final int HEIGHT = 150;
	private static final Position POSITION = new Position(1, 1, 50, 50);
	private static final Dimension DIMENSION = new Dimension(WIDHT, HEIGHT);
	private static final String IMAGE = "cloud";
	
	public Cloud(Direction direction,Position position, Dimension dimension) {
		super(direction, POSITION, dimension, SPEED, IMAGE);
	}
	
}
