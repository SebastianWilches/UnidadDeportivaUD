package UD.UnidadDeportivaUD.Modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPOELEMENTO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoElemento {

    @Id
    @Column(name="IDTIPOELEMENTO")
    private String IDTIPOELEMENTO;
    @Column(name="DESCTIPOELEMENTO")
    private String DESCTIPOELEMENTO;

}
