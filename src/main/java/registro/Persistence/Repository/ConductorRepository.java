package registro.Persistence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import registro.Persistence.entity.Conductor;

@Repository
public interface ConductorRepository extends JpaRepository<Conductor, Long> {

}
