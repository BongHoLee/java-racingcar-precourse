package racingcar.model.racingvehicle.vehicle;

import java.util.List;
import racingcar.model.report.RecordReports;
import racingcar.model.report.Report;

public class RacingCars implements RacingVehicle{
    private final List<RacingVehicle> vehicles;

    public RacingCars(List<RacingVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public Report race() {
        return raceSummaryReport();
    }

    private Report raceSummaryReport() {
        RecordReports summaryReport = new RecordReports();
        for (RacingVehicle vehicle : vehicles) {
            summaryReport.addReport(recordOf(vehicle));
        }

        return summaryReport;
    }

    private Report recordOf(RacingVehicle vehicle) {
        return vehicle.race();
    }
}
