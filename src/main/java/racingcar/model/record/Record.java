package racingcar.model.record;

import racingcar.model.racingvehicle.wrapper.CarName;
import racingcar.model.engine.wrapper.ForwardDistance;

public class Record {

    private static final String COLON = " : ";
    private final CarName carName;
    private final ForwardDistance distance;

    public Record(CarName carName, ForwardDistance distance) {
        this.carName = carName;
        this.distance = distance;
    }

    public String report() {
        return carName + COLON + distance;
    }

    public CarName getCarName() {
        return this.carName;
    }

    public ForwardDistance getDistance() {
        return this.distance;
    }
}
