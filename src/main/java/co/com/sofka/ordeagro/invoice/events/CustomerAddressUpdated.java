package co.com.sofka.ordeagro.invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.shared.Address;
import co.com.sofka.ordeagro.invoice.values.CustomerId;

public class CustomerAddressUpdated extends DomainEvent {
    private final CustomerId customerId;
    private final Address address;

    public CustomerAddressUpdated(CustomerId customerId, Address address) {
        super("ordeagro.sofka.customeraddressupdated");
        this.customerId = customerId;
        this.address = address;
    }

    public CustomerId customerId() {
        return customerId;
    }

    public Address address() {
        return address;
    }
}
