package co.com.sofka.ordeagro.invoice.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Quantity  implements ValueObject {

    private final Double value;

    public Quantity(Double value) {
        this.value = Objects.requireNonNull(value);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return value.equals(quantity.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Double value() {
        return value;
    }
}
