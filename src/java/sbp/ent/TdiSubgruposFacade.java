/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sbp.ent;

import PaqueteBD.TdiSubgrupos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fairy
 */
@Stateless
public class TdiSubgruposFacade extends AbstractFacade<TdiSubgrupos> {
    @PersistenceContext(unitName = "DipromacomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TdiSubgruposFacade() {
        super(TdiSubgrupos.class);
    }
    
}
