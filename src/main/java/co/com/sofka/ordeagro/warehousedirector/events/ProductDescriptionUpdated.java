package co.com.sofka.ordeagro.warehousedirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.warehousedirector.values.Description;

public class ProductDescriptionUpdated extends DomainEvent {
    private final ProductId productId;
    private final Description description;

    public ProductDescriptionUpdated(ProductId productId, Description description) {
        super("ordeagro.sofka.productdescriptionupdated");
        this.productId = productId;
        this.description = description;
    }

    public ProductId productId() {
        return productId;
    }

    public Description description() {
        return description;
    }
}
