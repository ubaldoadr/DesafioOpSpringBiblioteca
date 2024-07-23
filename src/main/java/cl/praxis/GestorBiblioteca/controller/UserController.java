package cl.praxis.GestorBiblioteca.controller;

import cl.praxis.GestorBiblioteca.model.dto.User;
import cl.praxis.GestorBiblioteca.sevice.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
public String createUser (User user, Model model) {

        model.addAllAttributes();

return "user";
}
}
