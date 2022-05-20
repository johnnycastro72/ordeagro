package co.com.sofka.ordeagro.shared;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Price  implements ValueObject {
    private final Double value;

    public Price(Double value) {
        this.value = Objects.requireNonNull(value, "Product price can't be null");
        if(0>=this.value){
            throw new IllegalArgumentException("Product price can't be negative or zero");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price that = (Price) o;
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
