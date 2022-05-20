package co.com.sofka.ordeagro.warehousedirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.warehousedirector.values.Location;

public class ProductLocationUpdated extends DomainEvent {
    private final ProductId productId;
    private final Location location;

    public ProductLocationUpdated(ProductId productId, Location location) {
        super("ordeagro.sofka.productlocationupdated");
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
