package racingcar.model.report;

import racingcar.model.racingvehicle.wrapper.CarName;
import racingcar.model.racingvehicle.wrapper.ForwardDistance;

public class RecordReport {

    private static final String COLON = " : ";
    private final CarName carName;
    private final ForwardDistance distance;

    public RecordReport(CarName carName, ForwardDistance distance) {
        this.carName = carName;
        this.distance = distance;
    }

    public String report() {
        return carName + COLON + distance;
    }
}
