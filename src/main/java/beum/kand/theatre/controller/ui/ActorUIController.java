package beum.kand.theatre.controller.ui;

import beum.kand.theatre.service.actor.impls.ActorServiceImpl;
import beum.kand.theatre.service.item.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/actors/")
@Controller
public class ActorUIController {
    @Autowired
    ActorServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("actors", service.getAll());
        return "actors";
    }
}
