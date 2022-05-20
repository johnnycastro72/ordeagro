package co.com.sofka.ordeagro.invoice;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.events.InvoiceRegistered;
import co.com.sofka.ordeagro.invoice.values.*;

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

    public void ReverseInvoice(InvoiceId invoiceId) {

    }

}
