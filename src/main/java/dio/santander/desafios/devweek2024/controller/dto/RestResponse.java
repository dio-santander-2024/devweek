package dio.santander.desafios.devweek2024.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@AllArgsConstructor
@Data
public class RestResponse {

    private int status;
    private String message;
    private Object data;
    private Object error;

}
