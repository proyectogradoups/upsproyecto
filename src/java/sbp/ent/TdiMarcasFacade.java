/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sbp.ent;

import PaqueteBD.TdiMarcas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fairy
 */
@Stateless
public class TdiMarcasFacade extends AbstractFacade<TdiMarcas> {
    @PersistenceContext(unitName = "DipromacomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TdiMarcasFacade() {
        super(TdiMarcas.class);
    }
    
}
