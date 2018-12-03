/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectabase;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author chico
 */
@Entity
@Table(name = "s_periodos_autos_ajustadores", catalog = "ic16jpm", schema = "")
@NamedQueries({
    @NamedQuery(name = "SPeriodosAutosAjustadores.findAll", query = "SELECT s FROM SPeriodosAutosAjustadores s")
    , @NamedQuery(name = "SPeriodosAutosAjustadores.findByIdVehiculoAjustadores", query = "SELECT s FROM SPeriodosAutosAjustadores s WHERE s.idVehiculoAjustadores = :idVehiculoAjustadores")
    , @NamedQuery(name = "SPeriodosAutosAjustadores.findByIdAjustador", query = "SELECT s FROM SPeriodosAutosAjustadores s WHERE s.idAjustador = :idAjustador")
    , @NamedQuery(name = "SPeriodosAutosAjustadores.findByFechaInicio", query = "SELECT s FROM SPeriodosAutosAjustadores s WHERE s.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "SPeriodosAutosAjustadores.findByFechaFin", query = "SELECT s FROM SPeriodosAutosAjustadores s WHERE s.fechaFin = :fechaFin")
    , @NamedQuery(name = "SPeriodosAutosAjustadores.findByPosicion", query = "SELECT s FROM SPeriodosAutosAjustadores s WHERE s.posicion = :posicion")})
public class SPeriodosAutosAjustadores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vehiculo_ajustadores")
    private Integer idVehiculoAjustadores;
    @Column(name = "id_ajustador")
    private Integer idAjustador;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    private String fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_fin")
    private String fechaFin;
    @Basic(optional = false)
    @Column(name = "posicion")
    private String posicion;

    public SPeriodosAutosAjustadores() {
    }

    public SPeriodosAutosAjustadores(Integer idVehiculoAjustadores) {
        this.idVehiculoAjustadores = idVehiculoAjustadores;
    }

    public SPeriodosAutosAjustadores(Integer idVehiculoAjustadores, String fechaInicio, String fechaFin, String posicion) {
        this.idVehiculoAjustadores = idVehiculoAjustadores;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicion = posicion;
    }

    public Integer getIdVehiculoAjustadores() {
        return idVehiculoAjustadores;
    }

    public void setIdVehiculoAjustadores(Integer idVehiculoAjustadores) {
        Integer oldIdVehiculoAjustadores = this.idVehiculoAjustadores;
        this.idVehiculoAjustadores = idVehiculoAjustadores;
        changeSupport.firePropertyChange("idVehiculoAjustadores", oldIdVehiculoAjustadores, idVehiculoAjustadores);
    }

    public Integer getIdAjustador() {
        return idAjustador;
    }

    public void setIdAjustador(Integer idAjustador) {
        Integer oldIdAjustador = this.idAjustador;
        this.idAjustador = idAjustador;
        changeSupport.firePropertyChange("idAjustador", oldIdAjustador, idAjustador);
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        String oldFechaInicio = this.fechaInicio;
        this.fechaInicio = fechaInicio;
        changeSupport.firePropertyChange("fechaInicio", oldFechaInicio, fechaInicio);
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        String oldFechaFin = this.fechaFin;
        this.fechaFin = fechaFin;
        changeSupport.firePropertyChange("fechaFin", oldFechaFin, fechaFin);
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        String oldPosicion = this.posicion;
        this.posicion = posicion;
        changeSupport.firePropertyChange("posicion", oldPosicion, posicion);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVehiculoAjustadores != null ? idVehiculoAjustadores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SPeriodosAutosAjustadores)) {
            return false;
        }
        SPeriodosAutosAjustadores other = (SPeriodosAutosAjustadores) object;
        if ((this.idVehiculoAjustadores == null && other.idVehiculoAjustadores != null) || (this.idVehiculoAjustadores != null && !this.idVehiculoAjustadores.equals(other.idVehiculoAjustadores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conectabase.SPeriodosAutosAjustadores[ idVehiculoAjustadores=" + idVehiculoAjustadores + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
