package co.com.sofka.ordeagro.invoice.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.CustomerId;
import co.com.sofka.ordeagro.invoice.values.Email;

public class UpdateCustomerEmail extends Command {
    private final CustomerId customerId;
    private final Email email;

    public UpdateCustomerEmail(CustomerId customerId, Email email) {
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
