package default_package;
import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.view.DogfightView;
import Model.DogfightModel;

public class main {
    public static void main(String[] args) {
        final DogfightModel dogfightModel = new DogfightModel();
        final DogfightController dogfightController = new DogfightController(dogfightModel);
        final DogfightView dogfightView = new DogfightView(dogfightController, DogfightModel, DogfightModel);
        dogfightController.setViewSystem(dogfightView);
        dogfightController.play();
    }

}