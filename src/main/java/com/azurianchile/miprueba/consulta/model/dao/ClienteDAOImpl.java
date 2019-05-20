package com.azurianchile.miprueba.consulta.model.dao;


import com.azurianchile.miprueba.consulta.model.entity.Cliente;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class ClienteDAOImpl implements IClienteDAO {

     @PersistenceContext
     private EntityManager em;
     private IClienteDAO clienteDAO;

    @SuppressAjWarnings
    @Transactional(readOnly = true)
    @Override
    @RequestMapping(value="/list", method= RequestMethod.GET)
    public List<Cliente> findAllClientes() {

        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            System.out.println(q.getResultList().size());
            return q.getResultList();
        } finally {
            em.close();
        }

    }
}
