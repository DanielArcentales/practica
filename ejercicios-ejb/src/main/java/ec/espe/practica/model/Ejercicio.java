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
@Table(name = "ejercicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejercicio.findAll", query = "SELECT e FROM Ejercicio e")
    , @NamedQuery(name = "Ejercicio.findByCodEjercicio", query = "SELECT e FROM Ejercicio e WHERE e.codEjercicio = :codEjercicio")
    , @NamedQuery(name = "Ejercicio.findByNombre", query = "SELECT e FROM Ejercicio e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Ejercicio.findByCodDificultad", query = "SELECT e FROM Ejercicio e WHERE e.codDificultad = :codDificultad")
    , @NamedQuery(name = "Ejercicio.findByCodCategoria", query = "SELECT e FROM Ejercicio e WHERE e.codCategoria = :codCategoria")
    , @NamedQuery(name = "Ejercicio.findByCodGenero", query = "SELECT e FROM Ejercicio e WHERE e.codGenero = :codGenero")
    , @NamedQuery(name = "Ejercicio.findByCodPasatiempo", query = "SELECT e FROM Ejercicio e WHERE e.codPasatiempo = :codPasatiempo")
    , @NamedQuery(name = "Ejercicio.findByCodMaterial", query = "SELECT e FROM Ejercicio e WHERE e.codMaterial = :codMaterial")
    , @NamedQuery(name = "Ejercicio.findByCodTipoCliente", query = "SELECT e FROM Ejercicio e WHERE e.codTipoCliente = :codTipoCliente")
    , @NamedQuery(name = "Ejercicio.findByDescripcion", query = "SELECT e FROM Ejercicio e WHERE e.descripcion = :descripcion")})
public class Ejercicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_EJERCICIO")
    private Integer codEjercicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "COD_DIFICULTAD")
    private Integer codDificultad;
    @Size(max = 3)
    @Column(name = "COD_CATEGORIA")
    private String codCategoria;
    @Size(max = 1)
    @Column(name = "COD_GENERO")
    private String codGenero;
    @Column(name = "COD_PASATIEMPO")
    private Integer codPasatiempo;
    @Column(name = "COD_MATERIAL")
    private Integer codMaterial;
    @Column(name = "COD_TIPO_CLIENTE")
    private Integer codTipoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Ejercicio() {
    }

    public Ejercicio(Integer codEjercicio) {
        this.codEjercicio = codEjercicio;
    }

    public Ejercicio(Integer codEjercicio, String nombre, String descripcion) {
        this.codEjercicio = codEjercicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getCodEjercicio() {
        return codEjercicio;
    }

    public void setCodEjercicio(Integer codEjercicio) {
        this.codEjercicio = codEjercicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodDificultad() {
        return codDificultad;
    }

    public void setCodDificultad(Integer codDificultad) {
        this.codDificultad = codDificultad;
    }

    public String getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(String codGenero) {
        this.codGenero = codGenero;
    }

    public Integer getCodPasatiempo() {
        return codPasatiempo;
    }

    public void setCodPasatiempo(Integer codPasatiempo) {
        this.codPasatiempo = codPasatiempo;
    }

    public Integer getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(Integer codMaterial) {
        this.codMaterial = codMaterial;
    }

    public Integer getCodTipoCliente() {
        return codTipoCliente;
    }

    public void setCodTipoCliente(Integer codTipoCliente) {
        this.codTipoCliente = codTipoCliente;
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
        hash += (codEjercicio != null ? codEjercicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejercicio)) {
            return false;
        }
        Ejercicio other = (Ejercicio) object;
        if ((this.codEjercicio == null && other.codEjercicio != null) || (this.codEjercicio != null && !this.codEjercicio.equals(other.codEjercicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.espe.practica.model.Ejercicio[ codEjercicio=" + codEjercicio + " ]";
    }
    
}
