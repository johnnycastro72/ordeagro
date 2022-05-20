package co.com.sofka.ordeagro.salesdirector.events.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.shared.Address;
import co.com.sofka.ordeagro.shared.VendorId;

public class UpdateVendorAddress extends Command {
    private final VendorId vendorId;
    private final Address address;

    public UpdateVendorAddress(VendorId vendorId, Address address) {
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
