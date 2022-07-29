package beum.kand.theatre.controller.api;
import beum.kand.theatre.model.Item;
import beum.kand.theatre.service.item.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api/v1/items/")
@RestController
public class ItemRestController {

    @Autowired
    ItemServiceImpl service;


    @RequestMapping("")
    public List<Item> showAll(){
        return service.getAll();
    }
    @RequestMapping("{id}")
    public void del(@PathVariable String id){
    }




}