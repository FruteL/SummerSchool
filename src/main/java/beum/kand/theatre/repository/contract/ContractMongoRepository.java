package beum.kand.theatre.repository.contract;

import beum.kand.theatre.model.Actor;
import beum.kand.theatre.model.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ContractMongoRepository extends MongoRepository<Contract, String> {
    List<Contract> findAllByCreatedAtAfterAndDescription(LocalDateTime date, String description);
}
