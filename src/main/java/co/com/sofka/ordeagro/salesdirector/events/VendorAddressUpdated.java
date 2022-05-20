package co.com.sofka.ordeagro.salesdirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.shared.Address;
import co.com.sofka.ordeagro.shared.VendorId;

public class VendorAddressUpdated extends DomainEvent {
    private final VendorId vendorId;
    private final Address address;

    public VendorAddressUpdated(VendorId vendorId, Address address) {
        super("ordeagro.sofka.vendoraddressupdated");
        this.vendorId = vendorId;
        this.address = address;
    }

    public VendorId vendorId() {
        return vendorId;
    }

    public Address address() {
        return address;
    }
}
