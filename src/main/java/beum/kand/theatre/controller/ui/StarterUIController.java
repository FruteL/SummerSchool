package beum.kand.theatre.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StarterUIController {

    @RequestMapping("/")
    public String starter(){
        return "Starter";
    }
}
