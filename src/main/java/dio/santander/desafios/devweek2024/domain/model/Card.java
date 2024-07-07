package dio.santander.desafios.devweek2024.domain.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "tb_card")
public class Card extends AbstractModel {


    @Column(unique = true, nullable = false)
    private String number;
    @Column(name = "card_limit", scale = 13, precision = 2, nullable = false)
    private BigDecimal limit;
}
