package beum.kand.theatre.service.role.interfaces;

import beum.kand.theatre.model.Role;

import java.util.List;

public interface IRoleService {
    Role create (Role role);
    Role update(Role role);
    Role get(String id);
    void delete(String id);
    List<Role> getAll();
}
