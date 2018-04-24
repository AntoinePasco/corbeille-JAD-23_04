package Model;

import java.util.ArrayList;

public interface IDogfightModel {
public IArea getArea();
public ArrayList<IMobile> getMobile();
public IMobile getMobileByPlayer(int player);

}
