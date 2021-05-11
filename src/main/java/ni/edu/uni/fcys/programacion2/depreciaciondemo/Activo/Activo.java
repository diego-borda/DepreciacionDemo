/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.depreciaciondemo.Activo;

/**
 *
 * @author Sistemas-02
 */
public class Activo {
    private String Nombre;
    private float Valor;
    private String tipo;
    private float vSalv;

    public Activo(String Nombre, float Valor, String tipo, float vSalv) {
        this.Nombre = Nombre;
        this.Valor = Valor;
        this.tipo = tipo;
        this.vSalv = vSalv;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getValor() {
        return Valor;
    }

    public String getTipo() {
        return tipo;
    }

    public float getvSalv() {
        return vSalv;
    }
    
    
    
}
