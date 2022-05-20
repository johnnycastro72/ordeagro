package co.com.sofka.ordeagro.salesdirector;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.salesdirector.events.*;
import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.salesdirector.values.Percentage;
import co.com.sofka.ordeagro.salesdirector.values.SalesDirectorId;
import co.com.sofka.ordeagro.salesdirector.events.*;
import co.com.sofka.ordeagro.shared.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class SalesDirector extends AggregateEvent<SalesDirectorId> {

    protected Name name;

    protected Set<Vendor> vendors;
    protected Set<Commission> commissions;

    public SalesDirector(SalesDirectorId salesDirectorId, Name name) {
        super(salesDirectorId);
        appendChange(new SalesDirectorCreated(salesDirectorId, name)).apply();
    }

    private SalesDirector(SalesDirectorId salesDirectorId) {
        super(salesDirectorId);
        subscribe(new SalesDirectorChange(this));
    }

    public static SalesDirector from(SalesDirectorId salesDirectorId, List<DomainEvent> events) {
        var salesDirector = new SalesDirector(salesDirectorId);
        events.forEach(salesDirector::applyEvent);
        return salesDirector;
    }

    public void addVendor(VendorId vendorId, CommissionId commissionId, Name name, Address address, Phone phone, Email email) {
        Objects.requireNonNull(vendorId);
        Objects.requireNonNull(commissionId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
        Objects.requireNonNull(phone);
        Objects.requireNonNull(email);
        appendChange(new VendorAdded(vendorId, commissionId, name, address, phone, email)).apply();
    }

    public void addCommission(CommissionId commissionId, Percentage percentage) {
        Objects.requireNonNull(commissionId);
        Objects.requireNonNull(percentage);
        appendChange(new CommissionAdded(commissionId, percentage)).apply();
    }

    public void UpdateCommissionPercentage(CommissionId commissionId, Percentage percentage) {
        Objects.requireNonNull(commissionId);
        Objects.requireNonNull(percentage);
        appendChange(new CommissionPercentageUpdated(commissionId, percentage)).apply();
    }

    public void UpdateVendorAddress(VendorId vendorId, Address address) {
        Objects.requireNonNull(vendorId);
        Objects.requireNonNull(address);
        appendChange(new VendorAddressUpdated(vendorId, address)).apply();
    }

    public void UpdateVendorPhone(VendorId vendorId, Phone phone) {
        Objects.requireNonNull(vendorId);
        Objects.requireNonNull(phone);
        appendChange(new VendorPhoneUpdated(vendorId, phone)).apply();
    }

    public void UpdateVendorEmail(VendorId vendorId, Email email) {
        Objects.requireNonNull(vendorId);
        Objects.requireNonNull(email);
        appendChange(new VendorEmailUpdated(vendorId, email)).apply();
    }

    public void AssignVendorCommission(VendorId vendorId, CommissionId commissionId) {
        Objects.requireNonNull(vendorId);
        Objects.requireNonNull(commissionId);
        appendChange(new VendorCommissionAssigned(vendorId, commissionId)).apply();
    }

    protected Optional<Vendor> getVendorById(VendorId vendorId) {
        return vendors()
                .stream()
                .filter(vendor -> vendor.identity().equals(vendorId))
                .findFirst();
    }

    protected Optional<Commission> getCommissionById(CommissionId commissionId) {
        return commissions()
                .stream()
                .filter(commission -> commission.identity().equals(commissionId))
                .findFirst();
    }

    public Name name() {
        return name;
    }

    public Set<Commission> commissions() {
        return commissions;
    }

    public Set<Vendor> vendors() {
        return vendors;
    }
}
