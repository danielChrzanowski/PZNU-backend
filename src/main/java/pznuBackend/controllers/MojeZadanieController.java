package pznuBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pznuBackend.model.MojeZadanie;
import pznuBackend.services.MojeZadanieService;

import java.util.List;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class MojeZadanieController {
    @Autowired
    MojeZadanieService mojeZadanieService;

    @GetMapping("/getAllMojeZadania/{id}")
    public List<MojeZadanie> getAllMojeZadania(@PathVariable int id) {
        return mojeZadanieService.getAllMojeZadania(id);
    }

    @GetMapping("/getAllZadaniaNoId")
    public List<MojeZadanie> getAllZadaniaNoId() {
        return mojeZadanieService.getAllZadaniaNoId();
    }

    @GetMapping("/getZadanieById/{id}")
    public MojeZadanie getZadanieById(@PathVariable int id) {
        return mojeZadanieService.getZadanieById(id);
    }

    @PostMapping("/addMojeZadanie")
    public void addMojeZadanie(@RequestBody MojeZadanie mojeZadanie) {
        mojeZadanieService.addMojeZadanie(mojeZadanie);
    }

    @DeleteMapping("/deleteLink/{id}")
    public void deleteLink(@PathVariable Integer id) {
        mojeZadanieService.deleteLink(id);
    }
}
