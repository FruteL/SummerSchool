package beum.kand.theatre.controller.ui;

import beum.kand.theatre.form.ActorForm;
import beum.kand.theatre.model.Actor;
import beum.kand.theatre.service.actor.impls.ActorServiceImpl;
import beum.kand.theatre.service.item.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        actorForm.setExpYear(actorToUpdate.getExpYear());
        actorForm.setUpdatedAt(actorToUpdate.getUpdatedAt());
        actorForm.setCreatedAt(actorToUpdate.getCreatedAt());
        model.addAttribute("form", actorForm);
        return "updateActor";
    }
}
