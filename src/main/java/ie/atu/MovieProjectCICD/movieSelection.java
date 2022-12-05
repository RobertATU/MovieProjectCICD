package ie.atu.MovieProjectCICD;

public class movieSelection {
    String title, genre, language;
    int ageRating, score;


    public movieSelection(String title, String genre, String language, int ageRating, int score) {
        if(title.equals("Pulp Fiction") || title.equals("pulp fiction") || title.equals("Pulp fiction"))
        {
            this.title = title;
        }

        else {
            throw new IllegalArgumentException("Movie could not be found");
        }

        if(genre.equals("Crime")|| genre.equals("crime"))
        {
            this.genre = genre;
        }

        else {
            throw new IllegalArgumentException("Genre does not match");
        }
    }





    public String getTitle(){
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }
    public int getAgeRating() {
        return ageRating;
    }

    public int getScore() {
        return score;
    }
}
