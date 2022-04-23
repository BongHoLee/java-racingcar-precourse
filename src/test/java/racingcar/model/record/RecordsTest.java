package racingcar.model.record;

import org.junit.jupiter.api.Test;
import racingcar.model.car.distance.ForwardDistance;
import racingcar.model.car.name.CarName;


public class RecordsTest {

    private Records records = new Records();

    @Test
    void test() {
        records.addRecord(new Record(new CarName("lee"), new ForwardDistance(3)));
        records.addRecord(new Record(new CarName("kim"), new ForwardDistance(1)));
        records.addRecord(new Record(new CarName("ho"), new ForwardDistance(2)));
    }
}
