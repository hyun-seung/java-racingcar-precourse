package racingcar.Controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.Domain.Car;
import racingcar.View.TotalView;

public class CarController {

    TotalView view;

    public CarController() {
        view = new TotalView();
    }

    public List<Car> makeCars() {
        String[] carNames = view.getCarNames();
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(makeCar(carName));
        }
        return cars;
    }

    private Car makeCar(String carName) {
        return new Car(carName);
    }

    public void playByTryCount(List<Car> cars) {
        int tryCount = view.getTryCount();
        for (int i = 0; i < tryCount; i++) {
            playOneRound(cars);
        }
    }

    public void playOneRound(List<Car> cars) {

    }
}
