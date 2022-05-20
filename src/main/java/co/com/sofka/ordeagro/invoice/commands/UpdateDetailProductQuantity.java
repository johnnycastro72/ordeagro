package co.com.sofka.ordeagro.invoice.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.InvoiceId;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.invoice.values.Quantity;

public class UpdateDetailProductQuantity extends Command {
    private final InvoiceId invoiceId;
    private final ProductId productId;
    private final Quantity quantity;

    public UpdateDetailProductQuantity(InvoiceId invoiceId, ProductId productId, Quantity quantity) {
        this.invoiceId = invoiceId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public InvoiceId invoiceId() {
        return invoiceId;
    }

    public ProductId productId() {
        return productId;
    }

    public Quantity quantity() {
        return quantity;
    }
}
