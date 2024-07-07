package dio.santander.desafios.devweek2024.domain.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name= "tb_account")
public class Account  extends AbstractModel {

    @Column(unique = true, nullable = false)
    private String number;
    private String agency;
    @Column(scale = 13, precision = 2, nullable = false)
    private BigDecimal balance;
    @Column(name = "acc_limit", scale = 13, precision = 2, nullable = false)
    private BigDecimal limit;
}
