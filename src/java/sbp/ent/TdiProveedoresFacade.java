/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sbp.ent;

import PaqueteBD.TdiProveedores;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fairy
 */
@Stateless
public class TdiProveedoresFacade extends AbstractFacade<TdiProveedores> {
    @PersistenceContext(unitName = "DipromacomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TdiProveedoresFacade() {
        super(TdiProveedores.class);
    }
    
}
