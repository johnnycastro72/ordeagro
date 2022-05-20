package co.com.sofka.ordeagro.warehousedirector.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Location implements ValueObject {
    private final String value;

    public Location(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Location can't be blank");
        }

        if (this.value.length() < 4) {
            throw new IllegalArgumentException("Location must be longer than five characters");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("Location must be smaller than one hundred characters");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location that = (Location) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }

}
