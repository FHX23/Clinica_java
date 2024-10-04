/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinica;

/**
 *
 * @author xgall
 */
public class Clinica {

    public static void main(String[] args) {
        Consulta consulta = new Consulta("Dr. Gonzalez", "Resfriado comun", "03/10/2024", 75, true);
        Consulta consulta2 = new Consulta();
        
        System.out.println("Consulta 1 diagnostico "+consulta.getDiagnostico());
        // Usar el método changeDiagnostico para cambiar el diagnóstico
        consulta.changeDiagnostico("Gripe leve");
        System.out.println("Consulta 1 diagnostico cambiado "+consulta.getDiagnostico());
        // Usar el método verDatos para mostrar la información de la consulta
        System.out.println("Consulta 1 datos ");
        consulta.verDatos();

        // Usar el método verificarLargoConsulta para comprobar la duración
        consulta.verificarLargoConsulta();
        
        consulta2.setDiagnostico("pulgas");
        consulta2.setDuracionconsulta(10);
        consulta2.setFechaconsulta("02/10/2024");
        consulta2.setNombreveterinario("juanito");
        consulta2.setPrescribio(true);
        
        System.out.println("Consulta 2 fecha "+ consulta2.getFechaconsulta()+" duracion: "+consulta2.getDuracionconsulta());
    }
}
