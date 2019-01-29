/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.practica.dao;

import ec.espe.practica.model.Pasatiempo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Daniel
 */
@Stateless
public class PasatiempoFacade extends AbstractFacade<Pasatiempo> {

    @PersistenceContext(unitName = "ec.espe.practica_ejercicios-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PasatiempoFacade() {
        super(Pasatiempo.class);
    }
    
}
