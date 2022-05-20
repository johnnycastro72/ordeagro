package co.com.sofka.ordeagro.warehousedirector.events;

import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.shared.Price;
import co.com.sofka.ordeagro.warehousedirector.values.Description;
import co.com.sofka.ordeagro.warehousedirector.values.Location;
import co.com.sofka.ordeagro.warehousedirector.values.Stock;
import co.com.sofka.ordeagro.warehousedirector.values.Unit;

public class ProductAdded extends co.com.sofka.domain.generic.DomainEvent {

    private final ProductId productId;
    private final Description description;
    private final Location location;
    private final Unit unit;
    private final Stock stock;
    private final Price price;

    public ProductAdded(ProductId productId, Description description, Location location, Unit unit, Stock stock, Price price) {
        super("ordeagro.sofka.productadded");
        this.productId = productId;
        this.description = description;
        this.location = location;
        this.unit = unit;
        this.stock = stock;
        this.price = price;
    }

    public ProductId productId() {
        return productId;
    }

    public Description description() {
        return description;
    }

    public Location location() {
        return location;
    }

    public Unit unit() {
        return unit;
    }

    public Stock stock() {
        return stock;
    }

    public Price price() {
        return price;
    }
}
