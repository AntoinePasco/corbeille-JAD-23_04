package Model;

public class Cloud extends Mobile {
	private static final int SPEED = 1;
	private static final int WIDHT = 300;
	private static final int HEIGHT = 150;
	private static final String IMAGE = "cloud";
	
	public Cloud(Direction direction, Dimension dimension) {
		super(direction, null, null, SPEED, IMAGE);
	}
}
