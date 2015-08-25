/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteBD;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fairy
 */
@Entity
@Table(name = "tdi_marcas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TdiMarcas.findAll", query = "SELECT t FROM TdiMarcas t"),
    @NamedQuery(name = "TdiMarcas.findByMarId", query = "SELECT t FROM TdiMarcas t WHERE t.marId = :marId"),
    @NamedQuery(name = "TdiMarcas.findByMarDescripcion", query = "SELECT t FROM TdiMarcas t WHERE t.marDescripcion = :marDescripcion"),
    @NamedQuery(name = "TdiMarcas.findByMarEstado", query = "SELECT t FROM TdiMarcas t WHERE t.marEstado = :marEstado")})
public class TdiMarcas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mar_id")
    private Integer marId;
    @Size(max = 50)
    @Column(name = "mar_descripcion")
    private String marDescripcion;
    @Column(name = "mar_estado")
    private Boolean marEstado;

    public TdiMarcas() {
    }

    public TdiMarcas(Integer marId) {
        this.marId = marId;
    }

    public Integer getMarId() {
        return marId;
    }

    public void setMarId(Integer marId) {
        this.marId = marId;
    }

    public String getMarDescripcion() {
        return marDescripcion;
    }

    public void setMarDescripcion(String marDescripcion) {
        this.marDescripcion = marDescripcion;
    }

    public Boolean getMarEstado() {
        return marEstado;
    }

    public void setMarEstado(Boolean marEstado) {
        this.marEstado = marEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marId != null ? marId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TdiMarcas)) {
            return false;
        }
        TdiMarcas other = (TdiMarcas) object;
        if ((this.marId == null && other.marId != null) || (this.marId != null && !this.marId.equals(other.marId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaqueteBD.TdiMarcas[ marId=" + marId + " ]";
    }
    
}
