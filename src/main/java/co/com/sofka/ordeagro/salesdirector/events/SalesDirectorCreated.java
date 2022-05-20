package co.com.sofka.ordeagro.salesdirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.salesdirector.values.SalesDirectorId;
import co.com.sofka.ordeagro.shared.Name;

public class SalesDirectorCreated extends DomainEvent {
    private final SalesDirectorId salesDirectorId;
    private final Name name;

    public SalesDirectorCreated(SalesDirectorId salesDirectorId, Name name) {
        super("ordeagro.sofka.salesdirectorcreated");
        this.salesDirectorId = salesDirectorId;
        this.name = name;
    }

    public SalesDirectorId salesDirectorId() {
        return salesDirectorId;
    }

    public Name name() {
        return name;
    }
}
