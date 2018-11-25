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
@Table(name = "s_ajustadores", catalog = "ic16jpm", schema = "")
@NamedQueries({
    @NamedQuery(name = "SAjustadores.findAll", query = "SELECT s FROM SAjustadores s")
    , @NamedQuery(name = "SAjustadores.findByIdAjustador", query = "SELECT s FROM SAjustadores s WHERE s.idAjustador = :idAjustador")
    , @NamedQuery(name = "SAjustadores.findByNombre", query = "SELECT s FROM SAjustadores s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "SAjustadores.findByApPaterno", query = "SELECT s FROM SAjustadores s WHERE s.apPaterno = :apPaterno")
    , @NamedQuery(name = "SAjustadores.findByApMaterno", query = "SELECT s FROM SAjustadores s WHERE s.apMaterno = :apMaterno")
    , @NamedQuery(name = "SAjustadores.findByGenero", query = "SELECT s FROM SAjustadores s WHERE s.genero = :genero")
    , @NamedQuery(name = "SAjustadores.findByFechaNacimiento", query = "SELECT s FROM SAjustadores s WHERE s.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "SAjustadores.findByDireccion", query = "SELECT s FROM SAjustadores s WHERE s.direccion = :direccion")
    , @NamedQuery(name = "SAjustadores.findByTelefonoPersonal", query = "SELECT s FROM SAjustadores s WHERE s.telefonoPersonal = :telefonoPersonal")
    , @NamedQuery(name = "SAjustadores.findByTelefonoTrabajo", query = "SELECT s FROM SAjustadores s WHERE s.telefonoTrabajo = :telefonoTrabajo")
    , @NamedQuery(name = "SAjustadores.findByMail", query = "SELECT s FROM SAjustadores s WHERE s.mail = :mail")})
public class SAjustadores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ajustador")
    private Integer idAjustador;
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
    @Column(name = "telefono_trabajo")
    private int telefonoTrabajo;
    @Basic(optional = false)
    @Column(name = "mail")
    private String mail;

    public SAjustadores() {
    }

    public SAjustadores(Integer idAjustador) {
        this.idAjustador = idAjustador;
    }

    public SAjustadores(Integer idAjustador, String nombre, String apPaterno, String apMaterno, String genero, Date fechaNacimiento, String direccion, int telefonoPersonal, int telefonoTrabajo, String mail) {
        this.idAjustador = idAjustador;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefonoPersonal = telefonoPersonal;
        this.telefonoTrabajo = telefonoTrabajo;
        this.mail = mail;
    }

    public Integer getIdAjustador() {
        return idAjustador;
    }

    public void setIdAjustador(Integer idAjustador) {
        Integer oldIdAjustador = this.idAjustador;
        this.idAjustador = idAjustador;
        changeSupport.firePropertyChange("idAjustador", oldIdAjustador, idAjustador);
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

    public int getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(int telefonoTrabajo) {
        int oldTelefonoTrabajo = this.telefonoTrabajo;
        this.telefonoTrabajo = telefonoTrabajo;
        changeSupport.firePropertyChange("telefonoTrabajo", oldTelefonoTrabajo, telefonoTrabajo);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        String oldMail = this.mail;
        this.mail = mail;
        changeSupport.firePropertyChange("mail", oldMail, mail);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAjustador != null ? idAjustador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SAjustadores)) {
            return false;
        }
        SAjustadores other = (SAjustadores) object;
        if ((this.idAjustador == null && other.idAjustador != null) || (this.idAjustador != null && !this.idAjustador.equals(other.idAjustador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conectabase.SAjustadores[ idAjustador=" + idAjustador + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
