package racingcar.model.car;

import java.util.List;
import racingcar.model.record.Record;
import racingcar.model.record.Records;

public class RacingCars {
    private final List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        this.racingCars = racingCars;
    }

    public Records race() {
        return raceSummaryReport();
    }

    private Records raceSummaryReport() {
        Records records = new Records();
        for (RacingCar racingCar : racingCars) {
            records.addRecord(recordOf(racingCar));
        }

        return records;
    }

    private Record recordOf(RacingCar racingCar) {
        return racingCar.race();
    }
}
