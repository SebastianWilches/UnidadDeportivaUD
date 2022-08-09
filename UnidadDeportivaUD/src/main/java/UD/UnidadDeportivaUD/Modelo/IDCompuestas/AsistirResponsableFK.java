package UD.UnidadDeportivaUD.Modelo.IDCompuestas;

import UD.UnidadDeportivaUD.Modelo.Programacion;
import UD.UnidadDeportivaUD.Modelo.Responsable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Entity
public class AsistirResponsableFK implements Serializable {

    @Id
    @Column (name="CONSECPROGRA_FKASISTIRRESPONSA")
    private Programacion programacion;
    @Column(name="CONSECRES_FKASISTIRRESPONSABLE")
    private Responsable responsable;
}
