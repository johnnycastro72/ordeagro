package co.com.sofka.ordeagro.invoice.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.*;

public class RegisterInvoice extends Command {
    private final InvoiceId invoiceId;
    private final InvoiceDate invoiceDate;
    private final InvoiceTotal invoiceTotal;
    private final CustomerId customerId;
    private final VendorId vendorId;

    public RegisterInvoice(InvoiceId invoiceId, InvoiceDate invoiceDate, InvoiceTotal invoiceTotal, CustomerId customerId, VendorId vendorId) {
        this.invoiceId = invoiceId;
        this.invoiceDate = invoiceDate;
        this.invoiceTotal = invoiceTotal;
        this.customerId = customerId;
        this.vendorId = vendorId;
    }

    public InvoiceId invoiceId() {
        return invoiceId;
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
