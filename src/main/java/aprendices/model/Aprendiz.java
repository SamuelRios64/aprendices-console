package aprendices.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "aprendices")

public class Aprendiz {
    @Id
    @Column(name = "id_aprendiz")
    private Integer idAprendiz;
    private String nombre;
    private Integer edad;
    private String genero;
    private String correo;
}
