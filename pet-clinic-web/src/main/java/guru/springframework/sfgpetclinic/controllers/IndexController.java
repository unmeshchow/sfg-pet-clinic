package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by uc on 9/12/2019
 */
@Controller
public class IndexController {

    @GetMapping({"", "/"})
    public String index() {
        return "index";
    }
}
