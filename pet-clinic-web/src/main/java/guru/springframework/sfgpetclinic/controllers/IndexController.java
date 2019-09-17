package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by uc on 9/12/2019
 */
@Controller
public class IndexController {

    @GetMapping({"", "/", "/index", "/index.html"})
    public String index() {
        return "index";
    }

    @GetMapping("/oups")
    public String oupsHandler() {
        return "notImplemented";
    }
}
