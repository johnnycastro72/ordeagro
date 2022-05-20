package co.com.sofka.ordeagro.warehousedirector;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ordeagro.invoice.values.ProductId;
import co.com.sofka.ordeagro.shared.Name;
import co.com.sofka.ordeagro.shared.Price;
import co.com.sofka.ordeagro.warehousedirector.events.*;
import co.com.sofka.ordeagro.warehousedirector.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class WareHouseDirector extends AggregateEvent<WareHouseDirectorId> {

    protected Name name;

    protected Set<Product> products;

    protected Set<Assistant> assistants;

    public WareHouseDirector(WareHouseDirectorId wareHouseDirectorId, Name name) {
        super(wareHouseDirectorId);
        this.name = name;
        appendChange( new WareHouseDirectorCreated(wareHouseDirectorId, name)).apply();
    }

    private WareHouseDirector(WareHouseDirectorId wareHouseDirectorId) {
        super(wareHouseDirectorId);
        subscribe(new WareHouseDirectorChange(this));
    }

    public static WareHouseDirector from(WareHouseDirectorId wareHouseDirectorId, List<DomainEvent> events) {
        var wareHouseDirector = new WareHouseDirector(wareHouseDirectorId);
        events.forEach(wareHouseDirector::applyEvent);
        return wareHouseDirector;
    }

    public void addProduct(ProductId productId, Description description, Location location, Unit unit, Stock stock, Price price) {
        Objects.requireNonNull(productId);
        Objects.requireNonNull(description);
        Objects.requireNonNull(location);
        Objects.requireNonNull(unit);
        Objects.requireNonNull(stock);
        Objects.requireNonNull(price);
        appendChange(new ProductAdded(productId, description, location, unit, stock, price)).apply();
    }

    public void addAssistant(AssistantId assistantId, Name name, Role role) {
        Objects.requireNonNull(assistantId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(role);
        appendChange(new AssistantAdded(assistantId, name, role)).apply();
    }

    public void UpdateProductDescription(ProductId productId, Description description) {
        Objects.requireNonNull(productId);
        Objects.requireNonNull(description);
        appendChange(new ProductDescriptionUpdated(productId, description)).apply();
    }

    public void UpdateProductLocation(ProductId productId, Location location) {
        Objects.requireNonNull(productId);
        Objects.requireNonNull(location);
        appendChange(new ProductLocationUpdated(productId, location)).apply();
    }

    public void UpdateProductUnit(ProductId productId, Unit unit) {
        Objects.requireNonNull(productId);
        Objects.requireNonNull(unit);
        appendChange(new ProductUnitUpdated(productId, unit)).apply();
    }

    public void ChangeProductPrice(ProductId productId, Price price) {
        Objects.requireNonNull(productId);
        Objects.requireNonNull(price);
        appendChange(new ProductPriceChanged(productId, price)).apply();
    }

    public void ChangeAssistantRole(AssistantId assistantId, Role role) {
        Objects.requireNonNull(assistantId);
        Objects.requireNonNull(role);
        appendChange(new AssistantRoleChanged(assistantId, role)).apply();
    }

    protected Optional<Product> getProductById(ProductId productId) {
        return products()
                .stream()
                .filter(product -> product.identity().equals(productId))
                .findFirst();
    }

    protected Optional<Assistant> getAssistantById(AssistantId assistantId) {
        return assistants()
                .stream()
                .filter(assistant -> assistant.identity().equals(assistantId))
                .findFirst();
    }

    public Name name() {
        return name;
    }

    public Set<Product> products() {
        return products;
    }

    public Set<Assistant> assistants() {
        return assistants;
    }
}
