package co.com.sofka.ordeagro.invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.*;

public class CustomerCreated extends DomainEvent {
    private final CustomerId customerId;
    private final Name name;
    private final Address address;
    private final Phone phone;
    private final Email email;

    public CustomerCreated(CustomerId customerId, Name name, Address address, Phone phone, Email email) {
        super("ordeagro.sofka.customercreated");
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public CustomerId customerId() {
        return customerId;
    }

    public Name name() {
        return name;
    }

    public Address address() {
        return address;
    }

    public Phone phone() {
        return phone;
    }

    public Email email() {
        return email;
    }
}
