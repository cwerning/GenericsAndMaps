package common;

import java.util.Objects;


/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie implements Comparable<Movie> {
    private String title;
    private String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", director=" + director + '}';
    }
    
    
    
    @Override
    public int compareTo(Movie target) {
        return this.getTitle().compareTo(target.getTitle());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    
    

}
