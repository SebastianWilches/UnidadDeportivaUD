package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.Deporte;
import UD.UnidadDeportivaUD.Modelo.Empleado;
import UD.UnidadDeportivaUD.Repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    //Solo quiero retornar un registro
    public Optional<Empleado> getEmpleado(String CODEMPLEADO){
        return empleadoRepositorio.findById(CODEMPLEADO);
    }
    //Quiero retornar la lista entera
    public List<Empleado> getListEmpleado(){
        return empleadoRepositorio.findAll();
    }



    //Filtrar empleados por nombre
    public List<Empleado> getDocenteByNomApell(String Nom, String Apell){

        List<Empleado> empleadosByNom = empleadoRepositorio.findByNOMEMPLEADO(Nom);

        List<Empleado> empleadosByApell = new ArrayList<Empleado>(); //Este sera el resultado del filtro


        if(empleadosByNom.size()>0){
            for(int i=0; i<empleadosByNom.size(); i++){

                if(empleadosByNom.get(i).getAPELLEMPLEADO().equals(Apell)){
                    empleadosByApell.add(empleadosByNom.get(i));
                }

            }
        }


        return empleadosByApell;
    }
}
