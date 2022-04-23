package racingcar.controller;

import racingcar.generator.LapsGenerator;
import racingcar.generator.RacingCarsGenerator;
import racingcar.model.car.RacingCars;
import racingcar.model.record.Records;
import racingcar.view.Display;

public class Racing {

    public void start() {
        raceFor(racingCars(), laps());
    }

    private RacingCars racingCars() {
        return RacingCarsGenerator.generate();
    }

    private Laps laps() {
        return LapsGenerator.generate();
    }

    private void raceFor(RacingCars racingCars, Laps laps) {
        Records records = new Records();
        while (laps.hasNext()) {
            records = racingCars.race();
            Display.printEachLapsReport(records);
            laps.lapCountDown();
        }
    }
}
