package racingcar.model.record;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private int current_idx = 0;
    private final List<Record> records = new ArrayList<>();

    public void addRecord(Record record) {
        records.add(record);
    }

    public boolean hasNext() {
        return current_idx < records.size();
    }

    public Record next() {
        return records.get(current_idx++);
    }
}
