package co.com.sofka.ordeagro.warehousedirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.shared.Price;

public class ChangeProductPrice extends Command {
    private final ProductId productId;
    private final Price price;

    public ChangeProductPrice(ProductId productId, Price price) {
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
