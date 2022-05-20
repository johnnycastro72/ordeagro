package co.com.sofka.ordeagro.invoice.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.*;
import co.com.sofka.ordeagro.shared.Address;
import co.com.sofka.ordeagro.shared.Email;
import co.com.sofka.ordeagro.shared.Name;
import co.com.sofka.ordeagro.shared.Phone;

public class CreateCustomer extends Command {
    private final CustomerId customerId;
    private final Name name;
    private final Address address;
    private final Phone phone;
    private final Email email;

    public CreateCustomer(CustomerId customerId, Name name, Address address, Phone phone, Email email) {
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
