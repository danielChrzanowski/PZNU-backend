package pznuBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/addMojeZadanie")
    public void addMojeZadanie(@RequestBody MojeZadanie mojeZadanie) {
        mojeZadanieService.addMojeZadanie(mojeZadanie);
    }
}
