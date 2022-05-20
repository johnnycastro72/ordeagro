package co.com.sofka.ordeagro.warehousedirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.shared.Price;

public class ProductPriceChanged extends DomainEvent {
    private final ProductId productId;
    private final Price price;

    public ProductPriceChanged(ProductId productId, Price price) {
        super("ordeagro.sofka.productpriceupdated");
        this.productId = productId;
        this.price = price;
    }

    public ProductId productId() {
        return productId;
    }

    public Price price() {
        return price;
    }
}
