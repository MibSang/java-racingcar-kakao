package racingcar.domain;

import java.util.List;

public class Racing {
    private final Cars cars;
    private int count;

    private Racing(Cars cars, int count) {
        this.cars = cars;
        this.count = count;
    }

    static public Racing fromNames(List<String> names, int count) {
        return new Racing(Cars.fromNames(names), count);
    }

    static public Racing fromCars(List<Car> cars, int count) {
        return new Racing(Cars.fromCars(cars), count);
    }

    public List<Car> getCarList() {
        return cars.toList();
    }

    public List<Car> tryForward() {
        cars.tryForward();
        count--;
        return getCarList();
    }

    public int getCount() {
        return count;
    }

    public boolean isNotFinished() {
        return count != 0;
    }

    public List<String> winner() {
        return cars.winner();
    }
}
