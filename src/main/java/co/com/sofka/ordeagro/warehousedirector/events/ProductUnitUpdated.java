package co.com.sofka.ordeagro.warehousedirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.warehousedirector.values.Unit;

public class ProductUnitUpdated extends DomainEvent {
    private final ProductId productId;
    private final Unit unit;

    public ProductUnitUpdated(ProductId productId, Unit unit) {
        super("ordeagro.sofka.productunitupdated");
        this.productId = productId;
        this.unit = unit;
    }

    public ProductId productId() {
        return productId;
    }

    public Unit unit() {
        return unit;
    }
}
