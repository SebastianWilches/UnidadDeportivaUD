package UD.UnidadDeportivaUD.Modelo;

import UD.UnidadDeportivaUD.Modelo.IDCompuestas.Espacio_DeporteID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ESPACIO_DEPORTE")
@AllArgsConstructor
@NoArgsConstructor
@Data
@IdClass(Espacio_DeporteID.class)
public class Espacio_Deporte {

    @Id
    @ManyToOne
    @JoinColumn(name="IDDEPORTE_FKESPACIO_DEPORTE")
    private Deporte IDDEPORTE_FKESPACIO_DEPORTE;
    @Id
    @ManyToOne
    @JoinColumn(name="CODESPACIO_FKESPACIO_DEPORTE")
    private Espacio CODESPACIO_FKESPACIO_DEPORTE;

}
