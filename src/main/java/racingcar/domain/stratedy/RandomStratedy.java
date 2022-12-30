package racingcar.domain.stratedy;

import java.util.Random;

public class RandomStratedy implements MovableStrategy {
    public static final int FORWARD_NUM = 4;
    public static final int RANDOM_MAX_NUM = 10;

    public boolean isMove() {
        return new Random().nextInt(RANDOM_MAX_NUM) >= FORWARD_NUM;
    }
}
