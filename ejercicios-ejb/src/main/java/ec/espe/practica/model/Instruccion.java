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
@Table(name = "instruccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instruccion.findAll", query = "SELECT i FROM Instruccion i")
    , @NamedQuery(name = "Instruccion.findByCodInstruccion", query = "SELECT i FROM Instruccion i WHERE i.codInstruccion = :codInstruccion")
    , @NamedQuery(name = "Instruccion.findByCodTipoInstruccion", query = "SELECT i FROM Instruccion i WHERE i.codTipoInstruccion = :codTipoInstruccion")
    , @NamedQuery(name = "Instruccion.findByCodEjercicio", query = "SELECT i FROM Instruccion i WHERE i.codEjercicio = :codEjercicio")
    , @NamedQuery(name = "Instruccion.findByRecurso", query = "SELECT i FROM Instruccion i WHERE i.recurso = :recurso")})
public class Instruccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_INSTRUCCION")
    private Integer codInstruccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_TIPO_INSTRUCCION")
    private int codTipoInstruccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_EJERCICIO")
    private int codEjercicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "RECURSO")
    private String recurso;

    public Instruccion() {
    }

    public Instruccion(Integer codInstruccion) {
        this.codInstruccion = codInstruccion;
    }

    public Instruccion(Integer codInstruccion, int codTipoInstruccion, int codEjercicio, String recurso) {
        this.codInstruccion = codInstruccion;
        this.codTipoInstruccion = codTipoInstruccion;
        this.codEjercicio = codEjercicio;
        this.recurso = recurso;
    }

    public Integer getCodInstruccion() {
        return codInstruccion;
    }

    public void setCodInstruccion(Integer codInstruccion) {
        this.codInstruccion = codInstruccion;
    }

    public int getCodTipoInstruccion() {
        return codTipoInstruccion;
    }

    public void setCodTipoInstruccion(int codTipoInstruccion) {
        this.codTipoInstruccion = codTipoInstruccion;
    }

    public int getCodEjercicio() {
        return codEjercicio;
    }

    public void setCodEjercicio(int codEjercicio) {
        this.codEjercicio = codEjercicio;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codInstruccion != null ? codInstruccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instruccion)) {
            return false;
        }
        Instruccion other = (Instruccion) object;
        if ((this.codInstruccion == null && other.codInstruccion != null) || (this.codInstruccion != null && !this.codInstruccion.equals(other.codInstruccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.espe.practica.model.Instruccion[ codInstruccion=" + codInstruccion + " ]";
    }
    
}
