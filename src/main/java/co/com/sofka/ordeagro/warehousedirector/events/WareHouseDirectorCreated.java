package co.com.sofka.ordeagro.warehousedirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.shared.Name;
import co.com.sofka.ordeagro.warehousedirector.values.WareHouseDirectorId;

public class WareHouseDirectorCreated extends DomainEvent {
    private final WareHouseDirectorId wareHouseDirectorId;
    private final Name name;

    public WareHouseDirectorCreated(WareHouseDirectorId wareHouseDirectorId, Name name) {
        super("ordeagro.sofka.warehousedirectorcreated");
        this.wareHouseDirectorId = wareHouseDirectorId;
        this.name = name;
    }

    public WareHouseDirectorId wareHouseDirectorId() {
        return wareHouseDirectorId;
    }

    public Name name() {
        return name;
    }
}
