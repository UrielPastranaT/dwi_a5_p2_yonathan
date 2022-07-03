package datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yonathan Uriel Pastrana Tepectzin
 */
public class Dato 
{
    private String matricula;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private double ddi;
    private double dwi;
    private double ecbd;
    private double prom;
    
    public Dato()
    {
        matricula = nombre = apellidoPaterno = apellidoMaterno = "";
        ddi = dwi = ecbd = prom = 0;
    }

    public Dato(String matricula, String nombre, String apellidoPaterno, String apellidoMaterno, double ddi, double dwi, double ecbd)
    {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno =  apellidoMaterno;
        this.ddi = ddi;
        this.dwi = dwi;
        this.ecbd = ecbd;
    }
    
    public String getMatricula()
    {
        return matricula;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getApellidoPaterno()
    {
        return apellidoPaterno;
    }
    
    public String getApellidoMaterno()
    {
        return apellidoMaterno;
    }
    
    public double getDdi()
    {
        return ddi;
    }
    
    public double getDwi()
    {
        return dwi;
    }
    
    public double getEcbd()
    {
        return ecbd;
    }
    
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setApellidoPaterno(String apellidoPaterno)
    {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno)
    {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    public void setDdi(double ddi)
    {
        this.ddi = ddi;
    }
    
    public void setDwi(double dwi)
    {
        this.dwi = dwi;
    }
    
    public void setEcbd(double ecbd)
    {
        this.ecbd = ecbd;
    }
    
    public String calcularPromedio(double ddi, double dwi, double ecbd)
    {
        String promedio;
        prom = (ddi + dwi + ecbd)/3;
        promedio = String.format("%.2f", prom);
        
        return promedio;
    }
    
}

