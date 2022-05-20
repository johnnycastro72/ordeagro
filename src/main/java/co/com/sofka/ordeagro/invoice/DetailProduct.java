package co.com.sofka.ordeagro.invoice;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ordeagro.invoice.values.InvoiceId;
import co.com.sofka.ordeagro.invoice.values.Price;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.invoice.values.Quantity;

import java.util.Objects;

public class DetailProduct extends Entity<InvoiceId> {

    private ProductId productId;
    private Quantity quantity;
    private Price price;

    public DetailProduct(InvoiceId invoiceId, ProductId productId, Quantity quantity, Price price) {
        super(invoiceId);
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public void UpdateQuantity(Quantity quantity) {
        this.quantity = Objects.requireNonNull(quantity);
    }

    public void ChangePrice(Price price) {
        this.price = Objects.requireNonNull(price);
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
