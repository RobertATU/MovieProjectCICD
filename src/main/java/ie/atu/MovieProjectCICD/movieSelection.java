package ie.atu.MovieProjectCICD;

public class movieSelection {
    String title, genre;
    int ageRating, score;


    public movieSelection(String genre, int ageRating, int score) {
        if (genre.equals("Horror") || genre.equals("Action") || genre.equals("Comedy")) {
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Selection must be Horror, action, Comedy");
        }

        if(ageRating == (12) || ageRating == (15) || ageRating == (18)) {
            this.ageRating = ageRating;
        }
        else {
            throw new IllegalArgumentException("Age rating must be 12, 15 or 18");
        }

        if(score >= (10) ) {
            this.score = score;
        }
        else {
            throw new IllegalArgumentException("Score must be between 10 and 90");
        }


    }

    public String getGenre() {
        return genre;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public int getScore() {
        return score;
    }
}