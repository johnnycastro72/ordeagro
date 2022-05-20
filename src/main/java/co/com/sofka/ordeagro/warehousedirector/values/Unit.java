package co.com.sofka.ordeagro.warehousedirector.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Unit implements ValueObject {
    private final String value;

    public Unit(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Measurement unit can't be blank");
        }

        if (this.value.length() > 5) {
            throw new IllegalArgumentException("Measurement unit must be smaller than five characters");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return value.equals(unit.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Object value() {
        return value;
    }
}
