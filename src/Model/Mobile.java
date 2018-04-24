package Model;

import java.awt.Image;

public class Mobile implements IMobile{
	private int speed;
	Direction direction;
	Position position;
	Dimension dimension;
public Mobile (Direction direction, Position position, Dimension dimension, int speed, String image) {
	
}
@Override
public Direction getDirection() {
	return direction;
}
@Override 
public void setDirection(Direction direction) {
	this.direction = direction;
}

@Override
public Position getPosition() {
	return position;
}
@Override
public Dimension getDimension() {
	return dimension;
}
@Override
public int getWith() {
	return 0;
}
@Override
public int getHeight() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int getSpeed() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public Image getImage() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean isPlayer(int player) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean hit() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean isWeapon() {
	// TODO Auto-generated method stub
	return false;
}
}
