package co.com.sofka.ordeagro.salesdirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.shared.*;

public class VendorAdded extends DomainEvent {
    private final VendorId vendorId;
    private final CommissionId commissionId;
    private final Name name;
    private final Address address;
    private final Phone phone;
    private final Email email;

    public VendorAdded(VendorId vendorId, CommissionId commissionId, Name name, Address address, Phone phone, Email email) {
        super("ordeagro.sofka.vendoradded");
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
