package beum.kand.theatre.service.load.interfaces;

import beum.kand.theatre.model.Contract;

import java.util.List;

public interface ILoadService {
    Contract create (Contract contract);
    Contract update(Contract contract);
    Contract get(String id);
    void delete(String id);
    List<Contract> getAll();
}
