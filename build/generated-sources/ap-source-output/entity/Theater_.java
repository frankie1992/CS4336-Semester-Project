package entity;

import entity.Movie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-02T16:48:53")
@StaticMetamodel(Theater.class)
public class Theater_ { 

    public static volatile ListAttribute<Theater, Movie> movies;
    public static volatile SingularAttribute<Theater, String> zipCode;
    public static volatile SingularAttribute<Theater, Long> id;
    public static volatile SingularAttribute<Theater, String> theaterName;

}