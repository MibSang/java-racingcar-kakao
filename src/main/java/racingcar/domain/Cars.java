package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.*;

public class Cars {
    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    static public Cars fromNames(List<String> names) {
        return new Cars(names.stream()
                .map(Car::new)
                .collect(Collectors.toList()));
    }

    static public Cars fromCars(List<Car> cars) {
        return new Cars(cars);
    }

    public List<Car> toList() {
        return new ArrayList<>(cars);
    }

    public void tryForward() {
        cars.forEach(Car::forward);
    }

    private void sortByDistance() {
        sort(cars);
    }

    public List<String> winner() {
        sortByDistance();
        final int maxDist = cars.get(0).getDistance();

        return cars.stream()
                .filter(car -> car.getDistance() == maxDist)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
