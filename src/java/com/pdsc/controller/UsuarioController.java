package com.pdsc.controller;

import com.pdsc.model.Usuario;
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
public class UsuarioController extends Controller {

    private Usuario usuarioCadastro;
    private Usuario selection;

    @PostConstruct
    public void init() {
        this.usuarioCadastro = new Usuario();
        this.selection = new Usuario();
    }

    public void inserir(String confirma) {
        if (!this.usuarioCadastro.getSenha().equals(confirma)) {
            FacesContext.getCurrentInstance().addMessage("formRegistroUsuario:senha",
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "A senha e a confirmação não são iguais!"));
            return;
        }
        insert(this.usuarioCadastro);
        this.usuarioCadastro = new Usuario();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Usuario cadastrado com sucesso!"));
    }

    public List<Usuario> readAll() {
        return read("select p from Usuario p", Usuario.class);
    }

    public Usuario getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(Usuario usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }

    public Usuario getSelection() {
        return selection;
    }

    public void setSelection(Usuario selection) {
        this.selection = selection;
    }
}
