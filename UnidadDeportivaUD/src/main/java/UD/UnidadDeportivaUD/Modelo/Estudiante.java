package UD.UnidadDeportivaUD.Modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ESTUDIANTE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Estudiante {

    @Id
    @Column(name="CODESTUDIANTE")
    private String CODESTUDIANTE;

    @ManyToOne
    @JoinColumn(name="CODESPACIO_FKESTUDIANTE")
    private Espacio CODESPACIO_FKESTUDIANTE;
    @Column(name="NOMESTUDIANTE")
    private String NOMESTUDIANTE;
    @Column(name="APELLESTUDIANTE")
    private String APELLESTUDIANTE;
    @Column(name="FECHAREGESTUDIANTE")
    private Date FECHAREGESTUDIANTE;
    @Column(name="CORREOUDESTUDIANTE")
    private String CORREOUDESTUDIANTE;
    @Column(name="FECHANACESTUDIANTE")
    private Date FECHANACESTUDIANTE;

}
