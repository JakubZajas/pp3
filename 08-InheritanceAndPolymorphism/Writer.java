public class Writer {
    String firstName;
    String lastName;
    String genre;
    
    public Writer(String firstName, String lastname, String genre) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.genre = genre;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastname() {
        return lastName;
    }
    public void setLastname(String lastname) {
        lastName = lastname;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
