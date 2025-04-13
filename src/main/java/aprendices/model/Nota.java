package aprendices.model;

import jakarta.persistence.*;

@Entity
@Table(name = "notas")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nota")
    private Integer idNota;

    // Mapeo de la llave foránea a Aprendiz
    @ManyToOne
    @JoinColumn(name = "id_cliente") // nombre de la columna en la tabla 'notas'
    private Aprendiz aprendiz;

    // Mapeo de la llave foránea a Materia
    @ManyToOne
    @JoinColumn(name = "id_materia") // nombre de la columna en la tabla 'notas'
    private Materia materia;

    private Float nota;

}