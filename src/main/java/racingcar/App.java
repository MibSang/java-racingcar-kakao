package racingcar;

import racingcar.domain.Racing;
import racingcar.view.RacingCarView;

public class App {
    public static void main(String[] args) {
        Racing racing = Racing.fromNames(RacingCarView.inputCarNames(), RacingCarView.inputCount());

        RacingCarView.resultMessage();
        while (racing.isProceed())
            RacingCarView.printResultOfCars(racing.tryForward());
        RacingCarView.printWinners(racing.winner());
    }
}
