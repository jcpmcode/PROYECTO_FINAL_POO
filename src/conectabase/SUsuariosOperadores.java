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
@Table(name = "s_usuarios_operadores", catalog = "ic16jpm", schema = "")
@NamedQueries({
    @NamedQuery(name = "SUsuariosOperadores.findAll", query = "SELECT s FROM SUsuariosOperadores s")
    , @NamedQuery(name = "SUsuariosOperadores.findByIdUsuarioOperador", query = "SELECT s FROM SUsuariosOperadores s WHERE s.idUsuarioOperador = :idUsuarioOperador")
    , @NamedQuery(name = "SUsuariosOperadores.findByIdOperador", query = "SELECT s FROM SUsuariosOperadores s WHERE s.idOperador = :idOperador")
    , @NamedQuery(name = "SUsuariosOperadores.findByUsuario", query = "SELECT s FROM SUsuariosOperadores s WHERE s.usuario = :usuario")
    , @NamedQuery(name = "SUsuariosOperadores.findByContrasenia", query = "SELECT s FROM SUsuariosOperadores s WHERE s.contrasenia = :contrasenia")
    , @NamedQuery(name = "SUsuariosOperadores.findByLogins", query = "SELECT s FROM SUsuariosOperadores s WHERE s.logins = :logins")})
public class SUsuariosOperadores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_operador")
    private Integer idUsuarioOperador;
    @Column(name = "id_operador")
    private Integer idOperador;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "contrasenia")
    private String contrasenia;
    @Basic(optional = false)
    @Column(name = "logins")
    private int logins;

    public SUsuariosOperadores() {
    }

    public SUsuariosOperadores(Integer idUsuarioOperador) {
        this.idUsuarioOperador = idUsuarioOperador;
    }

    public SUsuariosOperadores(Integer idUsuarioOperador, String usuario, String contrasenia, int logins) {
        this.idUsuarioOperador = idUsuarioOperador;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.logins = logins;
    }

    public Integer getIdUsuarioOperador() {
        return idUsuarioOperador;
    }

    public void setIdUsuarioOperador(Integer idUsuarioOperador) {
        Integer oldIdUsuarioOperador = this.idUsuarioOperador;
        this.idUsuarioOperador = idUsuarioOperador;
        changeSupport.firePropertyChange("idUsuarioOperador", oldIdUsuarioOperador, idUsuarioOperador);
    }

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer idOperador) {
        Integer oldIdOperador = this.idOperador;
        this.idOperador = idOperador;
        changeSupport.firePropertyChange("idOperador", oldIdOperador, idOperador);
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
        hash += (idUsuarioOperador != null ? idUsuarioOperador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SUsuariosOperadores)) {
            return false;
        }
        SUsuariosOperadores other = (SUsuariosOperadores) object;
        if ((this.idUsuarioOperador == null && other.idUsuarioOperador != null) || (this.idUsuarioOperador != null && !this.idUsuarioOperador.equals(other.idUsuarioOperador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conectabase.SUsuariosOperadores[ idUsuarioOperador=" + idUsuarioOperador + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
