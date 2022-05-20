package co.com.sofka.ordeagro.warehousedirector.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Description implements ValueObject {
    private final String value;

    public Description(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Description can't be blank");
        }

        if (this.value.length() < 4) {
            throw new IllegalArgumentException("Description must be longer than five characters");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("Description must be smaller than one hundred characters");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Description that = (Description) o;
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
