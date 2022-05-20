package co.com.sofka.ordeagro.invoice;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.events.*;
import co.com.sofka.ordeagro.invoice.values.*;
import co.com.sofka.ordeagro.shared.*;

import java.util.List;

public class Invoice extends AggregateEvent<InvoiceId> {

    protected InvoiceDate invoiceDate;
    protected InvoiceTotal invoiceTotal;
    protected CustomerId customerId;
    protected VendorId vendorId;

    public Invoice(InvoiceId invoiceId, InvoiceDate invoiceDate, InvoiceTotal invoiceTotal, CustomerId customerId, VendorId vendorId) {
        super(invoiceId);
        appendChange(new InvoiceRegistered(invoiceDate, invoiceTotal, customerId, vendorId)).apply();
    }

    private Invoice(InvoiceId invoiceId) {
        super(invoiceId);
        subscribe(new InvoiceChange(this));
    }

    public static Invoice from(InvoiceId invoiceId, List<DomainEvent> events) {
        var invoice = new Invoice(invoiceId);
        events.forEach(invoice::applyEvent);
        return invoice;
    }

    public void UpdateCustomerAddress(CustomerId customerId, Address address) {
        appendChange(new CustomerAddressUpdated(customerId, address)).apply();
    }

    public void UpdateCustomerEmail(CustomerId customerId, Email email) {
        appendChange(new CustomerEmailUpdated(customerId, email)).apply();
    }

    public void UpdateCustomerPhone(CustomerId customerId, Phone phone) {
        appendChange(new CustomerPhoneUpdated(customerId, phone)).apply();
    }

    public void CreateCustomer(CustomerId customerId, Name name, Address address, Phone phone, Email email) {
        appendChange(new CustomerCreated(customerId, name, address, phone, email));
    }

    public void AddProduct(InvoiceId invoiceId, ProductId productId, Quantity quantity, Price price) {
        appendChange(new DetailProductAdded(invoiceId, productId, quantity, price)).apply();
    }

    public void UpdateDetailProductQuantity(InvoiceId invoiceId, ProductId productId, Quantity quantity) {
        appendChange(new DetailProductQuantityUpdated(invoiceId, productId, quantity)).apply();
    }

    public void ChangeDetailProductPrice(InvoiceId invoiceId, ProductId productId, Price price) {
        appendChange(new DetailProductPriceChanged(invoiceId, productId, price)).apply();
    }

    public InvoiceDate invoiceDate() {
        return invoiceDate;
    }

    public InvoiceTotal invoiceTotal() {
        return invoiceTotal;
    }

    public CustomerId customerId() {
        return customerId;
    }

    public VendorId vendorId() {
        return vendorId;
    }
}
