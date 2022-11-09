package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"", "/"})
    String getJoke(Model model) {

        model.addAttribute("theJoke", jokeService.getJoke());
        return "index";
    }
}
