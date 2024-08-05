package com.pdsc.model;

import com.pdsc.model.Denuncia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-08-05T16:00:04")
@StaticMetamodel(Servidor.class)
public class Servidor_ { 

    public static volatile SingularAttribute<Servidor, String> setor;
    public static volatile SingularAttribute<Servidor, String> senha;
    public static volatile SingularAttribute<Servidor, String> matricula;
    public static volatile SingularAttribute<Servidor, String> nome;
    public static volatile SingularAttribute<Servidor, Integer> id;
    public static volatile SingularAttribute<Servidor, String> cargo;
    public static volatile ListAttribute<Servidor, Denuncia> denuncias;

}