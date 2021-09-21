

package ues.edu.sv;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ues.edu.sv.domain.Estudiante;

@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ejecutando el controlador Spring MVC");
        
        var estudiante = new Estudiante();
        estudiante.setNombre("Christian");
        estudiante.setApellido("Garcia");
        estudiante.setCarnet("GO11001");
        estudiante.setEmail("GO11001@ues.edu.sv");
        
        model.addAttribute("estudiante", estudiante);
        return "index";
    }
    
}
