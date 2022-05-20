package co.com.sofka.ordeagro.warehousedirector;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ordeagro.shared.Name;
import co.com.sofka.ordeagro.warehousedirector.values.AssistantId;
import co.com.sofka.ordeagro.warehousedirector.values.Role;

import java.util.Objects;

public class Assistant extends Entity<AssistantId> {
    private Name name;
    private Role role;

    public Assistant(AssistantId assistantId) {
        super(assistantId);
    }

    public Assistant(AssistantId assistantId, Name name, Role role) {
        super(assistantId);
        this.name = name;
        this.role = role;
    }

    public void ChangeRole(Role role) {
        this.role = Objects.requireNonNull(role);
    }

    public Name name() {
        return name;
    }

    public Role role() {
        return role;
    }
}
