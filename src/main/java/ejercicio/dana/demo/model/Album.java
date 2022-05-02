package ejercicio.dana.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class Album {
    private String id;
    private String userId;
    private String title;


}
