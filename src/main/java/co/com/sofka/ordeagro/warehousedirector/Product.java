package co.com.sofka.ordeagro.warehousedirector;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.shared.Price;
import co.com.sofka.ordeagro.warehousedirector.values.Description;
import co.com.sofka.ordeagro.warehousedirector.values.Location;
import co.com.sofka.ordeagro.warehousedirector.values.Stock;
import co.com.sofka.ordeagro.warehousedirector.values.Unit;

import java.util.Objects;

public class Product extends Entity<ProductId> {
    private ProductId productId;
    private Description description;
    private Location location;
    private Unit unit;
    private Stock stock;
    private Price price;

    public Product(ProductId productId) {
        super(productId);
    }

    public Product(ProductId productId, Description description, Location location, Unit unit, Stock stock, Price price) {
        super(productId);
        this.description = description;
        this.location = location;
        this.unit = unit;
        this.stock = stock;
        this.price = price;
    }

    public void UpdateDescription(Description description) {
        this.description = Objects.requireNonNull(description);
    }

    public void UpdateLocation(Location location) {
        this.location = Objects.requireNonNull(location);
    }

    public void UpdateUnit(Unit unit) {
        this.unit = Objects.requireNonNull(unit);
    }

    public void ChangePrice(Price price) {
        this.price = Objects.requireNonNull(price);
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
