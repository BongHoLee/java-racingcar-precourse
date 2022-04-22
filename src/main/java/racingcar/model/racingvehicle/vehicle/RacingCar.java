package racingcar.model.racingvehicle.vehicle;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.engine.Engine;
import racingcar.model.engine.Rpm;
import racingcar.model.engine.wrapper.ForwardDistance;
import racingcar.model.racingvehicle.wrapper.CarName;
import racingcar.model.record.Record;

public class RacingCar{

    private final CarName carName;
    private final Engine engine;

    public RacingCar(CarName carName, Engine engine) {
        this.carName = carName;
        this.engine = engine;
    }

    public Record race() {
        return new Record(carName, forwardDistance());
    }

    private ForwardDistance forwardDistance() {
        return engine.hit(rpm());
    }

    private Rpm rpm() {
        return new Rpm(
                Randoms.pickNumberInRange(
                        Rpm.MinRpmLevel(),
                        Rpm.MaxRpmLevel()
                ));
    }
}
