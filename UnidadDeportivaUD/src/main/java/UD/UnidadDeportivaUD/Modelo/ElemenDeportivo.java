package UD.UnidadDeportivaUD.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ELEMENDEPORTIVO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ElemenDeportivo {
    @Id
    @Column(name="CONSECELEMENTO")
    private Long CONSECELEMENTO;

    @ManyToOne
    @JoinColumn(name="IDTIPOELEMENTO_FKELEMENDEPORTI")
    private TipoElemento IDTIPOELEMENTO_FKELEMENDEPORTI;

    @ManyToOne
    @JoinColumn(name="IDESTADO_FKELEMENDEPORTIVO")
    private Estado IDESTADO_FKELEMENDEPORTIVO;

    @ManyToOne
    @JoinColumn(name="CODESPACIO_FKELEMENDEPORTIVO")
    private Espacio CODESPACIO_FKELEMENDEPORTIVO;

    @ManyToOne
    @JoinColumn(name="IDMARCA_FKELEMENDEPORTIVO")
    private Marca IDMARCA_FKELEMENDEPORTIVO;

    @Column(name="FECHAREGISTRO")
    private Date FECHAREGISTRO;
}

