package co.com.sofka.ordeagro.invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.CustomerId;
import co.com.sofka.ordeagro.invoice.values.InvoiceDate;
import co.com.sofka.ordeagro.invoice.values.InvoiceTotal;
import co.com.sofka.ordeagro.shared.VendorId;

public class InvoiceRegistered extends DomainEvent {

    private final InvoiceDate invoiceDate;
    private final InvoiceTotal invoiceTotal;
    private final CustomerId customerId;
    private final VendorId vendorId;

    public InvoiceRegistered(InvoiceDate invoiceDate, InvoiceTotal invoiceTotal, CustomerId customerId, VendorId vendorId) {
        super("ordeagro.sofka.invoiceregistered");
        this.invoiceDate = invoiceDate;
        this.invoiceTotal = invoiceTotal;
        this.customerId = customerId;
        this.vendorId = vendorId;
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
