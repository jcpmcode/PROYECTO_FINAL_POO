/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectabase;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "s_vehiculos_ajustadores", catalog = "ic16jpm", schema = "")
@NamedQueries({
    @NamedQuery(name = "SVehiculosAjustadores.findAll", query = "SELECT s FROM SVehiculosAjustadores s")
    , @NamedQuery(name = "SVehiculosAjustadores.findByIdVehiculoAjustadores", query = "SELECT s FROM SVehiculosAjustadores s WHERE s.idVehiculoAjustadores = :idVehiculoAjustadores")
    , @NamedQuery(name = "SVehiculosAjustadores.findByMarca", query = "SELECT s FROM SVehiculosAjustadores s WHERE s.marca = :marca")
    , @NamedQuery(name = "SVehiculosAjustadores.findByModelo", query = "SELECT s FROM SVehiculosAjustadores s WHERE s.modelo = :modelo")
    , @NamedQuery(name = "SVehiculosAjustadores.findByAnio", query = "SELECT s FROM SVehiculosAjustadores s WHERE s.anio = :anio")
    , @NamedQuery(name = "SVehiculosAjustadores.findByKilometraje", query = "SELECT s FROM SVehiculosAjustadores s WHERE s.kilometraje = :kilometraje")
    , @NamedQuery(name = "SVehiculosAjustadores.findByPlacas", query = "SELECT s FROM SVehiculosAjustadores s WHERE s.placas = :placas")})
public class SVehiculosAjustadores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vehiculo_ajustadores")
    private Integer idVehiculoAjustadores;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @Column(name = "anio")
    private String anio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "kilometraje")
    private BigDecimal kilometraje;
    @Basic(optional = false)
    @Column(name = "placas")
    private String placas;

    public SVehiculosAjustadores() {
    }

    public SVehiculosAjustadores(Integer idVehiculoAjustadores) {
        this.idVehiculoAjustadores = idVehiculoAjustadores;
    }

    public SVehiculosAjustadores(Integer idVehiculoAjustadores, String marca, String modelo, String anio, BigDecimal kilometraje, String placas) {
        this.idVehiculoAjustadores = idVehiculoAjustadores;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.placas = placas;
    }

    public Integer getIdVehiculoAjustadores() {
        return idVehiculoAjustadores;
    }

    public void setIdVehiculoAjustadores(Integer idVehiculoAjustadores) {
        Integer oldIdVehiculoAjustadores = this.idVehiculoAjustadores;
        this.idVehiculoAjustadores = idVehiculoAjustadores;
        changeSupport.firePropertyChange("idVehiculoAjustadores", oldIdVehiculoAjustadores, idVehiculoAjustadores);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        String oldAnio = this.anio;
        this.anio = anio;
        changeSupport.firePropertyChange("anio", oldAnio, anio);
    }

    public BigDecimal getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(BigDecimal kilometraje) {
        BigDecimal oldKilometraje = this.kilometraje;
        this.kilometraje = kilometraje;
        changeSupport.firePropertyChange("kilometraje", oldKilometraje, kilometraje);
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        String oldPlacas = this.placas;
        this.placas = placas;
        changeSupport.firePropertyChange("placas", oldPlacas, placas);
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
        if (!(object instanceof SVehiculosAjustadores)) {
            return false;
        }
        SVehiculosAjustadores other = (SVehiculosAjustadores) object;
        if ((this.idVehiculoAjustadores == null && other.idVehiculoAjustadores != null) || (this.idVehiculoAjustadores != null && !this.idVehiculoAjustadores.equals(other.idVehiculoAjustadores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conectabase.SVehiculosAjustadores[ idVehiculoAjustadores=" + idVehiculoAjustadores + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
