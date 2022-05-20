package co.com.sofka.ordeagro.warehousedirector;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.ordeagro.warehousedirector.events.*;

import java.util.HashSet;

public class WareHouseDirectorChange extends EventChange {
    public WareHouseDirectorChange(WareHouseDirector wareHouseDirector) {

        apply((WareHouseDirectorCreated event) -> {
            wareHouseDirector.name = event.name();
            wareHouseDirector.assistants = new HashSet<>();
            wareHouseDirector.products = new HashSet<>();
        });

        apply((AssistantAdded event) -> {
            int assistantSize = wareHouseDirector.assistants().size();
            if (assistantSize == 2) {
                throw new IllegalArgumentException("You can't add more assitants, you can only have 2 of them");
            }
            wareHouseDirector.assistants.add(new Assistant(
                    event.assistantId(),
                    event.name(),
                    event.role()
            ));
        });

        apply((ProductAdded event) -> {
            wareHouseDirector.products.add(new Product(
                    event.productId(),
                    event.description(),
                    event.location(),
                    event.unit(),
                    event.stock(),
                    event.price()
            ));
        });

        apply((AssistantRoleChanged event) -> {
            var assistant = new Assistant(event.assistantId());
            assistant.ChangeRole(event.role());
        });

        apply((ProductDescriptionUpdated event) -> {
            var product = new Product(event.productId());
            product.UpdateDescription(event.description());
        });

        apply((ProductLocationUpdated event) -> {
            var product = new Product(event.productId());
            product.UpdateLocation(event.location());
        });

        apply((ProductPriceChanged event) -> {
            var product = new Product(event.productId());
            product.ChangePrice(event.price());
        });

        apply((ProductUnitUpdated event) -> {
            var product = new Product(event.productId());
            product.UpdateUnit(event.unit());
        });

    }
}
