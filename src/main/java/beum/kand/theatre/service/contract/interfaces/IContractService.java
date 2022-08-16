package beum.kand.theatre.service.contract.interfaces;

import beum.kand.theatre.model.Actor;
import beum.kand.theatre.model.Contract;

import java.util.List;

public interface IContractService {
    Contract create (Contract contract);
    Contract update(Contract contract);
    Contract get(String id);
    void delete(String id);
    List<Contract> getAll();
}
