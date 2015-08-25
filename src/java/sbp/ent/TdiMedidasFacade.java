/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sbp.ent;

import PaqueteBD.TdiMedidas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fairy
 */
@Stateless
public class TdiMedidasFacade extends AbstractFacade<TdiMedidas> {
    @PersistenceContext(unitName = "DipromacomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TdiMedidasFacade() {
        super(TdiMedidas.class);
    }
    
}
