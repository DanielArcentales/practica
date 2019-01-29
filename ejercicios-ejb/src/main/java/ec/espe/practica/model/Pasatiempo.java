/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.practica.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "pasatiempo")
public class Pasatiempo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_PASATIEMPO")
    
    private Integer codPasatiempo;
    @Column(name = "NOMBRE")
    
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Pasatiempo() {
    }

    public Pasatiempo(Integer codPasatiempo) {
        this.codPasatiempo = codPasatiempo;
    }

    public Pasatiempo(Integer codPasatiempo, String nombre, String descripcion) {
        this.codPasatiempo = codPasatiempo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getCodPasatiempo() {
        return codPasatiempo;
    }

    public void setCodPasatiempo(Integer codPasatiempo) {
        this.codPasatiempo = codPasatiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPasatiempo != null ? codPasatiempo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasatiempo)) {
            return false;
        }
        Pasatiempo other = (Pasatiempo) object;
        if ((this.codPasatiempo == null && other.codPasatiempo != null) || (this.codPasatiempo != null && !this.codPasatiempo.equals(other.codPasatiempo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.espe.practica.model.Pasatiempo[ codPasatiempo=" + codPasatiempo + " ]";
    }
    
}
