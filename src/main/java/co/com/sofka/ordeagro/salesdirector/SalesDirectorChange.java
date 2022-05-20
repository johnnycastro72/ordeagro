package co.com.sofka.ordeagro.salesdirector;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.ordeagro.salesdirector.events.*;

import java.util.HashSet;

public class SalesDirectorChange extends EventChange {
    public SalesDirectorChange(SalesDirector salesDirector) {

        apply((SalesDirectorCreated event) -> {
            salesDirector.name = event.name();
            salesDirector.commissions = new HashSet<>();
            salesDirector.vendors = new HashSet<>();
        });

        apply((CommissionAdded event) -> {
            int commissionsSize = salesDirector.commissions().size();
            if (commissionsSize == 10) {
                throw new IllegalArgumentException("You can't add more commissions, you can only have 10 of them");
            }
            salesDirector.commissions.add(new Commission(
                    event.commissionId(),
                    event.percentage()
            ));
        });

        apply((VendorAdded event) -> {
            int vendorsSize = salesDirector.vendors().size();
            if (vendorsSize == 3) {
                throw new IllegalArgumentException("You can't add more vendors, you can only have 3 of them");
            }
            salesDirector.vendors.add(new Vendor(
                    event.vendorId(),
                    event.commissionId(),
                    event.name(),
                    event.address(),
                    event.phone(),
                    event.email()
            ));
        });

        apply((CommissionPercentageUpdated event) -> {
            var commission = new Commission(event.commissionId());
            commission.UpdatePercentage(event.percentage());
        });

        apply((VendorAddressUpdated event) -> {
            var vendor = new Vendor(event.vendorId());
            vendor.UpdateAddress(event.address());
        });

        apply((VendorCommissionAssigned event) -> {
            var vendor = new Vendor(event.vendorId());
            vendor.UpdateCommissionId(event.commissionId());
        });

        apply((VendorEmailUpdated event) -> {
            var vendor = new Vendor(event.vendorId());
            vendor.UpdateEmail(event.email());
        });

        apply((VendorPhoneUpdated event) -> {
            var vendor = new Vendor(event.vendorId());
            vendor.UpdatePhone(event.phone());
        });
    }
}
