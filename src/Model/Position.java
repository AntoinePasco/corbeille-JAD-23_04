package Model;

public class Position {
 private double X;
 private double Y;
 private double maxX;
 private double maxY;
 
 public Position(double X, double Y, double maxX, double maxY) {
	 
 }
 public Position (Position position) {
	 
 }
public double getX() {
	return X;
}
public void setX(double x) {
	X = x;
}
public double getY() {
	return Y;
}
public void setY(double y) {
	Y = y;
}
protected void setMaxX(double maxX) {
	this.maxX = maxX;
}
protected void setMaxY(double maxY) {
	this.maxY = maxY;
}
}
