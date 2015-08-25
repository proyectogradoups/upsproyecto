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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tdi_subgrupos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TdiSubgrupos.findAll", query = "SELECT t FROM TdiSubgrupos t"),
    @NamedQuery(name = "TdiSubgrupos.findBySgruId", query = "SELECT t FROM TdiSubgrupos t WHERE t.sgruId = :sgruId"),
    @NamedQuery(name = "TdiSubgrupos.findBySgruDescripcion", query = "SELECT t FROM TdiSubgrupos t WHERE t.sgruDescripcion = :sgruDescripcion"),
    @NamedQuery(name = "TdiSubgrupos.findBySgruEstado", query = "SELECT t FROM TdiSubgrupos t WHERE t.sgruEstado = :sgruEstado")})
public class TdiSubgrupos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sgru_id")
    private Integer sgruId;
    @Size(max = 50)
    @Column(name = "sgru_descripcion")
    private String sgruDescripcion;
    @Column(name = "sgru_estado")
    private Boolean sgruEstado;
    @JoinColumn(name = "gru_id", referencedColumnName = "gru_id")
    @ManyToOne(optional = false)
    private TdiGrupos gruId;

    public TdiSubgrupos() {
    }

    public TdiSubgrupos(Integer sgruId) {
        this.sgruId = sgruId;
    }

    public Integer getSgruId() {
        return sgruId;
    }

    public void setSgruId(Integer sgruId) {
        this.sgruId = sgruId;
    }

    public String getSgruDescripcion() {
        return sgruDescripcion;
    }

    public void setSgruDescripcion(String sgruDescripcion) {
        this.sgruDescripcion = sgruDescripcion;
    }

    public Boolean getSgruEstado() {
        return sgruEstado;
    }

    public void setSgruEstado(Boolean sgruEstado) {
        this.sgruEstado = sgruEstado;
    }

    public TdiGrupos getGruId() {
        return gruId;
    }

    public void setGruId(TdiGrupos gruId) {
        this.gruId = gruId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sgruId != null ? sgruId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TdiSubgrupos)) {
            return false;
        }
        TdiSubgrupos other = (TdiSubgrupos) object;
        if ((this.sgruId == null && other.sgruId != null) || (this.sgruId != null && !this.sgruId.equals(other.sgruId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaqueteBD.TdiSubgrupos[ sgruId=" + sgruId + " ]";
    }
    
}
