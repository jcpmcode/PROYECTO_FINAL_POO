/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectabase;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author chico
 */
@Entity
@Table(name = "s_polizas", catalog = "ic16jpm", schema = "")
@NamedQueries({
    @NamedQuery(name = "SPolizas.findAll", query = "SELECT s FROM SPolizas s")
    , @NamedQuery(name = "SPolizas.findByIdPoliza", query = "SELECT s FROM SPolizas s WHERE s.idPoliza = :idPoliza")
    , @NamedQuery(name = "SPolizas.findByFechaInicio", query = "SELECT s FROM SPolizas s WHERE s.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "SPolizas.findByFechaFin", query = "SELECT s FROM SPolizas s WHERE s.fechaFin = :fechaFin")})
public class SPolizas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_poliza")
    private Integer idPoliza;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    public SPolizas() {
    }

    public SPolizas(Integer idPoliza) {
        this.idPoliza = idPoliza;
    }

    public SPolizas(Integer idPoliza, Date fechaInicio, Date fechaFin) {
        this.idPoliza = idPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Integer idPoliza) {
        Integer oldIdPoliza = this.idPoliza;
        this.idPoliza = idPoliza;
        changeSupport.firePropertyChange("idPoliza", oldIdPoliza, idPoliza);
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        Date oldFechaInicio = this.fechaInicio;
        this.fechaInicio = fechaInicio;
        changeSupport.firePropertyChange("fechaInicio", oldFechaInicio, fechaInicio);
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        Date oldFechaFin = this.fechaFin;
        this.fechaFin = fechaFin;
        changeSupport.firePropertyChange("fechaFin", oldFechaFin, fechaFin);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPoliza != null ? idPoliza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SPolizas)) {
            return false;
        }
        SPolizas other = (SPolizas) object;
        if ((this.idPoliza == null && other.idPoliza != null) || (this.idPoliza != null && !this.idPoliza.equals(other.idPoliza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conectabase.SPolizas[ idPoliza=" + idPoliza + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
