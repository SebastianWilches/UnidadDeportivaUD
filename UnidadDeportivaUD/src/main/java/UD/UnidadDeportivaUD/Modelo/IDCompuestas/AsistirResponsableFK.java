package UD.UnidadDeportivaUD.Modelo.IDCompuestas;

import UD.UnidadDeportivaUD.Modelo.Programacion;
import UD.UnidadDeportivaUD.Modelo.Responsable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
public class AsistirResponsableFK {

    @Column (name="CONSECPROGRA_FKASISTIRRESPONSA")
    private Programacion programacion;
    @Column(name="CONSECRES_FKASISTIRRESPONSABLE")
    private Responsable responsable;
}
