package dio.santander.desafios.devweek2024.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@Entity
@Table(name= "tb_news")
public class News extends AbstractNotes {
}
