package com.example.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolaAlumnoControlador {

    @GetMapping("/muestraFormulario")
    public String muestraFormulario(){ //proporciona el formulario
        return "holaAlumnosFormulario";
    }

    @GetMapping("/procesaFormulario")
    public String procesaFormulario(@RequestParam("nombreAlumno") String nombreAlumno, Model model){
        
        model.addAttribute("nombreAlumno", nombreAlumno);
        return "holaAlumnosSpring";
    }

    
}