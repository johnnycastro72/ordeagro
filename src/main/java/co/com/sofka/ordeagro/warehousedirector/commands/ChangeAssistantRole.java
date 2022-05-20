package co.com.sofka.ordeagro.warehousedirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.warehousedirector.values.AssistantId;
import co.com.sofka.ordeagro.warehousedirector.values.Role;

public class ChangeAssistantRole extends Command {
    private final AssistantId assistantId;
    private final Role role;

    public ChangeAssistantRole(AssistantId assistantId, Role role) {
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
