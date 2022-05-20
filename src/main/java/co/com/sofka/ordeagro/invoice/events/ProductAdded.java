package co.com.sofka.ordeagro.invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.InvoiceId;
import co.com.sofka.ordeagro.invoice.values.Price;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.invoice.values.Quantity;

public class ProductAdded extends DomainEvent {
    private final InvoiceId invoiceId;
    private final ProductId productId;
    private final Quantity quantity;
    private final Price price;

    public ProductAdded(InvoiceId invoiceId, ProductId productId, Quantity quantity, Price price) {
        super("ordeagro.sofka.productadded");
        this.invoiceId = invoiceId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
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

    public Price price() {
        return price;
    }
}
