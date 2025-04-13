package aprendices.repository;

import aprendices.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
