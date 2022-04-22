package racingcar.model.racingvehicle.vehicle;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.engine.Engine;
import racingcar.model.engine.Rpm;
import racingcar.model.racingvehicle.wrapper.CarName;
import racingcar.model.engine.wrapper.ForwardDistance;
import racingcar.model.report.RecordReport;
import racingcar.model.report.Report;

public class RacingCar implements RacingVehicle {

    private final CarName carName;
    private final Engine engine;

    public RacingCar(CarName carName, Engine engine) {
        this.carName = carName;
        this.engine = engine;
    }

    public Report race() {
        return new RecordReport(carName, hitRpm());
    }

    private ForwardDistance hitRpm() {
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
