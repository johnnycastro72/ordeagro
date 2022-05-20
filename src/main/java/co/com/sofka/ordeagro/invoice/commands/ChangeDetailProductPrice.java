package co.com.sofka.ordeagro.invoice.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.InvoiceId;
import co.com.sofka.ordeagro.shared.Price;
import co.com.sofka.ordeagro.invoice.values.ProductId;

public class ChangeDetailProductPrice extends Command {
    private final InvoiceId invoiceId;
    private final ProductId productId;
    private final Price price;

    public ChangeDetailProductPrice(InvoiceId invoiceId, ProductId productId, Price price) {
        this.invoiceId = invoiceId;
        this.productId = productId;
        this.price = price;
    }

    public InvoiceId invoiceId() {
        return invoiceId;
    }

    public ProductId productId() {
        return productId;
    }

    public Price price() {
        return price;
    }
}
