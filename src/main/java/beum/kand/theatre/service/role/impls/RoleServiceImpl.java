package beum.kand.theatre.service.role.impls;

import beum.kand.theatre.model.Role;
import beum.kand.theatre.repository.role.RoleMongoRepository;
import beum.kand.theatre.service.role.interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class RoleServiceImpl implements IRoleService {
    @Autowired
    RoleMongoRepository repository;
    @Override
    public Role create(Role role) {
        role.setCreatedAt(LocalDateTime.now());
        return repository.save(role);
    }

    @Override
    public Role update(Role role) {
        role.setUpdateAt(LocalDateTime.now());
        return repository.save(role);
    }

    @Override
    public Role get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Role> getAll() {
        return repository.findAll();
    }
}
