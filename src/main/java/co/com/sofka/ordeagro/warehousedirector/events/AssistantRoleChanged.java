package co.com.sofka.ordeagro.warehousedirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.warehousedirector.values.AssistantId;
import co.com.sofka.ordeagro.warehousedirector.values.Role;

public class AssistantRoleChanged extends DomainEvent {
    private final AssistantId assistantId;
    private final Role role;

    public AssistantRoleChanged(AssistantId assistantId, Role role) {
        super("ordeagro.sofka.assistantrolechanged");
        this.assistantId = assistantId;
        this.role = role;
    }

    public AssistantId assistantId() {
        return assistantId;
    }

    public Role role() {
        return role;
    }
}
