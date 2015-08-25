/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sbp.ent;

import PaqueteBD.TdiGrupos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fairy
 */
@Stateless
public class TdiGruposFacade extends AbstractFacade<TdiGrupos> {
    @PersistenceContext(unitName = "DipromacomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TdiGruposFacade() {
        super(TdiGrupos.class);
    }
    
}
