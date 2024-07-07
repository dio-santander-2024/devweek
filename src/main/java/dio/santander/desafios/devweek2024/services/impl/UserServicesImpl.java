package dio.santander.desafios.devweek2024.services.impl;


import dio.santander.desafios.devweek2024.domain.model.Users;
import dio.santander.desafios.devweek2024.domain.repository.UsersRepository;
import dio.santander.desafios.devweek2024.services.UsersServices;
import dio.santander.desafios.devweek2024.services.dto.UsersDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServicesImpl implements UsersServices {

    @Autowired
    private UsersRepository usersRepository;


    @Override
    public Users findById(Long id) {
        return usersRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Users create(Users userToCreate) {
        if(usersRepository.existsByAccount_Number(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }
        Users user = new Users();
        BeanUtils.copyProperties(userToCreate, user);
        return usersRepository.save(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }
}
