package beum.kand.theatre.service.contract.impls;

import beum.kand.theatre.model.Contract;
import beum.kand.theatre.repository.contract.ContractMongoRepository;
import beum.kand.theatre.repository.item.ItemMongoRepository;
import beum.kand.theatre.service.contract.interfaces.IContractService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContractServiceImpl implements IContractService {

    @Autowired
    ContractMongoRepository repository;

    @Override
    public Contract create(Contract contract) {
        return null;
    }

    @Override
    public Contract update(Contract contract) {
        return null;
    }

    @Override
    public Contract get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Contract> getAll() {
        return null;
    }
}
