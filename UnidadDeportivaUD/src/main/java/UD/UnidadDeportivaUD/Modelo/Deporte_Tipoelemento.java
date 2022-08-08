package UD.UnidadDeportivaUD.Modelo;


import UD.UnidadDeportivaUD.Modelo.IDCompuestas.Deporte_TipoElementoID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "DEPORTE_TIPOELEMENTO")
@AllArgsConstructor
@NoArgsConstructor
@Data
@IdClass(Deporte_TipoElementoID.class)
public class Deporte_Tipoelemento {

    @Id
    @ManyToOne
    @JoinColumn(name= "IDTIPOELEMENTO_FKDEPORTE_TIPOE")
    private TipoElemento IDTIPOELEMENTO_FKDEPORTE_TIPOE;
    @Id
    @ManyToOne
    @JoinColumn(name="IDDEPORTE_FKDEPORTE_TIPOELEMEN")
    private Deporte IDDEPORTE_FKDEPORTE_TIPOELEMEN;


}
