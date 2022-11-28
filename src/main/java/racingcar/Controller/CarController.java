package racingcar.Controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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
        List<Car> winners = getWinners(cars);
        List<String> winnerNames = getWinnerNames(winners);
        view.printWinner(winnerNames);
    }

    private void playOneRound(List<Car> cars) {
        List<String> carsStatus = new ArrayList<>();
        for (Car car : cars) {
            car.moveByRandomNumber();
            carsStatus.add(car.toString());
        }
        view.printCarsStatus(carsStatus);
    }

    private List<Car> getWinners(List<Car> cars) {
        int maxPosition = cars.stream().max(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPosition() - o2.getPosition();
            }
        }).get().getPosition();

        return cars.stream().filter(car -> car.getPosition() == maxPosition).collect(Collectors.toList());
    }

    private List<String> getWinnerNames(List<Car> winners) {
        List<String> winnerNames = new ArrayList<>();
        for(Car winner : winners) {
            winnerNames.add(winner.getName());
        }
        return winnerNames;
    }
}
