package Model;

import java.util.ArrayList;

public interface IDogFightModel {
public IArea getArea();
public ArrayList<IMobile> getMobile();
public IMobile getMobileByPlayer(int player);

}
