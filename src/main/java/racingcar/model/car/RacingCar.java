package racingcar.model.car;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.record.Record;

public class RacingCar{

    private final CarName carName;
    private final ForwardDistance forwardDistance;

    public RacingCar(CarName carName) {
        this.carName = carName;
        this.forwardDistance = new ForwardDistance();
    }

    public Record race() {
        hitRpm();
        return new Record(carName, forwardDistance);
    }

    private void hitRpm() {
        forwardDistance.hitFrom(rpm());
    }

    private Rpm rpm() {
        return new Rpm(
                Randoms.pickNumberInRange(
                        Rpm.MinRpmLevel(),
                        Rpm.MaxRpmLevel()
                ));
    }
}
