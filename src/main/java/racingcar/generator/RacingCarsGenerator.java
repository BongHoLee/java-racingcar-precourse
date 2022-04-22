package racingcar.generator;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.model.engine.Engine;
import racingcar.model.racingvehicle.vehicle.RacingCar;
import racingcar.model.racingvehicle.vehicle.RacingCars;
import racingcar.model.racingvehicle.wrapper.CarName;
import racingcar.model.racingvehicle.wrapper.LineUp;
import racingcar.view.Display;

public class RacingCarsGenerator {

    public static RacingCars generate() {
        RacingCars racingCars = null;
        while (racingCars == null) {
            racingCars = createRacingCars();
        }

        return racingCars;
    }

    private static RacingCars createRacingCars() {
        RacingCars racingCars = null;

        try {
            racingCars = enterRacingCars(lineUp());
        } catch (IllegalArgumentException e) {
            Display.printExceptionMessage(e);
        }

        return racingCars;
    }

    private static LineUp lineUp() {
        Display.printLineUpMessage();
        return new LineUp(Console.readLine());
    }

    private static RacingCars enterRacingCars(LineUp lineUp) {
        List<RacingCar> racingCarList = new ArrayList<>();
        while (lineUp.hasNext()) {
            racingCarList.add(racingCar(lineUp));
        }

        return new RacingCars(racingCarList);
    }

    private static RacingCar racingCar(LineUp lineUp) {
        return new RacingCar(
                new CarName(lineUp.next()),
                new Engine()
        );
    }
}
