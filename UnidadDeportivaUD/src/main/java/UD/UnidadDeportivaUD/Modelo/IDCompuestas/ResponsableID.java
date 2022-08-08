package UD.UnidadDeportivaUD.Modelo.IDCompuestas;


import UD.UnidadDeportivaUD.Modelo.Programacion;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class ResponsableID implements Serializable {

    private Programacion programacion;
    private Long CONSECRES;

}
