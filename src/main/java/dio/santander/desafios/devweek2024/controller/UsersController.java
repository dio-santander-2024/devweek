package dio.santander.desafios.devweek2024.controller;


import dio.santander.desafios.devweek2024.domain.model.Users;
import dio.santander.desafios.devweek2024.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "api/v1/users")
@CrossOrigin(origins = "*")
public class UsersController {

    @Autowired
    private UsersServices services;



    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(services.getAllUsers());
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<Users> getById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(services.findById(id));
    }


    @PostMapping(path = "")
    public ResponseEntity<Object> create(@RequestBody Users user) {
            Users createdUser = services.create(user);
            URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(createdUser.getId())
                    .toUri();
            return ResponseEntity.created(location).body(createdUser);
    }
}
