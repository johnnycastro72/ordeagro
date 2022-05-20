package co.com.sofka.ordeagro.warehousedirector.values;

import co.com.sofka.domain.generic.Identity;

public class AssistantId extends Identity {

    public AssistantId() {
    }

    private AssistantId(String id) {
        super(id);
    }

    public static AssistantId of(String id) {
        return new AssistantId(id);
    }

}
