package com.pdsc.controller;

import com.pdsc.model.ManagerDao;
import com.pdsc.model.Servidor;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author PDSC
 */
@ManagedBean
@SessionScoped
public class ServidorController {

    private Servidor servidorCadastro;
    private Servidor selection;

    @PostConstruct
    public void init() {
        this.servidorCadastro = new Servidor();
        this.selection = new Servidor();
    }

    public void inserir(String confirma) {
        if (!this.servidorCadastro.getSenha().equals(confirma)) {
            FacesContext.getCurrentInstance().addMessage("formRegistroServidor:senha",
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "A senha e a confirmação não são iguais!"));
            return;
        }
        ManagerDao.getCurrentInstance().insert(this.servidorCadastro);
        this.servidorCadastro = new Servidor();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Servidor cadastrado com sucesso!"));
    }

    public List<Servidor> readAll() {
        return ManagerDao.getCurrentInstance().read("select p from Servidor p", Servidor.class);
    }

    public Servidor getServidorCadastro() {
        return servidorCadastro;
    }

    public void setServidorCadastro(Servidor servidorCadastro) {
        this.servidorCadastro = servidorCadastro;
    }

    public Servidor getSelection() {
        return selection;
    }

    public void setSelection(Servidor selection) {
        this.selection = selection;
    }

}
