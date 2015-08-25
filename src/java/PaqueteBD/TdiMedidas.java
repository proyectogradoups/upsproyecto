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
@Table(name = "tdi_medidas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TdiMedidas.findAll", query = "SELECT t FROM TdiMedidas t"),
    @NamedQuery(name = "TdiMedidas.findByMedId", query = "SELECT t FROM TdiMedidas t WHERE t.medId = :medId"),
    @NamedQuery(name = "TdiMedidas.findByMedDescripcion", query = "SELECT t FROM TdiMedidas t WHERE t.medDescripcion = :medDescripcion"),
    @NamedQuery(name = "TdiMedidas.findByMedSiglas", query = "SELECT t FROM TdiMedidas t WHERE t.medSiglas = :medSiglas"),
    @NamedQuery(name = "TdiMedidas.findByMedUnidades", query = "SELECT t FROM TdiMedidas t WHERE t.medUnidades = :medUnidades"),
    @NamedQuery(name = "TdiMedidas.findByMedFraccion", query = "SELECT t FROM TdiMedidas t WHERE t.medFraccion = :medFraccion"),
    @NamedQuery(name = "TdiMedidas.findByMedEstado", query = "SELECT t FROM TdiMedidas t WHERE t.medEstado = :medEstado")})
public class TdiMedidas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "med_id")
    private Integer medId;
    @Size(max = 20)
    @Column(name = "med_descripcion")
    private String medDescripcion;
    @Size(max = 3)
    @Column(name = "med_siglas")
    private String medSiglas;
    @Column(name = "med_unidades")
    private Integer medUnidades;
    @Column(name = "med_fraccion")
    private Character medFraccion;
    @Column(name = "med_estado")
    private Boolean medEstado;

    public TdiMedidas() {
    }

    public TdiMedidas(Integer medId) {
        this.medId = medId;
    }

    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }

    public String getMedDescripcion() {
        return medDescripcion;
    }

    public void setMedDescripcion(String medDescripcion) {
        this.medDescripcion = medDescripcion;
    }

    public String getMedSiglas() {
        return medSiglas;
    }

    public void setMedSiglas(String medSiglas) {
        this.medSiglas = medSiglas;
    }

    public Integer getMedUnidades() {
        return medUnidades;
    }

    public void setMedUnidades(Integer medUnidades) {
        this.medUnidades = medUnidades;
    }

    public Character getMedFraccion() {
        return medFraccion;
    }

    public void setMedFraccion(Character medFraccion) {
        this.medFraccion = medFraccion;
    }

    public Boolean getMedEstado() {
        return medEstado;
    }

    public void setMedEstado(Boolean medEstado) {
        this.medEstado = medEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (medId != null ? medId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TdiMedidas)) {
            return false;
        }
        TdiMedidas other = (TdiMedidas) object;
        if ((this.medId == null && other.medId != null) || (this.medId != null && !this.medId.equals(other.medId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaqueteBD.TdiMedidas[ medId=" + medId + " ]";
    }
    
}
