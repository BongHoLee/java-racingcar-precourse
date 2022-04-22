package racingcar.model.racingvehicle.wrapper;


import racingcar.error.Error;

public class LineUp {
    private static final String DELIMITER = ",";
    private int CUR_INDEX = 0;
    private final String[] lineupNames;

    public LineUp(String lineup) {
        this.lineupNames = lineup.split(DELIMITER);
    }

    public boolean hasNext() {
        return CUR_INDEX < lineupNames.length;
    }

    public String next() {
        if (!hasNext()) {
            throw new IllegalStateException(Error.HAS_NOT_NEXT_LINEUP.message());
        }

        return lineupNames[CUR_INDEX++];
    }
}
