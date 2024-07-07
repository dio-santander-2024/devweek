package dio.santander.desafios.devweek2024.services;

import dio.santander.desafios.devweek2024.domain.model.Users;
import dio.santander.desafios.devweek2024.services.dto.UsersDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsersServices {

    Users findById(Long id);
    Users create(Users user);

    List<Users> getAllUsers();
}
