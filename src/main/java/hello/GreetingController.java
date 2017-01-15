package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/home")
    public String index() {
        return "index";
    }

    @RequestMapping("/schedule")
    public String schedule() {
        return "schedule";
    }

    @RequestMapping("/wellnessstory")
    public String wellnessstory() {
        return "wellnessstory";
    }

    @RequestMapping("/lifelogistics")
    public String lifelogistics() {
        return "lifelogistics";
    }
}