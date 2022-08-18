package beum.kand.theatre.repository.role;

import beum.kand.theatre.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RoleMongoRepository extends MongoRepository<Role, String> {
    List<Role> findAllByCreatedAtAfterAndRoleName(LocalDateTime date, String roleName);
}
