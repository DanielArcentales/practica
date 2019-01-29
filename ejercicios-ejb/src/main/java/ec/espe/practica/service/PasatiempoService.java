/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.practica.service;

import ec.espe.practica.dao.PasatiempoFacade;
import ec.espe.practica.model.Pasatiempo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Daniel
 */
@Stateless
@LocalBean
public class PasatiempoService {

    @EJB
    private PasatiempoFacade pasatiempoFacade;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public List<Pasatiempo> obtenerTodos(){
        return this.pasatiempoFacade.findAll();
    }
    
    public void agregar(Pasatiempo pasatiempo){
        this.pasatiempoFacade.create(pasatiempo);
    }
    
    public void modificar(Pasatiempo pasatiempo){
        this.pasatiempoFacade.edit(pasatiempo);
    }
    
    public void eliminar(int codigo){
        Pasatiempo pasatiempo = this.pasatiempoFacade.find(codigo);
        this.pasatiempoFacade.remove(pasatiempo);
    }
    
    
}
