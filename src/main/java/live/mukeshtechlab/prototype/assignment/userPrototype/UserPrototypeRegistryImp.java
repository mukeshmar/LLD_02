package live.mukeshtechlab.prototype.assignment.userPrototype;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImp implements UserPrototypeRegistry {
    private Map<UserType, User> map;

    public UserPrototypeRegistryImp(){
        this.map = new HashMap<>();
    }

    @Override
    public void addPrototype(User user) {
        map.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return map.get(type);
    }

    @Override
    public User clone(UserType type) {
        return map.get(type).cloneObject();
    }
}
