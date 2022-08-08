package UD.UnidadDeportivaUD.Modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "ESPACIO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Espacio {

    @Id
    @Column(name="CODESPACIO")
    private String CODESPACIO;

    @ManyToOne
    @JoinColumn(name="IDTIPOESPACIO_FKESPACIO")
    private TipoEspacio IDTIPOESPACIO_FKESPACIO;

    @ManyToOne
    @JoinColumn(name="ESP_CODESPACIO_FKESPACIO")
    @Nullable //Esto se pone con los atributos que permiten valores NULL
    private Espacio ESP_CODESPACIO_FKESPACIO; //Esta es la ciclica
    @Column(name="NOMESPACIO")
    private String NOMESPACIO;

}
