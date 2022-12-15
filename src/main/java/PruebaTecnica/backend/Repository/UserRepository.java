package PruebaTecnica.backend.Repository;

import PruebaTecnica.backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByIdentificacionContaining(String identificacion);
}
