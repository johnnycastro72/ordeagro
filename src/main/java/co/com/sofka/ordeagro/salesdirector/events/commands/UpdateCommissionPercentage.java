package co.com.sofka.ordeagro.salesdirector.events.commands;

import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.salesdirector.values.Percentage;

public class UpdateCommissionPercentage {
    private final CommissionId commissionId;
    private final Percentage percentage;

    public UpdateCommissionPercentage(CommissionId commissionId, Percentage percentage) {
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
