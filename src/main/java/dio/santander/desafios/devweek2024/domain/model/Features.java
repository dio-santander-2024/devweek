package dio.santander.desafios.devweek2024.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "tb_features")
public class Features extends AbstractNotes {
}
