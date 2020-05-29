package pznuBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pznuBackend.model.Password;
import pznuBackend.services.PasswordService;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class PasswordController {
    @Autowired
    PasswordService passwordService;

    @GetMapping("/passwordById/{id}")
    public Password passwordById(@PathVariable int id) {
        return passwordService.passwordById(id);
    }

    @PostMapping("/changePassword")
    public void changePassword(@RequestBody Password password) {
        passwordService.changePassword(password);
    }
}
