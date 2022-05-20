package co.com.sofka.ordeagro.invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.InvoiceId;
import co.com.sofka.ordeagro.invoice.values.Price;
import co.com.sofka.ordeagro.invoice.values.ProductId;

public class DetailProductPriceChanged extends DomainEvent {
    private final InvoiceId invoiceId;
    private final ProductId productId;
    private final Price price;

    public DetailProductPriceChanged(InvoiceId invoiceId, ProductId productId, Price price) {
        super("ordeagro.sofka.detailproductpricechanged");
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
