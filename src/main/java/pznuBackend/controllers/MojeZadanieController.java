package pznuBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pznuBackend.model.MojeZadanie;
import pznuBackend.model.Zadanie;
import pznuBackend.services.MojeZadanieService;

import java.util.List;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class MojeZadanieController {
    @Autowired
    MojeZadanieService mojeZadanieService;

    @GetMapping("/getAllMojeZadania")
    public List<MojeZadanie> getAllMojeZadania() {
        return mojeZadanieService.getAllMojeZadania();
    }
}
