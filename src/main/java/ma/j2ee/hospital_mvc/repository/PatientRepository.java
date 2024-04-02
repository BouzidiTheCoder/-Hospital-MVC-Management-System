package ma.j2ee.hospital_mvc.repository;

import ma.j2ee.hospital_mvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    // Méthode pour trouver les patients par nom en utilisant la pagination
    Page<Patient> findByNameContains(String keyword, Pageable pageable);

    // Requête personnalisée pour rechercher les patients par mot-clé en utilisant la pagination
    @Query("select p from Patient p where p.name like : x")
    Page<Patient> chercher(@Param("x") String keyword, Pageable pageable);
}
