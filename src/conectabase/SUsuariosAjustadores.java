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
@Table(name = "s_usuarios_ajustadores", catalog = "ic16jpm", schema = "")
@NamedQueries({
    @NamedQuery(name = "SUsuariosAjustadores.findAll", query = "SELECT s FROM SUsuariosAjustadores s")
    , @NamedQuery(name = "SUsuariosAjustadores.findByIdUsuarioAjustador", query = "SELECT s FROM SUsuariosAjustadores s WHERE s.idUsuarioAjustador = :idUsuarioAjustador")
    , @NamedQuery(name = "SUsuariosAjustadores.findByIdAjustador", query = "SELECT s FROM SUsuariosAjustadores s WHERE s.idAjustador = :idAjustador")
    , @NamedQuery(name = "SUsuariosAjustadores.findByUsuario", query = "SELECT s FROM SUsuariosAjustadores s WHERE s.usuario = :usuario")
    , @NamedQuery(name = "SUsuariosAjustadores.findByContrasenia", query = "SELECT s FROM SUsuariosAjustadores s WHERE s.contrasenia = :contrasenia")
    , @NamedQuery(name = "SUsuariosAjustadores.findByLogins", query = "SELECT s FROM SUsuariosAjustadores s WHERE s.logins = :logins")})
public class SUsuariosAjustadores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_ajustador")
    private Integer idUsuarioAjustador;
    @Column(name = "id_ajustador")
    private Integer idAjustador;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "contrasenia")
    private String contrasenia;
    @Basic(optional = false)
    @Column(name = "logins")
    private int logins;

    public SUsuariosAjustadores() {
    }

    public SUsuariosAjustadores(Integer idUsuarioAjustador) {
        this.idUsuarioAjustador = idUsuarioAjustador;
    }

    public SUsuariosAjustadores(Integer idUsuarioAjustador, String usuario, String contrasenia, int logins) {
        this.idUsuarioAjustador = idUsuarioAjustador;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.logins = logins;
    }

    public Integer getIdUsuarioAjustador() {
        return idUsuarioAjustador;
    }

    public void setIdUsuarioAjustador(Integer idUsuarioAjustador) {
        Integer oldIdUsuarioAjustador = this.idUsuarioAjustador;
        this.idUsuarioAjustador = idUsuarioAjustador;
        changeSupport.firePropertyChange("idUsuarioAjustador", oldIdUsuarioAjustador, idUsuarioAjustador);
    }

    public Integer getIdAjustador() {
        return idAjustador;
    }

    public void setIdAjustador(Integer idAjustador) {
        Integer oldIdAjustador = this.idAjustador;
        this.idAjustador = idAjustador;
        changeSupport.firePropertyChange("idAjustador", oldIdAjustador, idAjustador);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        String oldContrasenia = this.contrasenia;
        this.contrasenia = contrasenia;
        changeSupport.firePropertyChange("contrasenia", oldContrasenia, contrasenia);
    }

    public int getLogins() {
        return logins;
    }

    public void setLogins(int logins) {
        int oldLogins = this.logins;
        this.logins = logins;
        changeSupport.firePropertyChange("logins", oldLogins, logins);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioAjustador != null ? idUsuarioAjustador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SUsuariosAjustadores)) {
            return false;
        }
        SUsuariosAjustadores other = (SUsuariosAjustadores) object;
        if ((this.idUsuarioAjustador == null && other.idUsuarioAjustador != null) || (this.idUsuarioAjustador != null && !this.idUsuarioAjustador.equals(other.idUsuarioAjustador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conectabase.SUsuariosAjustadores[ idUsuarioAjustador=" + idUsuarioAjustador + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
