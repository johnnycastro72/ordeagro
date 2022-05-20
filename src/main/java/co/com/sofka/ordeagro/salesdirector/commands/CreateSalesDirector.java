package co.com.sofka.ordeagro.salesdirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.salesdirector.values.SalesDirectorId;
import co.com.sofka.ordeagro.shared.Name;

public class CreateSalesDirector extends Command {
    private final SalesDirectorId salesDirectorId;
    private final Name name;

    public CreateSalesDirector(SalesDirectorId salesDirectorId, Name name) {
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
