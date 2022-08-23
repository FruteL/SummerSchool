package beum.kand.theatre.controller.api;

import beum.kand.theatre.model.Contract;
import beum.kand.theatre.model.Performance;
import beum.kand.theatre.service.contract.impls.ContractServiceImpl;
import beum.kand.theatre.service.perfomance.impls.PerformanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/performances/")
@RestController
public class PerformanceRestController {
    @Autowired
    PerformanceServiceImpl service;

    @GetMapping("")
    public List<Performance> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Performance showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Performance insertOne(@RequestBody Performance performance){
        return service.create(performance);
    }
    @PutMapping()
    public Performance updateOne(@RequestBody Performance performance){
        return service.update(performance);
    }

}
