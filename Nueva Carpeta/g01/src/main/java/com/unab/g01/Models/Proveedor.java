
package com.unab.g01.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Table
@Entity(name="proveedor")
public class Proveedor implements Serializable{
    
    @Id
    @Column(name="id_proveedor")
    private int id_proveedor;
    @Column(name="nombre_proveedor")
    private String nombre_proveedor;
    @Column(name="email_proveedor")
    private String email_proveedor;

    public Proveedor(int id_proveedor, String nombre_proveedor, String email_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.email_proveedor = email_proveedor;
    }

    public Proveedor() {
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getEmail_proveedor() {
        return email_proveedor;
    }

    public void setEmail_proveedor(String email_proveedor) {
        this.email_proveedor = email_proveedor;
    }
    
    
    
}
