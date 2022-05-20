package co.com.sofka.ordeagro.salesdirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.shared.Phone;
import co.com.sofka.ordeagro.shared.VendorId;

public class VendorPhoneUpdated extends DomainEvent {
    private final VendorId vendorId;
    private final Phone phone;

    public VendorPhoneUpdated(VendorId vendorId, Phone phone) {
        super("ordeagro.sofka.vendorphoneupdated");
        this.vendorId = vendorId;
        this.phone = phone;
    }

    public VendorId vendorId() {
        return vendorId;
    }

    public Phone phone() {
        return phone;
    }
}
