/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloo;

/**
 *
 * @author ccu33
 */
public class Empleado extends Persona{
    private String codigo,sueldo,bonificacion,total;
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(String bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    @Override
     public void agregar(){
     System.out.println("codigo: "+ getCodigo());
     System.out.println("nombres: "+ this.getNombres());
     System.out.println("apellidos: "+ this.getApellidos());
     System.out.println("direccion: "+ this.getDireccion());
     System.out.println("telefono: "+ this.getTelefono());
     System.out.println("fecha_nacimiento: "+ this.getFecha_nacimiento());
     System.out.println("sueldo: "+ this.getSueldo());
     System.out.println("bonificacion: "+ this.getBonificacion());
     System.out.println("total: "+ this.getTotal());
     
     
     }
    
}
