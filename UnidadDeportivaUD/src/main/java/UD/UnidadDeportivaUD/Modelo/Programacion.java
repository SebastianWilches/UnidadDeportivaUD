package UD.UnidadDeportivaUD.Modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "PROGRAMACION")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Programacion {

    @Id
    @Column(name = "CONSECPROGRA")
    private Long CONSECPROGRA;

    @ManyToOne
    @JoinColumn(name="CODESPACIO_FKPROGRAMACION")
    private Espacio CODESPACIO_FKPROGRAMACION;

    @ManyToOne
    @JoinColumn(name="IDDEPORTE_FKPROGRAMACION")
    private Deporte IDDEPORTE_FKPROGRAMACION;

    @ManyToOne
    @JoinColumn(name="IDPERIODO_FKPROGRAMACION")
    private Periodo IDPERIODO_FKPROGRAMACION;

    @ManyToOne
    @JoinColumn(name="IDACTIVIDAD_FKPROGRAMACION")
    private Actividad IDACTIVIDAD_FKPROGRAMACION;

    @ManyToOne
    @JoinColumn(name="IDHORAINICIO_FKPROGRAMACION")
    private Hora IDHORAINICIO_FKPROGRAMACION;

    @ManyToOne
    @JoinColumn(name="IDHORAFIN_FKPROGRAMACION")
    private Hora IDHORAFIN_FKPROGRAMACION;

    @ManyToOne
    @JoinColumn(name="IDDIA_FKPROGRAMACION")
    private Dia IDDIA_FKPROGRAMACION;

    @Column(name="CUPO")
    private Long CUPO;
    @Column(name="NOINSCRITO") @Nullable
    private Long NOINSCRITO;

}
