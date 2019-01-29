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
@Table(name = "tipo_instruccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoInstruccion.findAll", query = "SELECT t FROM TipoInstruccion t")
    , @NamedQuery(name = "TipoInstruccion.findByCodTipoInstruccion", query = "SELECT t FROM TipoInstruccion t WHERE t.codTipoInstruccion = :codTipoInstruccion")
    , @NamedQuery(name = "TipoInstruccion.findByNombre", query = "SELECT t FROM TipoInstruccion t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoInstruccion.findByDescripcion", query = "SELECT t FROM TipoInstruccion t WHERE t.descripcion = :descripcion")})
public class TipoInstruccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_TIPO_INSTRUCCION")
    private Integer codTipoInstruccion;
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

    public TipoInstruccion() {
    }

    public TipoInstruccion(Integer codTipoInstruccion) {
        this.codTipoInstruccion = codTipoInstruccion;
    }

    public TipoInstruccion(Integer codTipoInstruccion, String nombre, String descripcion) {
        this.codTipoInstruccion = codTipoInstruccion;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getCodTipoInstruccion() {
        return codTipoInstruccion;
    }

    public void setCodTipoInstruccion(Integer codTipoInstruccion) {
        this.codTipoInstruccion = codTipoInstruccion;
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
        hash += (codTipoInstruccion != null ? codTipoInstruccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoInstruccion)) {
            return false;
        }
        TipoInstruccion other = (TipoInstruccion) object;
        if ((this.codTipoInstruccion == null && other.codTipoInstruccion != null) || (this.codTipoInstruccion != null && !this.codTipoInstruccion.equals(other.codTipoInstruccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.espe.practica.model.TipoInstruccion[ codTipoInstruccion=" + codTipoInstruccion + " ]";
    }
    
}
