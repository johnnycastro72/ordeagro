package co.com.sofka.ordeagro.invoice.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InvoiceTotal  implements ValueObject {
    private final Double value;

    public InvoiceTotal(Double value) {
        this.value = Objects.requireNonNull(value, "Invoice total can't be null");
        if(0>=this.value){
            throw new IllegalArgumentException("Invoice total can't be negative or zero");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceTotal that = (InvoiceTotal) o;
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
