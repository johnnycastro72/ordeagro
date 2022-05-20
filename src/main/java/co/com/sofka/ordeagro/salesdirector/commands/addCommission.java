package co.com.sofka.ordeagro.salesdirector.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.ordeagro.salesdirector.values.CommissionId;
import co.com.sofka.ordeagro.salesdirector.values.Percentage;

public class addCommission extends Command {
    private final CommissionId commissionId;
    private final Percentage percentage;

    public addCommission(CommissionId commissionId, Percentage percentage) {
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
