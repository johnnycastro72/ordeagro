package co.com.sofka.ordeagro.salesdirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.salesdirector.values.Percentage;

public class CommissionAdded extends DomainEvent {
    private final CommissionId commissionId;
    private final Percentage percentage;

    public CommissionAdded(CommissionId commissionId, Percentage percentage) {
        super("ordeagro.sofka.commissionadded");
        this.commissionId = commissionId;
        this.percentage = percentage;
    }

    public CommissionId commissionId() {
        return commissionId;
    }

    public Percentage percentage() {
        return percentage;
    }
}
