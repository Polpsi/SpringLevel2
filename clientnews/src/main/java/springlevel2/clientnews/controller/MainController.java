package springlevel2.clientnews.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springlevel2.clientnews.service.MainService;

import java.util.Collections;
import java.util.Map;

@Controller
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService){
        this.mainService=mainService;
    }

    @GetMapping("/")
    public String mainNews(Model model) {
        return "main";
    }

    @GetMapping("/random")
    public String randomNews(Model model) {
        model.addAttribute("news", mainService.getRandomNews());
        System.out.println(mainService.getRandomNews());
        return "random";
    }

    @RequestMapping(value = "/js", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map jsRandomNews() {
        return Collections.singletonMap("response",mainService.getRandomNews());
    }
}
