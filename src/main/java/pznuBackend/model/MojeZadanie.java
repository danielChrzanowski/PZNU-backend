package pznuBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PZNU_ZADANIA_ROZWIAZANE", schema = "sky-33_Daniel")
public class MojeZadanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer id_uzytkownika;

    private String link, ocena;
}
