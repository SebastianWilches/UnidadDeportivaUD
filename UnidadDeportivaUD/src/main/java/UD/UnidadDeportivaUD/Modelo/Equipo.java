package UD.UnidadDeportivaUD.Modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EQUIPO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Equipo {

    @Id
    @Column(name="CONSEEQUIPO")
    private Long CONSEEQUIPO; //Para valores numericos usar Long
    @ManyToOne
    @JoinColumn(name="CODEMPLEADO_FKEQUIPO") //El nombre es la que aparece en el modelo oracle
    private Empleado CODEMPLEADO_FKEQUIPO;
    @ManyToOne
    @JoinColumn(name="IDDEPORTE_FKEQUIPO")
    private Deporte IDDEPORTE_FKEQUIPO;
    @Column(name="FECHARESOL")
    private Date FECHARESOL;


}
