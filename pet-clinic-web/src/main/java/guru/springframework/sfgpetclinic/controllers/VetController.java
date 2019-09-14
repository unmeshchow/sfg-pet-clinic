package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by uc on 9/12/2019
 */
@Controller
@RequestMapping("/vets")
public class VetController {

    @GetMapping({"", "/index", "/index.html"})
    public String listVets() {
        return "vets/index";
    }
}