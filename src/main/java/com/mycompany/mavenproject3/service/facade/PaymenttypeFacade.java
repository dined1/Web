package com.mycompany.mavenproject3.service.facade;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.mycompany.mavenproject3.Paymenttype;
import com.mycompany.mavenproject3.service.facade.AbstractFacade;

@Stateless
@Named("paymenttype")
public class PaymenttypeFacade extends AbstractFacade<Paymenttype> {

    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaymenttypeFacade() {
        super(Paymenttype.class);
    }

}
