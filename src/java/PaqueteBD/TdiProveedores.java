/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteBD;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fairy
 */
@Entity
@Table(name = "tdi_proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TdiProveedores.findAll", query = "SELECT t FROM TdiProveedores t"),
    @NamedQuery(name = "TdiProveedores.findByProveId", query = "SELECT t FROM TdiProveedores t WHERE t.proveId = :proveId"),
    @NamedQuery(name = "TdiProveedores.findByProveContable", query = "SELECT t FROM TdiProveedores t WHERE t.proveContable = :proveContable"),
    @NamedQuery(name = "TdiProveedores.findByProveNombre", query = "SELECT t FROM TdiProveedores t WHERE t.proveNombre = :proveNombre"),
    @NamedQuery(name = "TdiProveedores.findByProveAlias", query = "SELECT t FROM TdiProveedores t WHERE t.proveAlias = :proveAlias"),
    @NamedQuery(name = "TdiProveedores.findByProveCedula", query = "SELECT t FROM TdiProveedores t WHERE t.proveCedula = :proveCedula"),
    @NamedQuery(name = "TdiProveedores.findByProveDireccion", query = "SELECT t FROM TdiProveedores t WHERE t.proveDireccion = :proveDireccion"),
    @NamedQuery(name = "TdiProveedores.findByProveTelefonos", query = "SELECT t FROM TdiProveedores t WHERE t.proveTelefonos = :proveTelefonos"),
    @NamedQuery(name = "TdiProveedores.findByProveTipo", query = "SELECT t FROM TdiProveedores t WHERE t.proveTipo = :proveTipo"),
    @NamedQuery(name = "TdiProveedores.findByProveEstado", query = "SELECT t FROM TdiProveedores t WHERE t.proveEstado = :proveEstado"),
    @NamedQuery(name = "TdiProveedores.findByProveEspecial", query = "SELECT t FROM TdiProveedores t WHERE t.proveEspecial = :proveEspecial"),
    @NamedQuery(name = "TdiProveedores.findByProveProveedor", query = "SELECT t FROM TdiProveedores t WHERE t.proveProveedor = :proveProveedor"),
    @NamedQuery(name = "TdiProveedores.findByProveFecha", query = "SELECT t FROM TdiProveedores t WHERE t.proveFecha = :proveFecha"),
    @NamedQuery(name = "TdiProveedores.findByProveNacional", query = "SELECT t FROM TdiProveedores t WHERE t.proveNacional = :proveNacional")})
public class TdiProveedores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prove_id")
    private Integer proveId;
    @Size(max = 25)
    @Column(name = "prove_contable")
    private String proveContable;
    @Size(max = 50)
    @Column(name = "prove_nombre")
    private String proveNombre;
    @Size(max = 50)
    @Column(name = "prove_alias")
    private String proveAlias;
    @Size(max = 13)
    @Column(name = "prove_cedula")
    private String proveCedula;
    @Size(max = 40)
    @Column(name = "prove_direccion")
    private String proveDireccion;
    @Size(max = 40)
    @Column(name = "prove_telefonos")
    private String proveTelefonos;
    @Size(max = 1)
    @Column(name = "prove_tipo")
    private String proveTipo;
    @Column(name = "prove_estado")
    private Boolean proveEstado;
    @Column(name = "prove_especial")
    private Character proveEspecial;
    @Size(max = 1)
    @Column(name = "prove_proveedor")
    private String proveProveedor;
    @Column(name = "prove_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date proveFecha;
    @Column(name = "prove_nacional")
    private Character proveNacional;

    public TdiProveedores() {
    }

    public TdiProveedores(Integer proveId) {
        this.proveId = proveId;
    }

    public Integer getProveId() {
        return proveId;
    }

    public void setProveId(Integer proveId) {
        this.proveId = proveId;
    }

    public String getProveContable() {
        return proveContable;
    }

    public void setProveContable(String proveContable) {
        this.proveContable = proveContable;
    }

    public String getProveNombre() {
        return proveNombre;
    }

    public void setProveNombre(String proveNombre) {
        this.proveNombre = proveNombre;
    }

    public String getProveAlias() {
        return proveAlias;
    }

    public void setProveAlias(String proveAlias) {
        this.proveAlias = proveAlias;
    }

    public String getProveCedula() {
        return proveCedula;
    }

    public void setProveCedula(String proveCedula) {
        this.proveCedula = proveCedula;
    }

    public String getProveDireccion() {
        return proveDireccion;
    }

    public void setProveDireccion(String proveDireccion) {
        this.proveDireccion = proveDireccion;
    }

    public String getProveTelefonos() {
        return proveTelefonos;
    }

    public void setProveTelefonos(String proveTelefonos) {
        this.proveTelefonos = proveTelefonos;
    }

    public String getProveTipo() {
        return proveTipo;
    }

    public void setProveTipo(String proveTipo) {
        this.proveTipo = proveTipo;
    }

    public Boolean getProveEstado() {
        return proveEstado;
    }

    public void setProveEstado(Boolean proveEstado) {
        this.proveEstado = proveEstado;
    }

    public Character getProveEspecial() {
        return proveEspecial;
    }

    public void setProveEspecial(Character proveEspecial) {
        this.proveEspecial = proveEspecial;
    }

    public String getProveProveedor() {
        return proveProveedor;
    }

    public void setProveProveedor(String proveProveedor) {
        this.proveProveedor = proveProveedor;
    }

    public Date getProveFecha() {
        return proveFecha;
    }

    public void setProveFecha(Date proveFecha) {
        this.proveFecha = proveFecha;
    }

    public Character getProveNacional() {
        return proveNacional;
    }

    public void setProveNacional(Character proveNacional) {
        this.proveNacional = proveNacional;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proveId != null ? proveId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TdiProveedores)) {
            return false;
        }
        TdiProveedores other = (TdiProveedores) object;
        if ((this.proveId == null && other.proveId != null) || (this.proveId != null && !this.proveId.equals(other.proveId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaqueteBD.TdiProveedores[ proveId=" + proveId + " ]";
    }
    
}
