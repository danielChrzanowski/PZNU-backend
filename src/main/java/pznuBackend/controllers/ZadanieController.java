package pznuBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pznuBackend.model.Password;
import pznuBackend.model.Zadanie;
import pznuBackend.services.ZadanieService;

import java.util.List;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class ZadanieController {
    @Autowired
    ZadanieService zadanieService;

    @GetMapping("/getAllZadania")
    public List<Zadanie> getAllZadania() {
        return zadanieService.getAllZadania();
    }

}
