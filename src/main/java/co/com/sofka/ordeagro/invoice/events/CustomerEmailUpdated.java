package co.com.sofka.ordeagro.invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.CustomerId;
import co.com.sofka.ordeagro.invoice.values.Email;

public class CustomerEmailUpdated extends DomainEvent {
    private final CustomerId customerId;
    private final Email email;

    public CustomerEmailUpdated(CustomerId customerId, Email email) {
        super("ordeagro.sofka.customeremailupdated");
        this.customerId = customerId;
        this.email = email;
    }

    public CustomerId customerId() {
        return customerId;
    }

    public Email email() {
        return email;
    }
}
