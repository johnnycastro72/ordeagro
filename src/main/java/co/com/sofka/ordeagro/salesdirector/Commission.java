package co.com.sofka.ordeagro.salesdirector;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.salesdirector.values.Percentage;

public class Commission extends Entity<CommissionId> {
    private Percentage percentage;

    public Commission(CommissionId commissionId) {
        super(commissionId);
    }

    public Commission(CommissionId commissionId, Percentage percentage) {
        super(commissionId);
        this.percentage = percentage;
    }

    public void UpdatePercentage(Percentage percentage) {
        this.percentage = percentage;
    }

    public Percentage percentage() {
        return percentage;
    }
}
