package racingcar.model.racingvehicle.vehicle;

import racingcar.model.accelerator.Accelerator;
import racingcar.model.racingvehicle.wrapper.CarName;
import racingcar.model.racingvehicle.wrapper.ForwardDistance;
import racingcar.model.report.RecordReport;
import racingcar.model.report.Report;
import racingcar.status.MovementStatus;

public class RacingCar implements RacingVehicle{

    private final CarName carName;
    private final ForwardDistance distance;
    private final Accelerator accelerator;

    public RacingCar(CarName carName, ForwardDistance distance) {
        this.carName = carName;
        this.distance = distance;
        this.accelerator = new Accelerator();
    }

    public Report race() {
        hitAccelerator();
        return new RecordReport(carName, distance);
    }

    private void hitAccelerator() {
        MovementStatus hit = accelerator.hit();
        if (hit.isForward()) {
            distance.increase();
        }
    }
}
