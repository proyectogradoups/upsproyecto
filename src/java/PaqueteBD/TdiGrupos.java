/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteBD;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fairy
 */
@Entity
@Table(name = "tdi_grupos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TdiGrupos.findAll", query = "SELECT t FROM TdiGrupos t"),
    @NamedQuery(name = "TdiGrupos.findByGruId", query = "SELECT t FROM TdiGrupos t WHERE t.gruId = :gruId"),
    @NamedQuery(name = "TdiGrupos.findByGruDescripcion", query = "SELECT t FROM TdiGrupos t WHERE t.gruDescripcion = :gruDescripcion"),
    @NamedQuery(name = "TdiGrupos.findByGruEstado", query = "SELECT t FROM TdiGrupos t WHERE t.gruEstado = :gruEstado")})
public class TdiGrupos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gru_id")
    private Integer gruId;
    @Size(max = 50)
    @Column(name = "gru_descripcion")
    private String gruDescripcion;
    @Column(name = "gru_estado")
    private Boolean gruEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gruId")
    private Collection<TdiSubgrupos> tdiSubgruposCollection;

    public TdiGrupos() {
    }

    public TdiGrupos(Integer gruId) {
        this.gruId = gruId;
    }

    public Integer getGruId() {
        return gruId;
    }

    public void setGruId(Integer gruId) {
        this.gruId = gruId;
    }

    public String getGruDescripcion() {
        return gruDescripcion;
    }

    public void setGruDescripcion(String gruDescripcion) {
        this.gruDescripcion = gruDescripcion;
    }

    public Boolean getGruEstado() {
        return gruEstado;
    }

    public void setGruEstado(Boolean gruEstado) {
        this.gruEstado = gruEstado;
    }

    @XmlTransient
    public Collection<TdiSubgrupos> getTdiSubgruposCollection() {
        return tdiSubgruposCollection;
    }

    public void setTdiSubgruposCollection(Collection<TdiSubgrupos> tdiSubgruposCollection) {
        this.tdiSubgruposCollection = tdiSubgruposCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gruId != null ? gruId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TdiGrupos)) {
            return false;
        }
        TdiGrupos other = (TdiGrupos) object;
        if ((this.gruId == null && other.gruId != null) || (this.gruId != null && !this.gruId.equals(other.gruId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaqueteBD.TdiGrupos[ gruId=" + gruId + " ]";
    }
    
}
