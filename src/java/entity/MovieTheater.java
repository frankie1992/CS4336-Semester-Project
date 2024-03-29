package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Francisco
 */
@Entity
public class MovieTheater implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movieTheaterID;
    
    private String theaterId;
    private String movieId;

    public Long getMovieTheaterID() {
        return movieTheaterID;
    }

    public void setMovieTheaterID(Long movieTheaterID) {
        this.movieTheaterID = movieTheaterID;
    }

    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

}
