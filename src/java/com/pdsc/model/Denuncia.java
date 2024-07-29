package com.pdsc.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PDSC
 */

@SuppressWarnings("SerializableClass")
@Entity
public class Denuncia {
    
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;
  private String setorDenuncia;
  private String tipoDenuncia;
  private String assundoDenuncia;
  @Temporal(TemporalType.DATE)
  private Date dataDenuncia;
  private String localDenuncia;
  private String descricaoDenuncia;
  @ManyToOne
  private Servidor servidor;
  @ManyToOne
  private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataDenuncia() {
        return dataDenuncia;
    }

    public void setDataDenuncia(Date dataDenuncia) {
        this.dataDenuncia = dataDenuncia;
    }

    public String getLocalDenuncia() {
        return localDenuncia;
    }

    public void setLocalDenuncia(String localDenuncia) {
        this.localDenuncia = localDenuncia;
    }

    public String getDescricaoDenuncia() {
        return descricaoDenuncia;
    }

    public void setDescricaoDenuncia(String descricaoDenuncia) {
        this.descricaoDenuncia = descricaoDenuncia;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getSetorDenuncia() {
        return setorDenuncia;
    }

    public void setSetorDenuncia(String setorDenuncia) {
        this.setorDenuncia = setorDenuncia;
    }

    public String getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(String tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public String getAssundoDenuncia() {
        return assundoDenuncia;
    }

    public void setAssundoDenuncia(String assundoDenuncia) {
        this.assundoDenuncia = assundoDenuncia;
    }
    
}
