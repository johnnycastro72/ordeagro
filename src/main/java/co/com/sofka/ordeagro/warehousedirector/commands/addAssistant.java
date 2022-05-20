package co.com.sofka.ordeagro.warehousedirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.shared.Name;
import co.com.sofka.ordeagro.warehousedirector.values.AssistantId;
import co.com.sofka.ordeagro.warehousedirector.values.Role;

public class addAssistant extends Command {
    private final AssistantId assistantId;
    private final Name name;
    private final Role role;

    public addAssistant(AssistantId assistantId, Name name, Role role) {
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
