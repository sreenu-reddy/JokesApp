package com.example.jokeapp.Controller;

import com.example.jokeapp.Services.JokeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeServices jokeServices;

    @Autowired
    public JokeController(JokeServices jokeServices) {
        this.jokeServices = jokeServices;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
model.addAttribute("joke",jokeServices.getJoke());
return "chucknorris";
    }
}
