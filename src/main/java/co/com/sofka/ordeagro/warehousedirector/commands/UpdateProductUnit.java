package co.com.sofka.ordeagro.warehousedirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.warehousedirector.values.Unit;

public class UpdateProductUnit extends Command {
    private final ProductId productId;
    private final Unit unit;

    public UpdateProductUnit(ProductId productId, Unit unit) {
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
