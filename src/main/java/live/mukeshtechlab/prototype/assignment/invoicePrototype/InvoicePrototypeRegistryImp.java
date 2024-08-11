package live.mukeshtechlab.prototype.assignment.invoicePrototype;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImp implements InvoicePrototypeRegistry {
    private Map<InvoiceType, Invoice> map;
    public InvoicePrototypeRegistryImp(){
        this.map = new HashMap<>();
    }

    @Override
    public void addPrototype(Invoice user) {
        map.put(user.getType(), user);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return map.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return map.get(type).cloneObject();
    }
}
