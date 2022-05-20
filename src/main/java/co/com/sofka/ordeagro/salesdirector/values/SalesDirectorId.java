package co.com.sofka.ordeagro.salesdirector.values;

import co.com.sofka.domain.generic.Identity;

public class SalesDirectorId extends Identity {

    public SalesDirectorId() {
    }

    private SalesDirectorId(String id) {
        super(id);
    }

    public static SalesDirectorId of(String id) {
        return new SalesDirectorId(id);
    }
}
