package UD.UnidadDeportivaUD.Modelo;


import UD.UnidadDeportivaUD.Modelo.IDCompuestas.AsistirResponsableFK;
import UD.UnidadDeportivaUD.Modelo.IDCompuestas.AsistirResponsableID;
import UD.UnidadDeportivaUD.Modelo.IDCompuestas.Deporte_TipoElementoID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Table(name = "ASISTIRRESPONSABLE")
@AllArgsConstructor
@NoArgsConstructor
@Data
//@IdClass(AsistirResponsableID.class)
public class Asistirresponsable {



    /*@Id
    @JoinTable(
            name="AsistirResponsableJoin",
    @JoinColumns({
            @JoinColumn(name = "programacion", referencedColumnName = "CONSECPROGRA_FKASISTIRRESPONSA"),
            @JoinColumn(name = "responsable", referencedColumnName = "CONSECRES_FKASISTIRRESPONSABLE"),
            @JoinColumn(name="asistirresponsable", referencedColumnName = "CONSECASISRE")
    }))
    private AsistirResponsableID asistirResponsableID;*/



/*
    @Id
    @ManyToOne
    @JoinColumn(name="CONSECPROGRA_FKASISTIRRESPONSA")
    private Programacion programacion;
    @Id
    @ManyToOne
    @JoinColumn(name="CONSECRES_FKASISTIRRESPONSABLE")
    private Responsable responsable;
    @Id
    @Column(name="CONSECASISRE")
    private Long asistirresponsable;*/
    @EmbeddedId
    private AsistirResponsableID asistirResponsableID;


    @MapsId("consecres")
    @JoinColumns({
            @JoinColumn(name="programacion", referencedColumnName="CONSECPROGRA_FKASISTIRRESPONSA"),
            @JoinColumn(name="responsable", referencedColumnName="CONSECRES_FKASISTIRRESPONSABLE")
    })
    @ManyToOne
    public AsistirResponsableFK asistirResponsableFK;



    @Column(name="FECHAASISRES")
    private Date FECHAASISRES;
    @Column(name="HORAASISRES")
    private Date HORAASISRES;

}
