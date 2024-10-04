/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;
/**
 *
 * @author xgall
 */
public class Consulta {
    private String nombreveterinario;
    private String diagnostico;
    private String fechaconsulta;
    private int duracionconsulta;
    private boolean prescribio;
    
    public Consulta(String nombreveterinario, String diagnostico, String fechaconsulta, int duracionconsulta, boolean prescribio) {
        setNombreveterinario(nombreveterinario);
        setDiagnostico(diagnostico);
        setFechaconsulta(fechaconsulta);
        setDuracionconsulta(duracionconsulta);
        setPrescribio(prescribio);
    }

    public Consulta() {
        
    }
    
    //geters
    public String getNombreveterinario(){
        return nombreveterinario;
    }
    
    public String getDiagnostico(){
        return diagnostico;
    }
    
    public String getFechaconsulta(){
        return fechaconsulta;
    }
    
    public int getDuracionconsulta(){
        return duracionconsulta;
    }
    
    public boolean getPrescribio(){
        return prescribio;
    }
    
    // Setters
    public void setNombreveterinario(String nombreveterinario) {
        this.nombreveterinario = nombreveterinario;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setFechaconsulta(String fechaconsulta) {
        this.fechaconsulta = fechaconsulta;
    }

    public void setDuracionconsulta(int duracionconsulta) {
        if(duracionconsulta>0){
            this.duracionconsulta = duracionconsulta;
        }else{
            throw new IllegalArgumentException("la duracion debe ser mayor a 0");
        }
        
    }

    public void setPrescribio(boolean prescribio) {
        this.prescribio = prescribio;
    }
    

    
    public void verDatos(){
        int horas = duracionconsulta/60;
        int minutos =duracionconsulta;
        if(duracionconsulta >= 60 ){
            while(duracionconsulta>=60 && minutos >= 60){
                minutos=minutos-60;
            }
        }
        System.out.println("Fecha:"+fechaconsulta+" Nombre:"+nombreveterinario+" Duracion= "+horas+":"+minutos);
    }
    
    public void changeDiagnostico(String nuevoDiagnostico){
        this.setDiagnostico(nuevoDiagnostico);
    }
        
    public String verificarLargoConsulta(){
        if(duracionconsulta>60){
            return "Fue una consulta larga";
        }else{
            return "Fue una consulta corta";
        }
    }
}

