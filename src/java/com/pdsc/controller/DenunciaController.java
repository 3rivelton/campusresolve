package com.pdsc.controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.pdsc.model.Denuncia;
import com.pdsc.model.Usuario;
import java.text.SimpleDateFormat;
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
    private List<Denuncia> listaDenunciasServidor;
    private List<Denuncia> listaDenunciasUsuario;
    private final SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    
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
    
    public List<Denuncia> listarDenuncias(Usuario usuario){
        
        return read("select d from Denuncia d where d.usuario.id = " + usuario.getId(), Denuncia.class);
        
    }

    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }

    public List<Denuncia> getListaDenunciasServidor() {
        return listaDenunciasServidor;
    }

    public void setListaDenunciasServidor(List<Denuncia> listaDenunciasServidor) {
        this.listaDenunciasServidor = listaDenunciasServidor;
    }

    public List<Denuncia> getListaDenunciasUsuario() {
        return listaDenunciasUsuario;
    }

    public void setListaDenunciasUsuario(List<Denuncia> listaDenunciasUsuario) {
        this.listaDenunciasUsuario = listaDenunciasUsuario;
    }
    
}
