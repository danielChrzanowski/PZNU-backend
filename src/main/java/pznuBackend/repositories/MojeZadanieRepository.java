package pznuBackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pznuBackend.model.MojeZadanie;

import java.util.List;

public interface MojeZadanieRepository extends CrudRepository<MojeZadanie, Integer> {

    @Query(value = "SELECT * FROM PZNU_ZADANIA_ROZWIAZANE where id_uzytkownika=?1", nativeQuery = true)
    List<MojeZadanie> findAllZadaniaByUserId(int id);
}
