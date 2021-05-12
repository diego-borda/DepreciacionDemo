
package java.depreciacionactivo.pojo;


public class Activo {
   private String nombre;
   private float valor;
   private String tipo;
   private float valorSalvamiento;

    public Activo(String nombre, float valor, String tipo, float valorSalvamiento) {
        this.nombre = nombre;
        this.valor = valor;
        this.tipo = tipo;
        this.valorSalvamiento = valorSalvamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public float getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public float getValorSalvamiento() {
        return valorSalvamiento;
    }
    
}
