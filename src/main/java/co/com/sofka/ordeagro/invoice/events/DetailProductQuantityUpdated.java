package co.com.sofka.ordeagro.invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.InvoiceId;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.invoice.values.Quantity;

public class DetailProductQuantityUpdated extends DomainEvent {
    private final InvoiceId invoiceId;
    private final ProductId productId;
    private final Quantity quantity;

    public DetailProductQuantityUpdated(InvoiceId invoiceId, ProductId productId, Quantity quantity) {
        super("ordeagro.sofka.detailproductquantityupdated");
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
