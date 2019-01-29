/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.practica.web;

import ec.espe.practica.model.Pasatiempo;
import ec.espe.practica.service.PasatiempoService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;


/**
 *
 * @author Daniel
 */
@Named
@ViewScoped
public class PasatiempoBean extends BaseBean implements Serializable{
    
    private List<Pasatiempo> tiposPasatiempos;
    private Pasatiempo pasatiempo;
    private Pasatiempo pasatiempoSel;
    
    @Inject
    private PasatiempoService pasatiempoService;
    
    @PostConstruct
    public void init() {
        this.tiposPasatiempos = this.pasatiempoService.obtenerTodos();
        this.pasatiempo = new Pasatiempo();
    }

    public List<Pasatiempo> getTiposPasatiempos() {
        return tiposPasatiempos;
    }
    
    @Override
    public void agregar() {
        this.pasatiempo = new Pasatiempo();
        super.agregar();
        
    }

    @Override
    public void modificar() {
        super.modificar();
        this.pasatiempo = new Pasatiempo();
        this.pasatiempo.setCodPasatiempo(this.pasatiempoSel.getCodPasatiempo());
        this.pasatiempo.setNombre(this.pasatiempoSel.getNombre());
        this.pasatiempo.setDescripcion(this.pasatiempoSel.getDescripcion());
    }
    
    public void eliminar() {
        try {
            this.pasatiempoService.eliminar(this.pasatiempoSel.getCodPasatiempo());
            this.tiposPasatiempos = this.pasatiempoService.obtenerTodos();
           // FacesUtil.addMessageInfo("Se elimino el registro ");
            this.pasatiempoSel = null;
        } catch (Exception e) {
           // FacesUtil.addMessageError(null, "No se puede eliminar el registro seleccionado. Verifique que no tenga informacion relacionada.");
        }
    }

    @Override
    public void detalles() {
        super.detalles();
        this.pasatiempo = this.pasatiempoSel;
    }

    public void cancelar() {
        super.reset();
        this.pasatiempo = new Pasatiempo();
    }

    public void guardar() {
        try {
            if (this.enAgregar) {
                this.pasatiempoService.agregar(this.pasatiempo);
                  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Se agreg\u00f3 un nuevo pasatiempo: "+ this.pasatiempo.getNombre()));
                //FacesUtil.addMessageInfo("Se agreg\u00f3 un nuevo pasatiempo: " + this.pasatiempo.getNombre());
            } else {
                this.pasatiempoService.modificar(this.pasatiempo);
                //FacesUtil.addMessageInfo("Se modific\u00f3 el pasatiempo: " + this.pasatiempo.getNombre());
            }
        } catch (Exception ex) {
            //FacesUtil.addMessageError(null, "Ocurri\u00f3 un error al actualizar la informaci\u00f3n");
        }
        super.reset();
        this.pasatiempo = new Pasatiempo();
        this.tiposPasatiempos = this.pasatiempoService.obtenerTodos();
    }
    
    public Pasatiempo getPasatiempo() {
        return pasatiempo;
    }

    public void setPasatiempo(Pasatiempo pasatiempo) {
        this.pasatiempo = pasatiempo;
    }

    public Pasatiempo getPasatiempoSel() {
        return pasatiempoSel;
    }

    public void setPasatiempoSel(Pasatiempo pasatiempoSel) {
        this.pasatiempoSel = pasatiempoSel;
    }
     
}
