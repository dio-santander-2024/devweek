package dio.santander.desafios.devweek2024.services.dto;

import dio.santander.desafios.devweek2024.domain.model.Account;
import lombok.Data;


@Data
public class UsersDto {

    private String nome;

    private Account account;
}
