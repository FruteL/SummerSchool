package beum.kand.theatre.controller.ui;

import beum.kand.theatre.service.role.impls.RoleServiceImpl;
import beum.kand.theatre.service.schedule.impls.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/schedule/")
@Controller
public class ScheduleUIController {
    @Autowired
    ScheduleServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("schedules", service.getAll());
        return "schedule";
    }
}
