package com.pdsc.model;

import com.pdsc.model.Servidor;
import com.pdsc.model.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-08T20:38:04")
@StaticMetamodel(Denuncia.class)
public class Denuncia_ { 

    public static volatile SingularAttribute<Denuncia, String> tipoDenuncia;
    public static volatile SingularAttribute<Denuncia, Servidor> servidor;
    public static volatile SingularAttribute<Denuncia, String> setorDenuncia;
    public static volatile SingularAttribute<Denuncia, Usuario> usuario;
    public static volatile SingularAttribute<Denuncia, Integer> id;
    public static volatile SingularAttribute<Denuncia, String> assundoDenuncia;
    public static volatile SingularAttribute<Denuncia, String> descricaoDenuncia;
    public static volatile SingularAttribute<Denuncia, Date> dataDenuncia;
    public static volatile SingularAttribute<Denuncia, String> localDenuncia;

}