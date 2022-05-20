package co.com.sofka.ordeagro.invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.CustomerId;
import co.com.sofka.ordeagro.invoice.values.Phone;

public class CustomerPhoneUpdated extends DomainEvent {
    private final CustomerId customerId;
    private final Phone phone;

    public CustomerPhoneUpdated(CustomerId customerId, Phone phone) {
        super("ordeagro.sofka.customerphoneupdated");
        this.customerId = customerId;
        this.phone = phone;
    }

    public CustomerId customerId() {
        return customerId;
    }

    public Phone phone() {
        return phone;
    }
}
