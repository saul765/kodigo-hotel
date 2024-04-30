package sequence;

import static java.util.Objects.isNull;

public class ReservaSequence implements BaseSequence {

    private static Integer idCounter = 0;
    private static ReservaSequence instance;

    private ReservaSequence() {
    }

    public static ReservaSequence getInstance() {
        if (isNull(instance)) {
            instance = new ReservaSequence();
        }
        return instance;
    }

    @Override
    public Integer getNextId() {
        return ++idCounter;
    }
}
