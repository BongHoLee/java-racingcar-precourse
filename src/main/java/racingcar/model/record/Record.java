package racingcar.model.record;

import racingcar.model.car.CarName;
import racingcar.model.car.ForwardDistance;

public class Record {

    private static final String COLON = " : ";
    private final CarName carName;
    private final ForwardDistance distance;

    public Record(CarName carName, ForwardDistance distance) {
        this.carName = carName;
        this.distance = distance;
    }

    public String report() {
        return carName() + COLON + distance();
    }

    private String carName() {
        return carName.name();
    }

    private String distance() {
        return distance.distance();
    }
}
