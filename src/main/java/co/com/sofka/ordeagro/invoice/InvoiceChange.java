package co.com.sofka.ordeagro.invoice;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.ordeagro.invoice.events.*;
import co.com.sofka.ordeagro.invoice.values.CustomerId;

public class InvoiceChange extends EventChange {
    public InvoiceChange(Invoice invoice) {

        apply((InvoiceRegistered event) -> {
            invoice.invoiceDate = event.invoiceDate();
            invoice.invoiceTotal = event.invoiceTotal();
            invoice.customerId = event.customerId();
            invoice.vendorId = event.vendorId();
        });

        apply((CustomerAddressUpdated event) -> {
            var customer = new Customer(event.customerId());
            customer.UpdateAddress(event.address());
        });

        apply((CustomerCreated event) -> {
            new Customer(event.customerId(), event.name(), event.address(), event.phone(), event.email());
        });

        apply((CustomerEmailUpdated event) -> {
            var customer = new Customer(event.customerId());
            customer.UpdateEmail(event.email());
        });

        apply((CustomerPhoneUpdated event) -> {
            var customer = new Customer(event.customerId());
            customer.UpdatePhone(event.phone());
        });

        apply((DetailProductPriceChanged event) -> {
            var detailProduct = new DetailProduct(event.invoiceId());
            detailProduct.ChangePrice(event.price());
        });

        apply((DetailProductQuantityUpdated event) -> {
            var detailProduct = new DetailProduct(event.invoiceId());
            detailProduct.UpdateQuantity(event.quantity());
        });

        apply((ProductAdded event) -> {
            new DetailProduct(event.invoiceId(), event.productId(), event.quantity(), event.price());
        });
    }
}
