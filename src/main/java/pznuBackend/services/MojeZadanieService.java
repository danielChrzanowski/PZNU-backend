package pznuBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pznuBackend.model.MojeZadanie;
import pznuBackend.repositories.MojeZadanieRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MojeZadanieService {
    @Autowired
    MojeZadanieRepository mojeZadanieRepository;

    public List<MojeZadanie> getAllMojeZadania(int id) {
        return new ArrayList<>(mojeZadanieRepository.findAllZadaniaByUserId(id));
    }

    public List<MojeZadanie> getAllZadaniaNoId() {
        List<MojeZadanie> zadanie = new ArrayList<>();
        mojeZadanieRepository.findAll().forEach(zadanie::add);
        return zadanie;
    }

    public MojeZadanie getZadanieById(int id) {
       return mojeZadanieRepository.findById(id);
    }

    public void addMojeZadanie(MojeZadanie mojeZadanie) {
        mojeZadanieRepository.save(mojeZadanie);
    }

    public void deleteLink(Integer id) {
        mojeZadanieRepository.deleteById(id);
    }
}
