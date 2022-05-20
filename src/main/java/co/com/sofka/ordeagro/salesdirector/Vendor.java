package co.com.sofka.ordeagro.salesdirector;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.shared.*;

import java.util.Objects;

public class Vendor extends Entity<VendorId> {

    private CommissionId commissionId;
    private Name name;
    private Address address;
    private Phone phone;
    private Email email;

    public Vendor(VendorId vendorId) {
        super(vendorId);
    }

    public Vendor(VendorId vendorId, CommissionId commissionId, Name name, Address address, Phone phone, Email email) {
        super(vendorId);
        this.commissionId = commissionId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void UpdateAddress(Address address) {

        this.address = Objects.requireNonNull(address);

    }

    public void UpdatePhone(Phone phone) {

        this.phone = Objects.requireNonNull(phone);

    }

    public void UpdateEmail(Email email) {

        this.email = Objects.requireNonNull(email);

    }

    public void UpdateCommissionId(CommissionId commissionId) {
        this.commissionId = Objects.requireNonNull(commissionId);
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
