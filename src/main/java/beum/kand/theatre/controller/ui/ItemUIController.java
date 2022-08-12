package beum.kand.theatre.controller.ui;

import beum.kand.theatre.model.Item;
import beum.kand.theatre.service.item.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/ui/v1/items/")
@Controller
public class ItemUIController {
    @Autowired
    ItemServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("Items", service.getAll());
        return "items";
    }

}
