package live.mukeshtechlab.prototype.assignment.prototypeConfiguration;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImp implements ConfigurationPrototypeRegistry {
    private Map<ConfigurationType, Configuration> map;
    public ConfigurationPrototypeRegistryImp(){
        this.map = new HashMap<>();
    }

    @Override
    public void addPrototype(Configuration user) {
        ConfigurationType currentType = user.getType();
        map.put(currentType, user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return map.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return map.get(type).cloneObject();
    }
}
