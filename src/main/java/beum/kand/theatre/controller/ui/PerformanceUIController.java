package beum.kand.theatre.controller.ui;

import beum.kand.theatre.service.perfomance.impls.PerformanceServiceImpl;
import beum.kand.theatre.service.role.impls.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/performances/")
@Controller
public class PerformanceUIController {
    @Autowired
    PerformanceServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("performances", service.getAll());
        return "Performance";
    }
}
