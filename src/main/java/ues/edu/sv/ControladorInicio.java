

package ues.edu.sv;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ues.edu.sv.domain.Estudiante;
import ues.edu.sv.domain.MR19082;
import ues.edu.sv.domain.QP19001;

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
        
        model.addAttribute("estudiante", estudiante);
        
        
        //mr19082 - Inicio//
        
        MR19082 mr19082 = new MR19082();
        mr19082.setNombre("Michael");
        mr19082.setApellido("Melendez");
        mr19082.setCarnet("MR19082");
        mr19082.setEmail("MR19082@ues.edu.sv");
        
        model.addAttribute("mr19082",mr19082);
        
        //mr19082 - Fin//
        
        //QP19001 - Inicio
        
        QP19001 qp19001 = new QP19001();
        qp19001.setNombre("Herberth");
        qp19001.setApellido("Quintanilla");
        qp19001.setCarnet("QP19001");
        qp19001.setEmail("qp19001@ues.edu.sv");
        
        model.addAttribute("qp19001",qp19001);
        
        //QP19001 - Fin
        
        return "index";
    }
    
}
