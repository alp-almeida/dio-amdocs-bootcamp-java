package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
}
