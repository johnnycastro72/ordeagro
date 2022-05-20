package co.com.sofka.ordeagro.shared;

import co.com.sofka.domain.generic.Identity;

public class VendorId extends Identity {

    public VendorId() {
    }

    private VendorId(String id) {
        super(id);
    }

    public static VendorId of(String id) {
        return new VendorId(id);
    }


}
