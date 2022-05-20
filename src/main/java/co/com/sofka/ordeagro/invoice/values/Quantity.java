package co.com.sofka.ordeagro.invoice.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Quantity  implements ValueObject {

    private final Double value;

    public Quantity(Double valor) {
        this.value = Objects.requireNonNull(valor);
    }

    @Override
    public Double value() {
        return value;
    }
}
