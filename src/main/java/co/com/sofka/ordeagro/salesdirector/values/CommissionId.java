package co.com.sofka.ordeagro.salesdirector.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.ordeagro.shared.VendorId;

public class CommissionId extends Identity {

    public CommissionId() {
    }

    private CommissionId(String id) {
        super(id);
    }

    public static CommissionId of(String id) {
        return new CommissionId(id);
    }

}
