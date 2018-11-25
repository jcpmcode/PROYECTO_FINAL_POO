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
@Table(name = "s_siniestros", catalog = "ic16jpm", schema = "")
@NamedQueries({
    @NamedQuery(name = "SSiniestros.findAll", query = "SELECT s FROM SSiniestros s")
    , @NamedQuery(name = "SSiniestros.findByIdSiniestro", query = "SELECT s FROM SSiniestros s WHERE s.idSiniestro = :idSiniestro")
    , @NamedQuery(name = "SSiniestros.findByIdPoliza", query = "SELECT s FROM SSiniestros s WHERE s.idPoliza = :idPoliza")
    , @NamedQuery(name = "SSiniestros.findByFechaHora", query = "SELECT s FROM SSiniestros s WHERE s.fechaHora = :fechaHora")
    , @NamedQuery(name = "SSiniestros.findByCalle", query = "SELECT s FROM SSiniestros s WHERE s.calle = :calle")
    , @NamedQuery(name = "SSiniestros.findByNumCalle", query = "SELECT s FROM SSiniestros s WHERE s.numCalle = :numCalle")
    , @NamedQuery(name = "SSiniestros.findByColonia", query = "SELECT s FROM SSiniestros s WHERE s.colonia = :colonia")
    , @NamedQuery(name = "SSiniestros.findByDelegacion", query = "SELECT s FROM SSiniestros s WHERE s.delegacion = :delegacion")
    , @NamedQuery(name = "SSiniestros.findByEstado", query = "SELECT s FROM SSiniestros s WHERE s.estado = :estado")
    , @NamedQuery(name = "SSiniestros.findByIdAjustador", query = "SELECT s FROM SSiniestros s WHERE s.idAjustador = :idAjustador")})
public class SSiniestros implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_siniestro")
    private Integer idSiniestro;
    @Column(name = "id_poliza")
    private Integer idPoliza;
    @Basic(optional = false)
    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @Column(name = "calle")
    private String calle;
    @Basic(optional = false)
    @Column(name = "num_calle")
    private int numCalle;
    @Basic(optional = false)
    @Column(name = "colonia")
    private String colonia;
    @Basic(optional = false)
    @Column(name = "delegacion")
    private String delegacion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Column(name = "id_ajustador")
    private Integer idAjustador;

    public SSiniestros() {
    }

    public SSiniestros(Integer idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public SSiniestros(Integer idSiniestro, Date fechaHora, String calle, int numCalle, String colonia, String delegacion, String estado) {
        this.idSiniestro = idSiniestro;
        this.fechaHora = fechaHora;
        this.calle = calle;
        this.numCalle = numCalle;
        this.colonia = colonia;
        this.delegacion = delegacion;
        this.estado = estado;
    }

    public Integer getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(Integer idSiniestro) {
        Integer oldIdSiniestro = this.idSiniestro;
        this.idSiniestro = idSiniestro;
        changeSupport.firePropertyChange("idSiniestro", oldIdSiniestro, idSiniestro);
    }

    public Integer getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Integer idPoliza) {
        Integer oldIdPoliza = this.idPoliza;
        this.idPoliza = idPoliza;
        changeSupport.firePropertyChange("idPoliza", oldIdPoliza, idPoliza);
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        Date oldFechaHora = this.fechaHora;
        this.fechaHora = fechaHora;
        changeSupport.firePropertyChange("fechaHora", oldFechaHora, fechaHora);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        String oldCalle = this.calle;
        this.calle = calle;
        changeSupport.firePropertyChange("calle", oldCalle, calle);
    }

    public int getNumCalle() {
        return numCalle;
    }

    public void setNumCalle(int numCalle) {
        int oldNumCalle = this.numCalle;
        this.numCalle = numCalle;
        changeSupport.firePropertyChange("numCalle", oldNumCalle, numCalle);
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        String oldColonia = this.colonia;
        this.colonia = colonia;
        changeSupport.firePropertyChange("colonia", oldColonia, colonia);
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        String oldDelegacion = this.delegacion;
        this.delegacion = delegacion;
        changeSupport.firePropertyChange("delegacion", oldDelegacion, delegacion);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public Integer getIdAjustador() {
        return idAjustador;
    }

    public void setIdAjustador(Integer idAjustador) {
        Integer oldIdAjustador = this.idAjustador;
        this.idAjustador = idAjustador;
        changeSupport.firePropertyChange("idAjustador", oldIdAjustador, idAjustador);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSiniestro != null ? idSiniestro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SSiniestros)) {
            return false;
        }
        SSiniestros other = (SSiniestros) object;
        if ((this.idSiniestro == null && other.idSiniestro != null) || (this.idSiniestro != null && !this.idSiniestro.equals(other.idSiniestro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conectabase.SSiniestros[ idSiniestro=" + idSiniestro + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
