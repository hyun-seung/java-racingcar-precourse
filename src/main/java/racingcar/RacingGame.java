package racingcar;

import java.util.List;
import racingcar.Controller.CarController;
import racingcar.Domain.Car;

public class RacingGame {

    CarController carController;
    List<Car> cars;

    RacingGame() {
        carController = new CarController();
    }

    public void play() {
        cars = carController.makeCars();
        carController.playByTryCount(cars);
    }


}
