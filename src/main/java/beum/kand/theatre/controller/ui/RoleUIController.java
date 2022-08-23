package beum.kand.theatre.controller.ui;

import beum.kand.theatre.service.actor.impls.ActorServiceImpl;
import beum.kand.theatre.service.role.impls.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/roles/")
@Controller
public class RoleUIController {
    @Autowired
    RoleServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("roles", service.getAll());
        return "roles";
    }
}
