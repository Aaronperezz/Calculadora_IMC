package com.example.imc;

import org.springframework.stereotype.Service; 

@Service
public class ImcService {

    public double calcularImc(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor a 0");
        }
        return peso / (altura * altura);
    }

    public String clasificarImc(double imc) {
        if (imc < 18.5) return "Bajo peso";
        else if (imc < 24.9) return "Peso normal";
        else if (imc < 29.9) return "Sobrepeso";
        else return "Obesidad";
    }
}
