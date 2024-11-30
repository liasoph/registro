package registro.Persistence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registro.Persistence.entity.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

}
