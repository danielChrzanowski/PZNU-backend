package pznuBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pznuBackend.model.Password;
import pznuBackend.model.Zadanie;
import pznuBackend.repositories.ZadanieRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZadanieService {
    @Autowired
    ZadanieRepository zadanieRepository;

    public List<Zadanie> getAllZadania() {
        List<Zadanie> zadania = new ArrayList<>();
        zadanieRepository.findAll().forEach(zadania::add);
        return zadania;
    }

}
