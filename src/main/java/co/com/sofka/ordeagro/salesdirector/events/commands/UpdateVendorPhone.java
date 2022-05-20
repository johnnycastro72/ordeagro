package co.com.sofka.ordeagro.salesdirector.events.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.shared.Phone;
import co.com.sofka.ordeagro.shared.VendorId;

public class UpdateVendorPhone extends Command {
    private final VendorId vendorId;
    private final Phone phone;

    public UpdateVendorPhone(VendorId vendorId, Phone phone) {
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
