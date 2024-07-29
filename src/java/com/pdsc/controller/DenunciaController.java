package com.pdsc.controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.pdsc.model.Denuncia;
import com.pdsc.model.Usuario;
import com.pdsc.model.Servidor;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PDSC
 */

@ManagedBean
@SessionScoped
public class DenunciaController extends Controller {
    
    private Denuncia denuncia;
    private List<Denuncia> listaDenuncias;
    private List<Denuncia> listaDenunciasServidor;
    private List<Denuncia> listaDenunciasUsuario;
    
    @PostConstruct
    public void init(){
        this.denuncia = new Denuncia();
    }
    
    public String inserirDenuncia(){
        
        Usuario usuarioLogado = ((LoginController) ((HttpSession) FacesContext.getCurrentInstance()
            .getExternalContext().getSession(true))
            .getAttribute("loginController")).getUsuarioLogado();
        this.denuncia.setUsuario(usuarioLogado);
        insert(this.denuncia);
        this.denuncia = new Denuncia();
        return "indexUsuario";
        
    }
    
    
    
}
