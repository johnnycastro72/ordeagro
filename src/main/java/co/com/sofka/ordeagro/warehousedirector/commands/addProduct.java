package co.com.sofka.ordeagro.warehousedirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.shared.Price;
import co.com.sofka.ordeagro.warehousedirector.values.Description;
import co.com.sofka.ordeagro.warehousedirector.values.Location;
import co.com.sofka.ordeagro.warehousedirector.values.Stock;
import co.com.sofka.ordeagro.warehousedirector.values.Unit;

public class addProduct extends Command {
    private final ProductId productId;
    private final Description description;
    private final Location location;
    private final Unit unit;
    private final Stock stock;
    private final Price price;

    public addProduct(ProductId productId, Description description, Location location, Unit unit, Stock stock, Price price) {
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
