package beum.kand.theatre.repository.contract;

import beum.kand.theatre.model.Actor;
import beum.kand.theatre.model.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ContractMongoRepository extends MongoRepository<Contract, String> {
    List<Contract> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
