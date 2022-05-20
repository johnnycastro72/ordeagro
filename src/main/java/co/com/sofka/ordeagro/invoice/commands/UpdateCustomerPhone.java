package co.com.sofka.ordeagro.invoice.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.invoice.values.CustomerId;
import co.com.sofka.ordeagro.shared.Phone;

public class UpdateCustomerPhone extends Command {
    private final CustomerId customerId;
    private final Phone phone;

    public UpdateCustomerPhone(CustomerId customerId, Phone phone) {
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
