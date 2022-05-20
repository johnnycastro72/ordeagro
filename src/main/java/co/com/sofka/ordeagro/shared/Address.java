package co.com.sofka.ordeagro.shared;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Address implements ValueObject {
    private final String value;

    public Address(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Address can't be blank");
        }

        if (this.value.length() < 4) {
            throw new IllegalArgumentException("Address must be longer than five characters");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("Address must be smaller than one hundred characters");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return value.equals(address.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
