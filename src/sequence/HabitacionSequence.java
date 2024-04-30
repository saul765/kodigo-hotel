package sequence;

import static java.util.Objects.isNull;

public class HabitacionSequence implements BaseSequence {

    private static Integer idCounter = 0;
    private static HabitacionSequence instance;

    private HabitacionSequence() {
    }

    public static HabitacionSequence getInstance() {
        if (isNull(instance)) {
            instance = new HabitacionSequence();
        }
        return instance;
    }

    @Override
    public Integer getNextId() {
        return ++idCounter;
    }
}
