package dio.santander.desafios.devweek2024.domain.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractNotes extends AbstractModel{
    private String icon;
    private String description;
}
