package co.com.sofka.ordeagro.warehousedirector.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Stock implements ValueObject {

    private final Double value;

    public Stock(Double value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return value.equals(stock.value);
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
