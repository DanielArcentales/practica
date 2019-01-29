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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "seguimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seguimiento.findAll", query = "SELECT s FROM Seguimiento s")
    , @NamedQuery(name = "Seguimiento.findByCodSeguimiento", query = "SELECT s FROM Seguimiento s WHERE s.codSeguimiento = :codSeguimiento")
    , @NamedQuery(name = "Seguimiento.findByCodPrograma", query = "SELECT s FROM Seguimiento s WHERE s.codPrograma = :codPrograma")
    , @NamedQuery(name = "Seguimiento.findByCodCliente", query = "SELECT s FROM Seguimiento s WHERE s.codCliente = :codCliente")
    , @NamedQuery(name = "Seguimiento.findByAvance", query = "SELECT s FROM Seguimiento s WHERE s.avance = :avance")
    , @NamedQuery(name = "Seguimiento.findByCalificacionAplicacion", query = "SELECT s FROM Seguimiento s WHERE s.calificacionAplicacion = :calificacionAplicacion")
    , @NamedQuery(name = "Seguimiento.findByTotalDuracion", query = "SELECT s FROM Seguimiento s WHERE s.totalDuracion = :totalDuracion")})
public class Seguimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_SEGUIMIENTO")
    private Integer codSeguimiento;
    @Column(name = "COD_PROGRAMA")
    private Integer codPrograma;
    @Column(name = "COD_CLIENTE")
    private Integer codCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AVANCE")
    private short avance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CALIFICACION_APLICACION")
    private short calificacionAplicacion;
    @Column(name = "TOTAL_DURACION")
    private Short totalDuracion;

    public Seguimiento() {
    }

    public Seguimiento(Integer codSeguimiento) {
        this.codSeguimiento = codSeguimiento;
    }

    public Seguimiento(Integer codSeguimiento, short avance, short calificacionAplicacion) {
        this.codSeguimiento = codSeguimiento;
        this.avance = avance;
        this.calificacionAplicacion = calificacionAplicacion;
    }

    public Integer getCodSeguimiento() {
        return codSeguimiento;
    }

    public void setCodSeguimiento(Integer codSeguimiento) {
        this.codSeguimiento = codSeguimiento;
    }

    public Integer getCodPrograma() {
        return codPrograma;
    }

    public void setCodPrograma(Integer codPrograma) {
        this.codPrograma = codPrograma;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public short getAvance() {
        return avance;
    }

    public void setAvance(short avance) {
        this.avance = avance;
    }

    public short getCalificacionAplicacion() {
        return calificacionAplicacion;
    }

    public void setCalificacionAplicacion(short calificacionAplicacion) {
        this.calificacionAplicacion = calificacionAplicacion;
    }

    public Short getTotalDuracion() {
        return totalDuracion;
    }

    public void setTotalDuracion(Short totalDuracion) {
        this.totalDuracion = totalDuracion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSeguimiento != null ? codSeguimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seguimiento)) {
            return false;
        }
        Seguimiento other = (Seguimiento) object;
        if ((this.codSeguimiento == null && other.codSeguimiento != null) || (this.codSeguimiento != null && !this.codSeguimiento.equals(other.codSeguimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.espe.practica.model.Seguimiento[ codSeguimiento=" + codSeguimiento + " ]";
    }
    
}
