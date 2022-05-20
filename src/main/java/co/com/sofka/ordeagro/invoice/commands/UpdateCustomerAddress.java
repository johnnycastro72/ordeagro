package co.com.sofka.ordeagro.invoice.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.shared.Address;
import co.com.sofka.ordeagro.invoice.values.CustomerId;

public class UpdateCustomerAddress extends Command {
    private final CustomerId customerId;
    private final Address address;

    public UpdateCustomerAddress(CustomerId customerId, Address address) {
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
