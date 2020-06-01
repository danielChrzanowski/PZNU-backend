package pznuBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pznuBackend.model.MojeZadanie;
import pznuBackend.model.User;
import pznuBackend.model.Zadanie;
import pznuBackend.repositories.MojeZadanieRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MojeZadanieService {
    @Autowired
    MojeZadanieRepository mojeZadanieRepository;

    public List<MojeZadanie> getAllMojeZadania() {
        List<MojeZadanie> mojeZadania = new ArrayList<>();
        mojeZadanieRepository.findAll().forEach(mojeZadania::add);
        return mojeZadania;
    }

    public void addMojeZadanie(MojeZadanie mojeZadanie) {
        mojeZadanieRepository.save(mojeZadanie);
    }

}
