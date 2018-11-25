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
@Table(name = "s_operadores_telefonicos", catalog = "ic16jpm", schema = "")
@NamedQueries({
    @NamedQuery(name = "SOperadoresTelefonicos.findAll", query = "SELECT s FROM SOperadoresTelefonicos s")
    , @NamedQuery(name = "SOperadoresTelefonicos.findByIdOperador", query = "SELECT s FROM SOperadoresTelefonicos s WHERE s.idOperador = :idOperador")
    , @NamedQuery(name = "SOperadoresTelefonicos.findByNombre", query = "SELECT s FROM SOperadoresTelefonicos s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "SOperadoresTelefonicos.findByApPaterno", query = "SELECT s FROM SOperadoresTelefonicos s WHERE s.apPaterno = :apPaterno")
    , @NamedQuery(name = "SOperadoresTelefonicos.findByApMaterno", query = "SELECT s FROM SOperadoresTelefonicos s WHERE s.apMaterno = :apMaterno")
    , @NamedQuery(name = "SOperadoresTelefonicos.findByGenero", query = "SELECT s FROM SOperadoresTelefonicos s WHERE s.genero = :genero")
    , @NamedQuery(name = "SOperadoresTelefonicos.findByFechaNacimiento", query = "SELECT s FROM SOperadoresTelefonicos s WHERE s.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "SOperadoresTelefonicos.findByDireccion", query = "SELECT s FROM SOperadoresTelefonicos s WHERE s.direccion = :direccion")
    , @NamedQuery(name = "SOperadoresTelefonicos.findByTelefonoPersonal", query = "SELECT s FROM SOperadoresTelefonicos s WHERE s.telefonoPersonal = :telefonoPersonal")
    , @NamedQuery(name = "SOperadoresTelefonicos.findByLineaAsignada", query = "SELECT s FROM SOperadoresTelefonicos s WHERE s.lineaAsignada = :lineaAsignada")})
public class SOperadoresTelefonicos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_operador")
    private Integer idOperador;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "ap_paterno")
    private String apPaterno;
    @Basic(optional = false)
    @Column(name = "ap_materno")
    private String apMaterno;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "telefono_personal")
    private int telefonoPersonal;
    @Basic(optional = false)
    @Column(name = "linea_asignada")
    private int lineaAsignada;

    public SOperadoresTelefonicos() {
    }

    public SOperadoresTelefonicos(Integer idOperador) {
        this.idOperador = idOperador;
    }

    public SOperadoresTelefonicos(Integer idOperador, String nombre, String apPaterno, String apMaterno, String genero, Date fechaNacimiento, String direccion, int telefonoPersonal, int lineaAsignada) {
        this.idOperador = idOperador;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefonoPersonal = telefonoPersonal;
        this.lineaAsignada = lineaAsignada;
    }

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer idOperador) {
        Integer oldIdOperador = this.idOperador;
        this.idOperador = idOperador;
        changeSupport.firePropertyChange("idOperador", oldIdOperador, idOperador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        String oldApPaterno = this.apPaterno;
        this.apPaterno = apPaterno;
        changeSupport.firePropertyChange("apPaterno", oldApPaterno, apPaterno);
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        String oldApMaterno = this.apMaterno;
        this.apMaterno = apMaterno;
        changeSupport.firePropertyChange("apMaterno", oldApMaterno, apMaterno);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        String oldGenero = this.genero;
        this.genero = genero;
        changeSupport.firePropertyChange("genero", oldGenero, genero);
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        Date oldFechaNacimiento = this.fechaNacimiento;
        this.fechaNacimiento = fechaNacimiento;
        changeSupport.firePropertyChange("fechaNacimiento", oldFechaNacimiento, fechaNacimiento);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public int getTelefonoPersonal() {
        return telefonoPersonal;
    }

    public void setTelefonoPersonal(int telefonoPersonal) {
        int oldTelefonoPersonal = this.telefonoPersonal;
        this.telefonoPersonal = telefonoPersonal;
        changeSupport.firePropertyChange("telefonoPersonal", oldTelefonoPersonal, telefonoPersonal);
    }

    public int getLineaAsignada() {
        return lineaAsignada;
    }

    public void setLineaAsignada(int lineaAsignada) {
        int oldLineaAsignada = this.lineaAsignada;
        this.lineaAsignada = lineaAsignada;
        changeSupport.firePropertyChange("lineaAsignada", oldLineaAsignada, lineaAsignada);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOperador != null ? idOperador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SOperadoresTelefonicos)) {
            return false;
        }
        SOperadoresTelefonicos other = (SOperadoresTelefonicos) object;
        if ((this.idOperador == null && other.idOperador != null) || (this.idOperador != null && !this.idOperador.equals(other.idOperador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conectabase.SOperadoresTelefonicos[ idOperador=" + idOperador + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
