package beum.kand.theatre.controller.ui;

import beum.kand.theatre.form.ActorForm;
import beum.kand.theatre.form.PerformanceForm;
import beum.kand.theatre.model.Actor;
import beum.kand.theatre.model.Performance;
import beum.kand.theatre.repository.actor.ActorMongoRepository;
import beum.kand.theatre.service.perfomance.impls.PerformanceServiceImpl;
import beum.kand.theatre.service.role.impls.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/performances/")
@Controller
public class PerformanceUIController {
    @Autowired
    PerformanceServiceImpl service;
    @Autowired
    RoleServiceImpl serv;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("performances", service.getAll());
        return "Performance";
    }
    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/performances/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateActor(Model model, @PathVariable("id") String id){
        Performance performance = service.get(id);
        PerformanceForm form = new PerformanceForm();
        form.setId(performance.getId());
        form.setDate(performance.getDate());
        form.setBudget(performance.getBudget());
        form.setDescription(performance.getDescription());
        form.setName(performance.getName());
        form.setUpdatedAt(performance.getUpdatedAt());
        form.setCreatedAt(performance.getCreatedAt());
        model.addAttribute("form", form);
        return "update/updatePerformance";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateActor( @ModelAttribute("form") PerformanceForm form){
        Performance performance = new Performance();
        performance.setId(form.getId());
        performance.setBudget(form.getBudget());
        performance.setDate(form.getDate());
        performance.setName(form.getName());
        performance.setDescription(form.getDescription());
        performance.setUpdatedAt(LocalDateTime.now());
        performance.setCreatedAt(form.getCreatedAt());
        service.update(performance);

        return "redirect:/ui/performances/";
    }
    @RequestMapping(value = "/roles/{id}", method = RequestMethod.GET)
    public String getRoles(Model model, @PathVariable("id") String id){
        Performance performance = service.get(id);
        model.addAttribute("roles", serv.getByPerformanceId(performance.getId()));
        return "roles";
    }
}
