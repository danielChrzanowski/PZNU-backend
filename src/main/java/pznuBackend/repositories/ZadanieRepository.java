package pznuBackend.repositories;

import org.springframework.data.repository.CrudRepository;
import pznuBackend.model.Zadanie;

public interface ZadanieRepository extends CrudRepository<Zadanie, Integer> {
}
