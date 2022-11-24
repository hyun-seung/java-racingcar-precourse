package racingcar;

import racingcar.Controller.CarController;

public class RacingGame {

    CarController carController;

    RacingGame() {
        carController = new CarController();

        play();
    }

    public void play() {
        carController.makeCars();
        carController.playByTryCount();
    }


}
