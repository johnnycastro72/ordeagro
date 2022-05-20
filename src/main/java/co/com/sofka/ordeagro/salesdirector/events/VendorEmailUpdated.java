package co.com.sofka.ordeagro.salesdirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.shared.Email;
import co.com.sofka.ordeagro.shared.VendorId;

public class VendorEmailUpdated extends DomainEvent {
    private final VendorId vendorId;
    private final Email email;

    public VendorEmailUpdated(VendorId vendorId, Email email) {
        super("ordeagro.sofka.vendoremailupdated");
        this.vendorId = vendorId;
        this.email = email;
    }

    public VendorId vendorId() {
        return vendorId;
    }

    public Email email() {
        return email;
    }
}
