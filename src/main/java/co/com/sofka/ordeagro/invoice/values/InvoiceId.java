package co.com.sofka.ordeagro.invoice.values;

import co.com.sofka.domain.generic.Identity;

public class InvoiceId extends Identity {

    public InvoiceId() {
    }

    private InvoiceId(String id) {
        super(id);
    }

    public static InvoiceId of(String id) {
        return new InvoiceId(id);
    }

}
