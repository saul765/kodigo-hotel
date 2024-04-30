package sequence;

import static java.util.Objects.isNull;

public class ClienteSequence implements BaseSequence {


    private static Integer idCounter = 0;
    private static ClienteSequence instance;

    private ClienteSequence() {
    }

    public static ClienteSequence getInstance() {
        if (isNull(instance)) {
            instance = new ClienteSequence();
        }
        return instance;
    }

    @Override
    public Integer getNextId() {
        return ++idCounter;
    }
}
