/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author thiag
 */
public class PedidoDaoImpl extends BaseDaoAbstractImpl implements PedidoDao {

    public PedidoDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<Object[]> pesquisarTodosPedidos() {

        Query query = this.em.createQuery("SELECT p, c FROM Pedido p "
                + "JOIN Cliente c ON p.cliente.id = c.id ");
        List<Object[]> pedidos = query.getResultList();

        return pedidos;
    }

}
