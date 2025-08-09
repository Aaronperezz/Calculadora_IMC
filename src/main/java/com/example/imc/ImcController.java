package com.example.imc;

import com.example.imc.model.ImcRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ImcController {

    @Autowired
    private ImcService imcService;

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("imcRequest", new ImcRequest());
        return "formulario";
    }

    @PostMapping("/calcular")
    public String calcularImc(@ModelAttribute ImcRequest imcRequest, Model model) {
        double imc = imcService.calcularImc(imcRequest.getPeso(), imcRequest.getAltura());
        String clasificacion = imcService.clasificarImc(imc);

        model.addAttribute("imc", imc);
        model.addAttribute("clasificacion", clasificacion);
        return "resultado";
    }
}
