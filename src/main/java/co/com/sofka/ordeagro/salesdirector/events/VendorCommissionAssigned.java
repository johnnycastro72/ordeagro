package co.com.sofka.ordeagro.salesdirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.shared.VendorId;

public class VendorCommissionAssigned extends DomainEvent {
    private final VendorId vendorId;
    private final CommissionId commissionId;

    public VendorCommissionAssigned(VendorId vendorId, CommissionId commissionId) {
        super("ordeagro.sofka.vendorcommissionassigned");
        this.vendorId = vendorId;
        this.commissionId = commissionId;
    }

    public VendorId vendorId() {
        return vendorId;
    }

    public CommissionId commissionId() {
        return commissionId;
    }
}
