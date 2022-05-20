package co.com.sofka.ordeagro.invoice.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class InvoiceDate  implements ValueObject {
    private final Date value;

    public InvoiceDate(Date value) {
        this.value = Objects.requireNonNull(value, "The date cannot be null");
        if(value.before(new Date(Instant.now().toEpochMilli()))){
            throw new IllegalArgumentException("The date must be after the current date");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceDate that = (InvoiceDate) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Date value() {
        return value;
    }}
