package registro.Persistence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registro.Persistence.entity.Conductor;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {

}
