package co.com.sofka.ordeagro.salesdirector.events.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.shared.VendorId;

public class AssignVendorCommission extends Command {
    private final VendorId vendorId;
    private final CommissionId commissionId;

    public AssignVendorCommission(VendorId vendorId, CommissionId commissionId) {
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
