package UD.UnidadDeportivaUD.Modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PERIODO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Prestamo {

    @Id
    @Column(name="CONSECPRESTAMO")
    private Long CONSECPRESTAMO;

    @ManyToOne
    @JoinColumn(name="CONSECPROGRA_FKPRESTAMO")
    private Programacion programacion;
    @ManyToOne
    @JoinColumn(name="CONSECRES_FKPRESTAMO")
    private Responsable responsable;
    @ManyToOne
    @JoinColumn(name="CONSECASISRES_FKPRESTAMO")
    private Asistirresponsable asistirresponsable;
    @ManyToOne
    @JoinColumn(name="CONSECELEMENTO_FKPRESTAMO")
    private ElemenDeportivo elemenDeportivo;
}
