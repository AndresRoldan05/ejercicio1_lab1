/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.top.ejb;

import com.top.entity.Clientes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Andres
 */
@Stateless
public class ClientesFacade extends AbstractFacade<Clientes> implements ClientesFacadeLocal {

    @PersistenceContext(unitName = "concesionarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientesFacade() {
        super(Clientes.class);
    }

    @Override
    public boolean checkLogin(String u, String p) {
        Query q=em.createQuery("select a from clientes a "+"where a.correo_electronico=:u and a.contraseña=:p");
        q.setParameter("u",u);
        q.setParameter("p",p);
        return q.getResultList().size()>0;
    }
   
}
