package beum.kand.theatre.service.perfomance.impls;

import beum.kand.theatre.model.Role;
import beum.kand.theatre.repository.item.ItemMongoRepository;
import beum.kand.theatre.repository.role.RoleMongoRepository;
import beum.kand.theatre.service.role.interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PerformanceServiceImpl implements IRoleService {

    @Autowired
    RoleMongoRepository repository;
    @Override
    public Role create(Role role) {
        return null;
    }

    @Override
    public Role update(Role role) {
        return null;
    }

    @Override
    public Role get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Role> getAll() {
        return null;
    }
}
