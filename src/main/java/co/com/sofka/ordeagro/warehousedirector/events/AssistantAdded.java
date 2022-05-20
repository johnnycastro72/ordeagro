package co.com.sofka.ordeagro.warehousedirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.shared.Name;
import co.com.sofka.ordeagro.warehousedirector.values.AssistantId;
import co.com.sofka.ordeagro.warehousedirector.values.Role;

public class AssistantAdded extends DomainEvent {
    private final AssistantId assistantId;
    private final Name name;
    private final Role role;

    public AssistantAdded(AssistantId assistantId, Name name, Role role) {
        super("ordeagro.sofka.assistantadded");
        this.assistantId = assistantId;
        this.name = name;
        this.role = role;
    }

    public AssistantId assistantId() {
        return assistantId;
    }

    public Name name() {
        return name;
    }

    public Role role() {
        return role;
    }
}
