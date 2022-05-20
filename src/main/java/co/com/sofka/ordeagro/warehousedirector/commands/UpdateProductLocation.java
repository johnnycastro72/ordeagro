package co.com.sofka.ordeagro.warehousedirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.warehousedirector.values.Location;

public class UpdateProductLocation extends Command {
    private final ProductId productId;
    private final Location location;

    public UpdateProductLocation(ProductId productId, Location location) {
        this.productId = productId;
        this.location = location;
    }

    public ProductId productId() {
        return productId;
    }

    public Location location() {
        return location;
    }
}
