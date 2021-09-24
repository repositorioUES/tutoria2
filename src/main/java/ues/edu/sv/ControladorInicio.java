

package ues.edu.sv;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ues.edu.sv.domain.Estudiante;
import ues.edu.sv.domain.MR19082;

@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ejecutando el controlador Spring MVC");
        
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Christian");
        estudiante.setApellido("Garcia");
        estudiante.setCarnet("GO11001");
        estudiante.setEmail("GO11001@ues.edu.sv");
        
        
        //mr19082 - Inicio//
        
        MR19082 mr19082 = new MR19082();
        mr19082.setNombre("Michael");
        mr19082.setApellido("Melendez");
        mr19082.setCarnet("MR19082");
        mr19082.setEmail("MR19082@ues.edu.sv");
        
        model.addAttribute("mr19082",mr19082);
        
        //mr19082 - Fin//
        
        
        model.addAttribute("estudiante", estudiante);
        return "index";
    }
    
}
