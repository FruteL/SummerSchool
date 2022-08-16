package beum.kand.theatre.repository.role;

import beum.kand.theatre.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface RoleMongoRepository extends MongoRepository<Role, String> {
    List<Role> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
