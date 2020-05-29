package pznuBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pznuBackend.model.LoggedUser;
import pznuBackend.services.LoggedUserService;

@RestController
public class LoggedUserController {
    @Autowired
    LoggedUserService loggedUserService;

    @GetMapping("/userByIdNoPassword/{id}")
    public LoggedUser userByIdNoPassword(@PathVariable int id) {
        return loggedUserService.userByIdNoPassword(id);
    }

}
