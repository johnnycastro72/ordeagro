package co.com.sofka.ordeagro.warehousedirector.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Role implements ValueObject {
    private final String value;

    public Role(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Role can't be blank");
        }

        if (this.value.length() < 4) {
            throw new IllegalArgumentException("Role must be longer than five characters");
        }

        if (this.value.length() > 50) {
            throw new IllegalArgumentException("Role must be smaller than fifty characters");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return value.equals(role.value);
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
