package beum.kand.theatre.controller.api;

import beum.kand.theatre.model.Contract;
import beum.kand.theatre.service.contract.impls.ContractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/contracts/")
@RestController
public class ContractRestController {
    @Autowired
    ContractServiceImpl service;

    @GetMapping("")
    public List<Contract> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Contract showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Contract insertOne(@RequestBody Contract contract){
        return service.create(contract);
    }
    @PutMapping()
    public Contract updateOne(@RequestBody Contract contract){
        return service.update(contract);
    }

}
