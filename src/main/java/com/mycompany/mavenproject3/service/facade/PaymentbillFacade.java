package com.mycompany.mavenproject3.service.facade;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.mycompany.mavenproject3.Paymentbill;
import com.mycompany.mavenproject3.service.facade.AbstractFacade;

@Stateless
@Named("paymentbill")
public class PaymentbillFacade extends AbstractFacade<Paymentbill> {

    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaymentbillFacade() {
        super(Paymentbill.class);
    }

}
