package co.com.sofka.ordeagro.warehousedirector.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.ordeagro.shared.VendorId;

public class WareHouseDirectorId extends Identity {

    public WareHouseDirectorId() {
    }

    private WareHouseDirectorId(String id) {
        super(id);
    }

    public static WareHouseDirectorId of(String id) {
        return new WareHouseDirectorId(id);
    }

}
