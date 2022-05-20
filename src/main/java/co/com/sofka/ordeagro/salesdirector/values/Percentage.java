package co.com.sofka.ordeagro.salesdirector.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Percentage implements ValueObject {
    private final Double value;

    public Percentage(Double value) {
        this.value = Objects.requireNonNull(value, "The percentage can't be null");
        if(this.value <= 0){
            throw new IllegalArgumentException("The percentage can't be negative or zero");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Percentage that = (Percentage) o;
        return value.equals(that.value);
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
