package UD.UnidadDeportivaUD.Modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESPACIO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Espacio {

    @Id
    @Column(name="CODESPACIO")
    private String CODESPACIO;
    @Column(name="IDTIPOESPACIO_FKESPACIO")
    private String IDTIPOESPACIO_FKESPACIO;
    @Column(name="ESP_CODESPACIO_FKESPACIO")
    private String ESP_CODESPACIO_FKESPACIO;
    @Column(name="NOMESPACIO")
    private String NOMESPACIO;

}
