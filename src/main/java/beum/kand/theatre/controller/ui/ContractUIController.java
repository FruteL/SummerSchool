package beum.kand.theatre.controller.ui;

import beum.kand.theatre.service.contract.impls.ContractServiceImpl;
import beum.kand.theatre.service.item.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/contract/")
@Controller
public class ContractUIController {
    @Autowired
    ContractServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("contracts", service.getAll());
        return "Contract";
    }
}
