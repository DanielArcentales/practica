/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.practica.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "dificultad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dificultad.findAll", query = "SELECT d FROM Dificultad d")
    , @NamedQuery(name = "Dificultad.findByCodDificultad", query = "SELECT d FROM Dificultad d WHERE d.codDificultad = :codDificultad")
    , @NamedQuery(name = "Dificultad.findByNombre", query = "SELECT d FROM Dificultad d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Dificultad.findByDescripcion", query = "SELECT d FROM Dificultad d WHERE d.descripcion = :descripcion")})
public class Dificultad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_DIFICULTAD")
    private Integer codDificultad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Dificultad() {
    }

    public Dificultad(Integer codDificultad) {
        this.codDificultad = codDificultad;
    }

    public Dificultad(Integer codDificultad, String nombre, String descripcion) {
        this.codDificultad = codDificultad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getCodDificultad() {
        return codDificultad;
    }

    public void setCodDificultad(Integer codDificultad) {
        this.codDificultad = codDificultad;
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
        hash += (codDificultad != null ? codDificultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dificultad)) {
            return false;
        }
        Dificultad other = (Dificultad) object;
        if ((this.codDificultad == null && other.codDificultad != null) || (this.codDificultad != null && !this.codDificultad.equals(other.codDificultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.espe.practica.model.Dificultad[ codDificultad=" + codDificultad + " ]";
    }
    
}
