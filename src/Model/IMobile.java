package Model;

import java.awt.Image;

public interface IMobile {
public Direction getDirection();
public void setDirection(Direction direction);
public Position getPosition();
public Dimension getDimension();
public int getWith();
public int getHeight();
public int getSpeed();
public Image getImage();
public boolean isPlayer(int player);
public boolean hit();
public boolean isWeapon();
}
