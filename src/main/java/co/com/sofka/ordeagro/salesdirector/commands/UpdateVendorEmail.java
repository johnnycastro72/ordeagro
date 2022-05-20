package co.com.sofka.ordeagro.salesdirector.commands;

import co.com.sofka.ordeagro.shared.Email;
import co.com.sofka.ordeagro.shared.VendorId;

public class UpdateVendorEmail {
    private final VendorId vendorId;
    private final Email email;

    public UpdateVendorEmail(VendorId vendorId, Email email) {
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
