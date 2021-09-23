

package ues.edu.sv;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ues.edu.sv.domain.Estudiante;
import ues.edu.sv.domain.RC15010;

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
        
        
        //RC15010 - Inicio//
        
        var rc15010 = new RC15010();
        rc15010.setNombre("Marvin");
        rc15010.setApellido("Rodriguez");
        rc15010.setCarnet("RC15010");
        rc15010.setEmail("RC15010@ues.edu.sv");
        
        model.addAttribute("rc15010",rc15010);
        
        //RC15010 - Fin//
        
        
        model.addAttribute("estudiante", estudiante);
        return "index";
    }
    
}
