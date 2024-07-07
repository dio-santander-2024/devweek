package dio.santander.desafios.devweek2024.domain.repository;

import dio.santander.desafios.devweek2024.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
