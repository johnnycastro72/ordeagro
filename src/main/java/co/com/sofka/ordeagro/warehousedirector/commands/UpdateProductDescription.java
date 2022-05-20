package co.com.sofka.ordeagro.warehousedirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.warehousedirector.values.Description;

public class UpdateProductDescription extends Command {
    private final ProductId productId;
    private final Description description;

    public UpdateProductDescription(ProductId productId, Description description) {
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
