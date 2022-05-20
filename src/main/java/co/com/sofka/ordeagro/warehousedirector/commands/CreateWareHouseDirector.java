package co.com.sofka.ordeagro.warehousedirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.shared.Name;
import co.com.sofka.ordeagro.warehousedirector.values.WareHouseDirectorId;

public class CreateWareHouseDirector extends Command {
    private final WareHouseDirectorId wareHouseDirectorId;
    private final Name name;

    public CreateWareHouseDirector(WareHouseDirectorId wareHouseDirectorId, Name name) {
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
