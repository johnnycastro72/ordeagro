package co.com.sofka.ordeagro.salesdirector.events.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.shared.*;

public class addVendor extends Command {
    private final VendorId vendorId;
    private final CommissionId commissionId;
    private final Name name;
    private final Address address;
    private final Phone phone;
    private final Email email;

    public addVendor(VendorId vendorId, CommissionId commissionId, Name name, Address address, Phone phone, Email email) {
        this.vendorId = vendorId;
        this.commissionId = commissionId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public VendorId vendorId() {
        return vendorId;
    }

    public CommissionId commissionId() {
        return commissionId;
    }

    public Name name() {
        return name;
    }

    public Address address() {
        return address;
    }

    public Phone phone() {
        return phone;
    }

    public Email email() {
        return email;
    }
}
