package co.com.sofka.ordeagro.invoice;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ordeagro.invoice.values.*;

import java.util.Objects;

public class Customer extends Entity<CustomerId> {

    private Name name;
    private Address address;
    private Phone phone;
    private Email email;

    public Customer(CustomerId customerId) {
        super(customerId);
    }

    public Customer(CustomerId customerId, Name name, Address address, Phone phone, Email email) {
        super(customerId);
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void UpdateAddress(Address address) {

        this.address = Objects.requireNonNull(address);

    }

    public void UpdatePhone(Phone phone) {

        this.phone = Objects.requireNonNull(phone);

    }

    public void UpdateEmail(Email email) {

        this.email = Objects.requireNonNull(email);

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
