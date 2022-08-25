package beum.kand.theatre.controller.ui;

import beum.kand.theatre.form.ActorForm;
import beum.kand.theatre.model.Actor;
import beum.kand.theatre.service.actor.impls.ActorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

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
    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/actors/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateActor(Model model, @PathVariable("id") String id){
        Actor actorToUpdate = service.get(id);
        ActorForm actorForm = new ActorForm();
        actorForm.setId(actorToUpdate.getId());
        actorForm.setFirstName(actorToUpdate.getFirstName());
        actorForm.setSecondName(actorToUpdate.getSecondName());
        actorForm.setSurname(actorToUpdate.getSurname());
        actorForm.setRank(actorToUpdate.getRank());
        actorForm.setDiscription(actorToUpdate.getDiscription());
        actorForm.setExpYear(actorToUpdate.getExpYear());
        actorForm.setUpdatedAt(actorToUpdate.getUpdatedAt());
        actorForm.setCreatedAt(actorToUpdate.getCreatedAt());
        model.addAttribute("form", actorForm);
        return "update/updateActor";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateActor( @ModelAttribute("form") ActorForm form){
        Actor actorToUpdate = new Actor();
        actorToUpdate.setId(form.getId());
        actorToUpdate.setFirstName(form.getFirstName());
        actorToUpdate.setSecondName(form.getSecondName());
        actorToUpdate.setSurname(form.getSurname());
        actorToUpdate.setRank(form.getRank());
        actorToUpdate.setDiscription(form.getDiscription());
        actorToUpdate.setExpYear(form.getExpYear());
        actorToUpdate.setCreatedAt(form.getCreatedAt());
        actorToUpdate.setUpdatedAt(LocalDateTime.now());
        service.update(actorToUpdate);

        return "redirect:/ui/actors/";
    }
}
