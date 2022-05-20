package co.com.sofka.ordeagro.invoice.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CustomerAddressUpdated extends DomainEvent {
    public CustomerAddressUpdated() {
        super("ordeagro.sofka.customeraddressupdated");
    }
}
