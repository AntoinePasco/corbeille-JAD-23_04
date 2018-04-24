package Model;

public class Plane extends Mobile {
private static final int SPEED = 2;
private static final int WIDHT = 100;
private static final int HEIGHT = 30;
private int player;

public Plane(int player, Direction direction, Position position, String Image) {
	super(direction, position, null, player, Image);
}
public boolean isPlayer() {
	return false;
}
public boolean hit() {
	return false;
}
}
